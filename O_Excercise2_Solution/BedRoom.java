package O_Excersice2;

import java.util.*;

public class BedRoom extends Room {

    Scanner scan = new Scanner(System.in);
    private int numberOfBed;

    public BedRoom() {
    }

    public BedRoom(String id, String name, double BaseCost) {
        super(id, name, BaseCost);
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.println("Number Of Bed:");
        setNumberOfBed(scan.nextInt());

    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.println("Number Of Bed:");
        setNumberOfBed(scan.nextInt());

    }

    @Override

    public void displayDetails() {
        super.displayDetails();
        System.out.println(", numberOfBeds: " + getNumberOfBed());
    }
}
