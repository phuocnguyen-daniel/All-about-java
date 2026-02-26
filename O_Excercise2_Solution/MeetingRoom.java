package O_Excersice2;

import java.util.*;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    Scanner scan = new Scanner(System.in);

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.println("Capacity:");
        setCapacity(scan.nextInt());

    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        scan.nextLine();
        System.out.println("Capacity:");
        setCapacity(scan.nextInt());

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.print("capacity: ");
        setCapacity(scan.nextInt());
    }
}
