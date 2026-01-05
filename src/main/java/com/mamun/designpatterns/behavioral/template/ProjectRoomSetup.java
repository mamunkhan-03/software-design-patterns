package com.mamun.designpatterns.behavioral.template;

class ProjectRoomSetup extends RoomSetup {

    @Override
    void applyDesign() {
        System.out.println("Applying functional design with whiteboards and workstations");
    }

    @Override
    void addFurniture() {
        System.out.println("Adding desks, chairs, monitors, and project tools");
    }
}