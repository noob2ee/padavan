package org.noob2ee.padavan.level4.structural.facade;

public class AccountService {

    public  int transferMoney(int from, int to, int money) {
        System.out.println("transfering money...");
        return money;
    }

    public int getAccount(String acc) {
        return Integer.valueOf(acc);
    }
}
