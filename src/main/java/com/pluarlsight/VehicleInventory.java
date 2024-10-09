package com.pluarlsight;

import java.util.Arrays;
import java.util.Scanner;

public class VehicleInventory {
    //-	fill()  -  Fills an array with a specific value
    //-	equals()  -  Compares two arrays to determine if they are equal
    //-	binarySearch()  -  Efficiently searches an ordered array for a specific
    // value to find out where it is located
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public VehicleInventory () {

    }

    public VehicleInventory(long vehicleID, String makeModel, String color, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public long getVehicleID() {
        return vehicleID;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void addVehicle() {
        addedVehicleCount++;
        System.out.println("Vehicle Count: " + vehicleCount);

        //Set
        System.out.println("Enter in your Vehicle Information");
        System.out.println("Vehicle ID");
        setVehicleID(scan.nextLong());
        System.out.println("Make/Moddel: ");
        setMakeModel(scan.nextLine());
        System.out.println("Color: ");
        setColor(scan.nextLine());
        System.out.println("Odometer Reading: ");
        setOdometerReading(scan.nextInt());
        System.out.println("Price: ");
        setPrice(scan.nextFloat());
        //listAllVehicles(vehicles);
        System.out.println("Vehicle Count: " + vehicleCount);
        //Get
        /*for (vehicleCount = 6; vehicleCount < vehicles.length; vehicleCount++) {

        }*/
        //DELETE ITHISTHISTS
        Arrays.fill(vehicles,"Vehicle " + vehicleCount +": \nVehicle ID: " + getVehicleID() +
                "\nMake/Moddel: "+ getMakeModel() +
                "\nColor: " + getColor() +
                "\nOdometer Reading: " + getOdometerReading() +
                "\nPrice: " + getPrice());


        //String addVehicle = "" + getVehicleID() + "" + getMakeModel() + "" + getColor() + "" + getOdometerReading() + "" + getPrice();
        //System.out.println("Vehicle " + vehicleCount + ":\n" + addVehicle);

        //Print updated array
        listAllVehicles();
    }

    public void findVehicleByMakeModel () {
        //listAllVehicles(vehicles);
        //Arrays.fill(vehicle.);
        //vehicles.split(\\);
        for (int i = 0; i <= vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] firstSplit = vehicle.split("\n");
            System.out.println("-------------------------------------");
            //Possible issue
            //Old code was : System.out.println("Vehicle " + (i + 1) + "\n");
            int vehicleNumber = i + 1;
            System.out.println("Vehicle " + vehicleNumber + "\n");

            System.out.println(firstSplit[2]);
        }
    }
    public static void listAllVehicles () {//May need to remove parameter
        /*String[] vehicles = new String[20];
        vehicles = new String[]{"Vehicle 1: \nVehicle ID: 101121\nMake/Moddel: Ford Explorer\nColor: Red\nOdometer Reading: 45000\nPrice: 13500",
                "Vehicle 2: \nVehicle ID: 101122\nMake/Moddel: Toyota Camry\nColor: Blue\nOdometer Reading: 60000\nPrice: 11000",
                "Vehicle 3: \nVehicle ID: 101123\nMake/Moddel: Chevrolet Malibu\nColor: Black\nOdometer Reading: 50000\nPrice: 9700",
                "Vehicle 4: \nVehicle ID: 101124\nMake/Moddel: Honda Civic\nColor: White\nOdometer Reading: 70000\nPrice: 7500",
                "Vehicle 5: \nVehicle ID: 101125\nMake/Moddel: Subaru Outback\nColor: Green\nOdometer Reading: 55000\nPrice: 14500",
                "Vehicle 6: \nVehicle ID: 101126\nMake/Moddel: Jeep Wrangler\nColor: Yellow\nOdometer Reading: 30000\nPrice: 16000"
        };//6*/
       // vehicles;
        for (String vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println("-------------------------------------");
            //System.out.println("Number of Vehicles: " + vehicleCount);  This is in the switch
            //vehicleCount++;
        }

        //System.out.println("Number of Vehicles: " + vehicleCount);
        //return vehicles;
    }
    public void findVehiclesByPrice(String [] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] firstSplit = vehicle.split("\n");
            System.out.println("-------------------------------------");
            System.out.println("Vehicle " + (i + 1) + "\n");

            System.out.println(firstSplit[5]);
        }
        //for each w vehicle
    }

    public void findVehicleByColor () {
        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] firstSplit = vehicle.split("\n");
            System.out.println("-------------------------------------");
            System.out.println("Vehicle " + (i + 1) + "\n");

            System.out.println(firstSplit[3]);
        }

    }


    static Scanner scan = new Scanner(System.in);
    static String[] vehicles = {"Vehicle 1: \nVehicle ID: 101121\nMake/Moddel: Ford Explorer\nColor: Red\nOdometer Reading: 45000\nPrice: 13500",
            "Vehicle 2: \nVehicle ID: 101122\nMake/Moddel: Toyota Camry\nColor: Blue\nOdometer Reading: 60000\nPrice: 11000",
            "Vehicle 3: \nVehicle ID: 101123\nMake/Moddel: Chevrolet Malibu\nColor: Black\nOdometer Reading: 50000\nPrice: 9700",
            "Vehicle 4: \nVehicle ID: 101124\nMake/Moddel: Honda Civic\nColor: White\nOdometer Reading: 70000\nPrice: 7500",
            "Vehicle 5: \nVehicle ID: 101125\nMake/Moddel: Subaru Outback\nColor: Green\nOdometer Reading: 55000\nPrice: 14500",
            "Vehicle 6: \nVehicle ID: 101126\nMake/Moddel: Jeep Wrangler\nColor: Yellow\nOdometer Reading: 30000\nPrice: 16000",
            "", "", "", "", ""
    };//6
    static int addedVehicleCount = 0;
    static int vehicleCount = vehicles.length + addedVehicleCount; //Possible issue

    public static void main(String[] args) {
        VehicleInventory v1 = new VehicleInventory();

        //Might need to keep all in main
        //User scans to add veihicles

        // if returnToMainMenu = 'Y' or some boolean becomes true when 'Y'
        // do {} while loop == true
       // boolean loop = true;
        //while (loop) { //Problem: the Vehicle count increases by 6 everytime this loops
            System.out.println("What do you want to do?");
            System.out.println("  1 - List all vehicles");
            System.out.println("  2 - Search by make/model");
            System.out.println("  3 - Search by price range");
            System.out.println("  4 - Search by color");
            System.out.println("  5 - Add a vehicle");
            System.out.println("  6 - Quit");
            System.out.println("Enter your command: ");
            int response = scan.nextInt();
            switch (response) {
                case 1:
                    listAllVehicles();//May need to remove from method
                    /*System.out.println("Return to Main Menu? (y/n)");
                    char goToMainMenu = scan.next().charAt(0);
                    if (Character.toUpperCase(goToMainMenu) == 'n') {
                        loop = false;
                    }*/
                    System.out.println("Number of Vehicles: " + vehicleCount);
                    break;
                case 2:
                    v1.findVehicleByMakeModel();
                    break;
                case 3:
                    v1.findVehiclesByPrice(vehicles);
                    break;
                case 4:
                    v1.findVehicleByColor();
                    break;
                case 5:
                    v1.addVehicle();
                    System.out.println("Number of Vehicles: " + vehicleCount);
                    break;
                case 6:
                    return;
            }
       // }
        /*int response = scan.nextInt();
        if (response == 1) {
            System.out.println("Here are your vehicles: \n");
            getVehicles();
        }*/
        //VehicleInventory v1 = new VehicleInventory(setVehicles(vehicleID), );
        // v1.addVehicle();
        //if user addVehicle(), then vehicleCount++
        //split() to find make/model eg split("Make/Model: )


    }



    /*static String[] vehicles = {"Vehicle 1: \nVehicle ID: 101121\nMake/Moddel: Ford Explorer\nColor: Red\nOdometer Reading: 45000\nPrice: 13500",
            "Vehicle 2: \nVehicle ID: 101122\nMake/Moddel: Toyota Camry\nColor: Blue\nOdometer Reading: 60000\nPrice: 11000",
            "Vehicle 3: \nVehicle ID: 101123\nMake/Moddel: Chevrolet Malibu\nColor: Black\nOdometer Reading: 50000\nPrice: 9700",
            "Vehicle 4: \nVehicle ID: 101124\nMake/Moddel: Honda Civic\nColor: White\nOdometer Reading: 70000\nPrice: 7500",
            "Vehicle 5: \nVehicle ID: 101125\nMake/Moddel: Subaru Outback\nColor: Green\nOdometer Reading: 55000\nPrice: 14500",
            "Vehicle 6: \nVehicle ID: 101126\nMake/Moddel: Jeep Wrangler\nColor: Yellow\nOdometer Reading: 30000\nPrice: 16000",
            *//*"Vehicle 7: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 8: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 9: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 10: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 11: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 12: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 13: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 14: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 15: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 16: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 17: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 18: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 19: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",
            "Vehicle 20: \nVehicle ID: \nMake/Moddel: \nColor: \nOdometer Reading: \nPrice: ",*//*
    };//6*/


}
