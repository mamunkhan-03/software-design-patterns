package com.mamun.designpatterns.behavioral.template;

class TTRoomSetup extends RoomSetup {

    @Override
    void applyDesign() {
        System.out.println("Applying sporty design with wall posters and floor mats");
    }

    @Override
    void addFurniture() {
        System.out.println("Adding table tennis table, net, paddles, and seating area");
    }
}