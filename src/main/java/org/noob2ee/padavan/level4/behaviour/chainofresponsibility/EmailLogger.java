package org.noob2ee.padavan.level4.behaviour.chainofresponsibility;

public class EmailLogger extends AbstractLogger {

    public EmailLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File logger: " + message);
    }
}
