package com.computer;

public class Main {
    public static void main(String[] args) {
        // Basic office computer
        Computer officePC = new Computer.Builder("Intel i5", "16GB")
            .setStorage("512GB SSD")
            .setWiFi(true)
            .build();

        // Gaming computer
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
            .setStorage("1TB NVMe SSD")
            .setGpu("NVIDIA RTX 3080")
            .setBluetooth(true)
            .setWiFi(true)
            .build();

        // Minimal server
        Computer server = new Computer.Builder("Xeon Silver", "64GB")
            .setStorage("2TB HDD")
            .build();

        System.out.println("=== Office PC ===");
        System.out.println(officePC);
        
        System.out.println("\n=== Gaming PC ===");
        System.out.println(gamingPC);
        
        System.out.println("\n=== Server ===");
        System.out.println(server);
    }
}