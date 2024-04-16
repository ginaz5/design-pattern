package creational.builder.not_use;

import creational.builder.HDD;
import creational.builder.RAM;

public class ComputerBefore {
    private HDD diskSize;
    private RAM ramSize;
    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public ComputerBefore() {

    }
    public HDD getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public void setRamSize(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public boolean hasUsbc() {
        return hasUsbc;
    }

    public void setHasUsbc(boolean hasUsbc) {
        this.hasUsbc = hasUsbc;
    }

    public boolean hasGigabitWifi() {
        return hasGigabitWifi;
    }

    public void setHasGigabitWifi(boolean hasGigabitWifi) {
        this.hasGigabitWifi = hasGigabitWifi;
    }
}
