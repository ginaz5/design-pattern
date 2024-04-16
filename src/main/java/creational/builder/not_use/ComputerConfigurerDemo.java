package creational.builder.not_use;

import creational.builder.HDD;
import creational.builder.RAM;

public class ComputerConfigurerDemo {

    public static void main (String [] args) {
        // use empty constructor and set the properties later
        // mutable properties after construction

        ComputerBefore computer = new ComputerBefore();
        computer.setDiskSize(HDD.DEFAULT);
        computer.setRamSize(RAM.DEFAULT);
        computer.setHasUsbc(true);
        computer.setHasGigabitWifi(true);

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.hasUsbc());
        System.out.println(computer.hasGigabitWifi());
    }
}
