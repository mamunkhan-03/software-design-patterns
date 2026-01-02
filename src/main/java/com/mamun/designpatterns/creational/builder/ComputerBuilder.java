package com.mamun.designpatterns.creational.builder;

public interface ComputerBuilder {
    ComputerBuilder addGPU(String gpu);
    ComputerBuilder addCoolingSystem(String coolingSystem);
    ComputerBuilder addSoundCard(String soundCard);
    ComputerBuilder addWifiCard(String wifiCard);
    ComputerBuilder addRGBLighting(String rgbLighting);
    ComputerBuilder addExtraFans(String extraFans);
    ComputerBuilder addAdditionalStorage(int storageTB);
    Computer build();
}