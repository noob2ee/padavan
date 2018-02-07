package org.noob2ee.padavan.level4.structural.facade;

public class AuthService {

    boolean auth(String login, String password) {
        System.out.println("authorizing client and hist credentials");
        if (login.equals("user") && password.equals("123")) {
            return true;
        }
        return false;
    }

}
