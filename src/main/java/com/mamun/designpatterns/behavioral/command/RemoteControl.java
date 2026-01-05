package com.mamun.designpatterns.behavioral.command;

//Invoker
public class RemoteControl {

    private Command[] commands;
    private Command lastCommand;

    public RemoteControl(int slots) {
        commands = new Command[slots];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
            lastCommand = commands[slot];
        } else {
            System.out.println("No command assigned to slot " + slot);
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            System.out.println("Undoing last command...");
            lastCommand.undo();
            lastCommand = null;
        } else {
            System.out.println("No command to undo");
        }
    }

    public void pressUndoSpecific(int slot) {
        if (commands[slot] != null) {
            System.out.println("Undoing the specific command...");
            commands[slot].undo();

        } else {
            System.out.println("No command to undo");
        }
    }
}
