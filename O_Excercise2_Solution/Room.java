package O_Excersice2;

import java.util.*;
import java.text.*;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;

    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    Scanner scan = new Scanner(System.in);

    @Override

    public void addRoom() {
        System.out.println("ID:");
        setId(scan.nextLine());
        System.out.println("Name");
        setName(scan.nextLine());
        System.out.println("baseCost:");
        setBaseCost(scan.nextDouble());
        
    }
    @Override
    public void updateRoom(){
        scan.nextLine();
        System.out.println("ID:");
        setId(scan.nextLine());
        System.out.println("Name");
        setName(scan.nextLine());
        System.out.println("baseCost:");
        setBaseCost(scan.nextDouble());
    }
    @Override
    public void displayDetails(){
        System.out.println("ID:"+getId()+"Name:"+getName()+"baseCost:"+getBaseCost());
    }
    
}
