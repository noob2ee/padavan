package org.noob2ee.padavan.level4.structural.facade;

public class Main {
    public static void main(String[] args) {

        BankApi bankApi = new BankApi(new AccountService(), new AuthService(), new ValidationService());

        bankApi.login("user", "123");
        bankApi.transfer("0001", "0002", 65);
    }
}
