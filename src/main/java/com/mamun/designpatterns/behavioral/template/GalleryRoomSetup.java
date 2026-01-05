package com.mamun.designpatterns.behavioral.template;

public class GalleryRoomSetup  extends RoomSetup{

    @Override
    void applyDesign() {
        System.out.println("Applying artistic design with wall paintings and display lighting");
    }

    @Override
    void addFurniture() {
        System.out.println("Adding display stands, benches, and lighting fixtures");
    }
}
