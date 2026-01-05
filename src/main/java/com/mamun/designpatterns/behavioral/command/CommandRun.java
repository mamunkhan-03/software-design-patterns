package com.mamun.designpatterns.behavioral.command;

public class CommandRun {

    public static void run (){

        // Create receivers (devices)
        Light livingRoomLight = new Light("Living Room");
        Light bedroomLight = new Light("Bedroom");
        AirConditioner livingRoomAC = new AirConditioner("Living Room");
        Television livingRoomTV = new Television("Living Room");

        // Create commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command bedroomLightOn = new LightOnCommand(bedroomLight);
        Command acOn = new ACOnCommand(livingRoomAC);
        Command acSetTemp = new ACTemperatureCommand(livingRoomAC, 22);
        Command tvOn = new TVOnCommand(livingRoomTV);


        // Create remote control
        RemoteControl remote = new RemoteControl(10);

        // Assign commands to buttons
        remote.setCommand(0, livingRoomLightOn);
        remote.setCommand(1, livingRoomLightOff);
        remote.setCommand(2, bedroomLightOn);
        remote.setCommand(3, acOn);
        remote.setCommand(4, acSetTemp);
        remote.setCommand(5, tvOn);



        remote.pressButton(0);  // Living room light ON

        remote.pressButton(3);  // AC ON

        remote.pressButton(4);  // Set AC temperature

        remote.pressButton(5);  // TV ON

        remote.pressUndo();  //TV Off
        remote.pressUndoSpecific(4);

    }
}
