package devices;

public class Light implements SmartDevice {
    private boolean status = false;
    private int id;

    public Light(int id) {
        this.id = id;
    }

    @Override
    public void turnOn() {
        status = true;
    }

    @Override
    public void turnOff() {
        status = false;
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + (status ? "On" : "Off");
    }
}
