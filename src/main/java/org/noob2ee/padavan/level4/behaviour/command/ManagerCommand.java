package org.noob2ee.padavan.level4.behaviour.command;

import java.util.Iterator;
import java.util.LinkedList;

//Invoker
public class ManagerCommand {
    private LinkedList<Command> redo = new LinkedList<>();
    private LinkedList<Command> undo = new LinkedList<>();

    public void addCommand(Command command) {
        redo.add(command);
    }

    public void runAll() {
        for (Command command : redo) {
            command.execute();
            undo.add(command);
        }
    }

    public void redo() {
        Command last = redo.getLast();
        last.execute();
        undo.add(last);
    }

    public void undo() {
        Command last = undo.getLast();
        last.execute();
        redo.add(last);
    }

    public void runNext() {
        Iterator<Command> iterator = undo.iterator();
        if (iterator.hasNext()) {
            iterator.next().execute();
        } else {
            throw new RuntimeException("there are no commands in the queue");
        }
    }

}
