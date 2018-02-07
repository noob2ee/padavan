package org.noob2ee.padavan.level4.behaviour.state;

public class UnderTestState implements State {
    private ChangeRequestContext context;

    public UnderTestState(ChangeRequestContext context) {
        this.context = context;
    }

    public void assignToDev() {
        this.context.updateState(new UnderDevState(context));
        System.out.println("SUCCESS! Assigning Back to Developer.");
    }

    public void assignToTester() {
        System.out.println("WARNING! Cannot be done as already under test.");
    }

    public void markTested() {
        this.context.updateState(new ClosedState(context));
        System.out.println("SUCCESS! Marking as tested.");
    }
}