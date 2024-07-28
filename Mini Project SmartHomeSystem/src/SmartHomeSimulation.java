import devices.*;
import factory.SmartDeviceFactory;
import observer.SmartHomeHub;
import proxy.SmartDeviceProxy;

public class SmartHomeSimulation {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        
        SmartDevice light = SmartDeviceFactory.createDevice("light", 1);
        SmartDevice thermostat = SmartDeviceFactory.createDevice("thermostat", 2);
        SmartDevice door = SmartDeviceFactory.createDevice("door", 3);

        SmartDeviceProxy lightProxy = new SmartDeviceProxy(light);
        SmartDeviceProxy thermostatProxy = new SmartDeviceProxy(thermostat);
        SmartDeviceProxy doorProxy = new SmartDeviceProxy(door);

        hub.addObserver(() -> System.out.println(lightProxy.getStatus()));
        hub.addObserver(() -> System.out.println(thermostatProxy.getStatus()));
        hub.addObserver(() -> System.out.println(doorProxy.getStatus()));

        // Turn on devices
        lightProxy.turnOn();
        thermostatProxy.turnOn();
        doorProxy.turnOff();

        // Notify observers
        hub.notifyObservers();
    }
}
