package org.noob2ee.padavan.level4.behaviour.command;

public class AddBeforeCommand implements Command {

    private Document document;
    private String strToAdd;
    private String before;
    private String after;

    public AddBeforeCommand(Document document, String args) {
        this.document = document;
        this.strToAdd = args;
    }

    @Override
    public void execute() {
        document.addStringBefore(strToAdd);

    }

    @Override
    public void undo() {
//        throw new RuntimeException("it doesn't have reverse operation");
        document.removeStringBefore(strToAdd);
    }
}
