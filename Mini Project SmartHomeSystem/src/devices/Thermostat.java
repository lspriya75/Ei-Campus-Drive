package devices;

public class Thermostat implements SmartDevice {
    private int temperature = 70;
    private int id;

    public Thermostat(int id) {
        this.id = id;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        // Thermostat specific on action
    }

    @Override
    public void turnOff() {
        // Thermostat specific off action
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees.";
    }
}
