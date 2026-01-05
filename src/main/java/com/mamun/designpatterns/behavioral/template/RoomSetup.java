package com.mamun.designpatterns.behavioral.template;

public abstract class RoomSetup {

    public final void setupRoom() {
        buildWalls();
        buildRoof();
        applyDesign();
        addFurniture();
        notifyCompletion();
    }

    abstract void applyDesign();
    abstract void addFurniture();

    // Common methods
    void buildWalls() {
        System.out.println("Building walls of the room...");
    }

    void buildRoof() {
        System.out.println("Constructing the roof...");
    }

    void notifyCompletion() {
        System.out.println("Room setup completed and ready for use!");
    }

}
