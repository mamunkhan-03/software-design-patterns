package com.mamun.designpatterns.creational.builder;

public class PCBuilder implements ComputerBuilder {

    // Required components
    private String cpu;
    private String motherboard;
    private String ram;
    private String storage;
    private String powerSupply;
    private String pcCase;

    // Optional components
    private String gpu;
    private String coolingSystem;
    private String soundCard;
    private String wifiCard;
    private String rgbLighting;
    private String extraFans;
    private int additionalStorage;

    // Constructor for required components
    public PCBuilder(String cpu, String motherboard, String ram,
                     String storage, String powerSupply, String pcCase) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.storage = storage;
        this.powerSupply = powerSupply;
        this.pcCase = pcCase;
    }

    @Override
    public ComputerBuilder addGPU(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public ComputerBuilder addCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
        return this;
    }

    @Override
    public ComputerBuilder addSoundCard(String soundCard) {
        this.soundCard = soundCard;
        return this;
    }

    @Override
    public ComputerBuilder addWifiCard(String wifiCard) {
        this.wifiCard = wifiCard;
        return this;
    }

    @Override
    public ComputerBuilder addRGBLighting(String rgbLighting) {
        this.rgbLighting = rgbLighting;
        return this;
    }

    @Override
    public ComputerBuilder addExtraFans(String extraFans) {
        this.extraFans = extraFans;
        return this;
    }

    @Override
    public ComputerBuilder addAdditionalStorage(int storageTB) {
        this.additionalStorage = storageTB;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(this);
    }

    // Package-private getters for Computer class
    String getCpu() { return cpu; }
    String getMotherboard() { return motherboard; }
    String getRam() { return ram; }
    String getStorage() { return storage; }
    String getPowerSupply() { return powerSupply; }
    String getPcCase() { return pcCase; }
    String getGpu() { return gpu; }
    String getCoolingSystem() { return coolingSystem; }
    String getSoundCard() { return soundCard; }
    String getWifiCard() { return wifiCard; }
    String getRgbLighting() { return rgbLighting; }
    String getExtraFans() { return extraFans; }
    int getAdditionalStorage() { return additionalStorage; }

}