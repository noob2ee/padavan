package org.noob2ee.padavan.level4.structural.facade;

public class BankApi {

    private AccountService accountService;
    private AuthService authService;
    private ValidationService validationService;

    private boolean isLoggedIn = false;

    public BankApi(AccountService accountService, AuthService authService, ValidationService validationService) {
        this.accountService = accountService;
        this.authService = authService;
        this.validationService = validationService;
    }

    public boolean login(String login, String password) {
        if (validationService.validate(login) && authService.auth(login, password)) {
            isLoggedIn = true;
        }
        return isLoggedIn;
    }

    public boolean transfer(String from, String to, int amount) {
        if (!isLoggedIn) {
            System.out.println("Please login first");
            return false;
        }
        int accountFrom = accountService.getAccount(from);
        int accountTo = accountService.getAccount(to);
        accountService.transferMoney(accountFrom, accountTo, amount);
        System.out.println("Transfer completed succesfull");
        return true;
    }
}
