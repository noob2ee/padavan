package org.noob2ee.padavan.level4.behaviour.command;

//Receiver - know how to perform actions
public class Document {

    private StringBuffer document = new StringBuffer("test");

    public void addStringBefore(String str) {
        document = new StringBuffer(str).append(document);
    }

    public void removeStringBefore(String str) {
        document = new StringBuffer(str).replace(0, str.length(), "");
    }

    public void insertString(String str, int position) {
        document.insert(position, str);
    }

    public void addStringAfter(String str) {
        document.append(str);
    }

    public void output(String str) {
        System.out.println("Operation [ " + str + " ]: result = " + document.toString());
    }

    public String print() {
        return document.toString();
    }
}
