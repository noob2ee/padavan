package org.noob2ee.padavan.level4.behaviour.state;

public class ChangeRequestContext {
    private State currentState = new NewState(this);

    public ChangeRequestContext() {
    }

    public void updateState(State newState) {
        this.currentState = newState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void assignToDev() {
        currentState.assignToDev();
    }

    public void assignToTester() {
        currentState.assignToTester();
    }

    public void markTested() {
        currentState.markTested();
    }
}
