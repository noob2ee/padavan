package org.noob2ee.padavan.level4.behaviour.state;

public class NewState implements State {
    private ChangeRequestContext context;

    public NewState(ChangeRequestContext crSystem) {
        this.context = crSystem;
    }

    public void assignToDev() {
        this.context.updateState(new UnderDevState(context));
        System.out.println("SUCCESS! Assigning to available developer.");
    }

    public void assignToTester() {
        System.out.println("ERROR! Cannot be assigned to tester from new state.");
    }

    public void markTested() {
        System.out.println("ERROR! Cannot be marked tested when it is new.");
    }
}
