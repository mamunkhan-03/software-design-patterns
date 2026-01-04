package com.mamun.designpatterns.behavioral.template;

public class ConferenceRoomSetup extends RoomSetup{

    @Override
    void applyDesign() {
        System.out.println("Applying modern design with projector screen and whiteboard");
    }

    @Override
    void addFurniture() {
        System.out.println("Adding conference table, chairs, and audio system");
    }
}
