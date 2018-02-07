package org.noob2ee.padavan.level4.behaviour.state;

public class UnderDevState implements State {
    private ChangeRequestContext context;

    public UnderDevState(ChangeRequestContext context) {
        this.context = context;
    }

    public void assignToDev() {
        System.out.println("WARNING! It's already assigned to a developer.");
    }

    public void assignToTester() {
        this.context.updateState(new UnderTestState(context));
        System.out.println("SUCCESS! Assigning to available tester.");
    }

    public void markTested() {
        System.out.println("ERROR! Cannot be marked tested when it is under dev.");
    }
}