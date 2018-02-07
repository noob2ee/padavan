package org.noob2ee.padavan.level4.behaviour.state;

public class ClosedState implements State {
    private ChangeRequestContext context;

    public ClosedState(ChangeRequestContext context) {
        this.context = context;
    }

    public void assignToDev() {
        System.out.println("ERROR! Cannot be done as CR is closed.");
    }

    public void assignToTester() {
        System.out.println("ERROR! Cannot be done as CR is closed.");
    }

    public void markTested() {
        System.out.println("ERROR! Cannot be done as CR is closed.");
    }
}
