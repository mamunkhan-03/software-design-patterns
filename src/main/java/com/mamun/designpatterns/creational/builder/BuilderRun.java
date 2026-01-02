package com.mamun.designpatterns.creational.builder;

public class BuilderRun {

    public static void run() {

        PCBuildExpert expert = new PCBuildExpert();

        System.out.println(" High-End Gaming PC: ");
        ComputerBuilder gamingBuild = new PCBuilder(
                "Intel Core i9-13900K",
                "ASUS ROG Maximus Z790",
                "32GB DDR5-6000",
                "2TB NVMe Gen4 SSD",
                "1000W 80+ Gold Modular",
                "Lian Li O11 Dynamic EVO"
        );
        Computer gamingPC = expert.buildGamingPC(gamingBuild);
        gamingPC.displaySpecs();

        System.out.println("Professional Workstation : ");
        ComputerBuilder workstationBuild = new PCBuilder(
                "AMD Ryzen 9 7950X",
                "ASUS ProArt X670E",
                "64GB DDR5-5600 ECC",
                "2TB NVMe Gen4 SSD",
                "850W 80+ Platinum",
                "Fractal Design Define 7"
        );
        Computer workstationPC = expert.buildWorkstationPC(workstationBuild);
        workstationPC.displaySpecs();

        // Custom Build
        System.out.println("Custom Enthusiast Build : ");
        ComputerBuilder customBuild = new PCBuilder(
                "AMD Ryzen 7 7800X3D",
                "MSI MAG B650 TOMAHAWK",
                "32GB DDR5-6000",
                "1TB NVMe Gen4 SSD",
                "750W 80+ Gold",
                "NZXT H7 Flow"
        );
        Computer customPC = customBuild
                .addGPU("AMD Radeon RX 7900 XTX")
                .addCoolingSystem("Arctic Liquid Freezer II 280")
                .addWifiCard("Intel AX210 WiFi 6E")
                .addRGBLighting("ASUS Aura Sync RGB Kit")
                .addAdditionalStorage(2)
                .build();
        customPC.displaySpecs();
    }
}