package com.mamun.designpatterns.creational.builder;

public class PCBuildExpert {

    public Computer buildGamingPC(ComputerBuilder builder) {
        System.out.println("Building High-End Gaming PC...");
        return builder
                .addGPU("NVIDIA RTX 4080 16GB")
                .addCoolingSystem("NZXT Kraken X63 AIO Liquid Cooler")
                .addWifiCard("WiFi 6E PCIe Card")
                .addRGBLighting("Corsair iCUE RGB Strips")
                .addExtraFans("3x 120mm RGB Fans")
                .build();
    }

    public Computer buildWorkstationPC(ComputerBuilder builder) {
        System.out.println("Building Professional Workstation...");
        return builder
                .addGPU("NVIDIA RTX A4000 16GB")
                .addCoolingSystem("Noctua NH-D15 Air Cooler")
                .addSoundCard("Creative Sound Blaster AE-9")
                .addAdditionalStorage(4)
                .build();
    }

}