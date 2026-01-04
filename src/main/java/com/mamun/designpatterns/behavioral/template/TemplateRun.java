package com.mamun.designpatterns.behavioral.template;

public class TemplateRun {

    public static void run (){
        RoomSetup conferenceRoom = new ConferenceRoomSetup();
        System.out.println("Setting up Conference Room:");
        conferenceRoom.setupRoom();

        System.out.println("\nSetting up Gallery Room:");
        RoomSetup galleryRoom = new GalleryRoomSetup();
        galleryRoom.setupRoom();

        System.out.println("\nSetting up Project Room:");
        RoomSetup projectRoom = new ProjectRoomSetup();
        projectRoom.setupRoom();

        System.out.println("\nSetting up Pool Room:");
        RoomSetup poolRoom = new PoolRoomSetup();
        poolRoom.setupRoom();

        System.out.println("\nSetting up Table Tennis Room:");
        RoomSetup ttRoom = new TTRoomSetup();
        ttRoom.setupRoom();
    }
}
