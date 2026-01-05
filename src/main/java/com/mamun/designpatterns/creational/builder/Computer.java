package com.mamun.designpatterns.creational.builder;

public class Computer {

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

    Computer(PCBuilder builder) {
        this.cpu = builder.getCpu();
        this.motherboard = builder.getMotherboard();
        this.ram = builder.getRam();
        this.storage = builder.getStorage();
        this.powerSupply = builder.getPowerSupply();
        this.pcCase = builder.getPcCase();

        // Optional
        this.gpu = builder.getGpu();
        this.coolingSystem = builder.getCoolingSystem();
        this.soundCard = builder.getSoundCard();
        this.wifiCard = builder.getWifiCard();
        this.rgbLighting = builder.getRgbLighting();
        this.extraFans = builder.getExtraFans();
        this.additionalStorage = builder.getAdditionalStorage();
    }

    public void displaySpecs() {
        System.out.println("   PC BUILD SPECIFICATIONS: ");
        System.out.println("   CORE COMPONENTS:");
        System.out.println("   • CPU: " + cpu);
        System.out.println("   • Motherboard: " + motherboard);
        System.out.println("   • RAM: " + ram);
        System.out.println("   • Storage: " + storage);
        System.out.println("   • Power Supply: " + powerSupply);
        System.out.println("   • Case: " + pcCase);

        if (gpu != null || coolingSystem != null || soundCard != null ||
                wifiCard != null || rgbLighting != null || extraFans != null ||
                additionalStorage > 0) {
            System.out.println("\n   OPTIONAL UPGRADES:");
            if (gpu != null) System.out.println("   GPU: " + gpu);
            if (coolingSystem != null) System.out.println("   Cooling: " + coolingSystem);
            if (soundCard != null) System.out.println("   Sound Card: " + soundCard);
            if (wifiCard != null) System.out.println("   WiFi: " + wifiCard);
            if (rgbLighting != null) System.out.println("   RGB Lighting: " + rgbLighting);
            if (extraFans != null) System.out.println("   Extra Fans: " + extraFans);
            if (additionalStorage > 0) System.out.println("   Additional Storage: " + additionalStorage + "TB");
        }
        System.out.println("\n\n");
    }
}