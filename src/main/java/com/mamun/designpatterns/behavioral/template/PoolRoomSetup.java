package com.mamun.designpatterns.behavioral.template;

class PoolRoomSetup extends RoomSetup {

    @Override
    void applyDesign() {
        System.out.println("Applying recreational design with bright walls and cozy flooring");
    }

    @Override
    void addFurniture() {
        System.out.println("Adding pool table, cues, and seating area");
    }
}
