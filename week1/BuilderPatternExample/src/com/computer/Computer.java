package com.computer;

public class Computer {

    private final String cpu;
    private final String ram;
    
   
    private final String storage;
    private final String gpu;
    private final boolean hasBluetooth;
    private final boolean hasWiFi;

    
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWiFi = builder.hasWiFi;
    }

    // Getters
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public String getGpu() { return gpu; }
    public boolean hasBluetooth() { return hasBluetooth; }
    public boolean hasWiFi() { return hasWiFi; }

    @Override
    public String toString() {
        return "Computer:\n" +
               "• CPU: " + cpu + "\n" +
               "• RAM: " + ram + "\n" +
               (storage != null ? "• Storage: " + storage + "\n" : "") +
               (gpu != null ? "• GPU: " + gpu + "\n" : "") +
               "• Bluetooth: " + hasBluetooth + "\n" +
               "• WiFi: " + hasWiFi;
    }

    // Builder Class
    public static class Builder {
        // Required parameters
        private final String cpu;
        private final String ram;
        
        // Optional parameters
        private String storage;
        private String gpu;
        private boolean hasBluetooth;
        private boolean hasWiFi;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}