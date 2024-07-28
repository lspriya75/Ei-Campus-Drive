package proxy;

import devices.SmartDevice;

public class SmartDeviceProxy implements SmartDevice {
    private SmartDevice device;

    public SmartDeviceProxy(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        System.out.println("Accessing device...");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Accessing device...");
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }
}
