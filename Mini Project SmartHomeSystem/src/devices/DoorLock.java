package devices;

public class DoorLock implements SmartDevice {
    private boolean locked = true;
    private int id;

    public DoorLock(int id) {
        this.id = id;
    }

    @Override
    public void turnOn() {
        locked = false; // Unlock the door
    }

    @Override
    public void turnOff() {
        locked = true; // Lock the door
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (locked ? "Locked" : "Unlocked");
    }
}
