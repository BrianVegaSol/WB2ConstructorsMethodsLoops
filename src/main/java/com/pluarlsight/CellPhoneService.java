package com.pluarlsight;

import java.util.Scanner;

public class CellPhoneService {
    static Scanner scan = new Scanner(System.in);
    //making vars static to pass this to dial method
    static int serialNumber;
    static String model;
    static String carrier;
    static String phoneNumber;
    static String owner;
    static int displayCall = 0;
    static int myCount = 0;

    public static void main(String[] args) {
        /*What is the serial number? 2597153
        What model is the phone? iPhone 15 Pro Max
        Who is the carrier? Verizon
        What is the phone number? 888-555-1234
        Who is the owner of the phone? Sandra
        */
        System.out.println("What is the serial number?");
        serialNumber = scan.nextInt();
        if (serialNumber == 0) {
            myVars();
        } else {
            System.out.println("What model is the phone?");
            scan.nextLine(); //Necessary
            model = scan.nextLine();
            System.out.println("Who is the carrier?");
            carrier = scan.nextLine();
            System.out.println("What is the phone number?");
            phoneNumber = scan.nextLine();
            System.out.println("Who is the owner of the phone?");
            owner = scan.nextLine();
        }

        //Instantiate object
        CellPhone cellPhone1 = new CellPhone();
        if (myCount == 1){
            cellPhone1.setSerialNumber(2597153);
            cellPhone1.setModel("iPhone 15 Pro Max");
            cellPhone1.setCarrier("Verizon");
            cellPhone1.setPhoneNumber("888-555-1234");
            cellPhone1.setOwner("Sandra");
        } else {
        //Setters from user
        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);
        }

        //Setters for Pre-defined user
        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(01234567);//maybe use long if irl
        cellPhone2.setModel("Galaxy S12");
        cellPhone2.setCarrier("Verison");
        cellPhone2.setPhoneNumber("480-555-8888");
        cellPhone2.setOwner("Danny");
        //Print getters
        /*System.out.println("Serial Number" + cellPhone1.getSerialNumber());
        System.out.println(cellPhone1.getModel());;
        System.out.println(cellPhone1.getPhoneNumber());
        System.out.println(cellPhone1);*/


        //Method
        //cellPhone1.printAll(cellPhone1.getSerialNumber(), cellPhone1.getModel(), cellPhone1.getCarrier(), cellPhone1.getPhoneNumber(), cellPhone1.getOwner());
        display(cellPhone1);
        display(cellPhone2);
        System.out.println();
        cellPhone2.dial(cellPhone1.getOwner(), cellPhone1.getPhoneNumber());

        //Ex3
        CellPhone cellPhone3 = new CellPhone();
        cellPhone3.setSerialNumber(4599548);//maybe use long if irl
        cellPhone3.setModel("Google Pixel");
        cellPhone3.setCarrier("Cricket");
        cellPhone3.setPhoneNumber("900-000-1111");
        cellPhone3.setOwner("Koolie");
        //setVars(cellPhone3);
        cellPhone3.dial(cellPhone3.getOwner(), cellPhone3.getPhoneNumber());
        System.out.println();
        display(cellPhone3);
        //Overloaded dial
        cellPhone3.dial(cellPhone1);












    }
    //In your Main class, add a static method called display() that accepts a CellPhone object as a parameter.  (see below)
    public static void display(CellPhone phone) {
        displayCall++;
        System.out.println("--------------------");
        System.out.println(phone.getOwner() + "'s Info (Call # " + displayCall + ")");
        //phone.printAll(serialNumber, model, carrier, phoneNumber , owner);
        phone.printAll(phone.getSerialNumber(), phone.getModel(),phone.getCarrier(), phone.getPhoneNumber(), phone.getOwner());
    }


    //Ex3
    //Legacy after printAll() was fixed by applying phone.get to display()
    /*public static void setVars (CellPhone phone){
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);
    }*/

    public static void myVars(){
        myCount ++;
        //TIL Text Block!
        System.out.println("""
                Serial Number: 123456789
                Model: Samsung Galaxy Note 9
                Carrier: Mint
                Phone Number: 602-555-7777
                Owner Name: Brian Ve""");
    }

    //++ a tempVar everytime a method is called??? OR if newObject created ++ tempVar
    // if setVars/Cellphone cellphone[] called, then ++ so the [] changes and userInput is for that particular cellPhone[]
    //Make an array of CellPhone cellPhone objects and loop through array???



}
