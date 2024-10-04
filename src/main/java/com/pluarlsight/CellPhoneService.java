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

    public static void main(String[] args) {
        /*What is the serial number? 2597153
        What model is the phone? iPhone 15 Pro Max
        Who is the carrier? Verizon
        What is the phone number? 888-555-1234
        Who is the owner of the phone? Sandra
        */
        System.out.println("What is the serial number?");
        serialNumber = scan.nextInt();
        System.out.println("What model is the phone?");
        scan.nextLine(); //Necessary
        model = scan.nextLine();
        System.out.println("Who is the carrier?");
        carrier = scan.nextLine();
        System.out.println("What is the phone number?");
        phoneNumber = scan.nextLine();
        System.out.println("Who is the owner of the phone?");
        owner = scan.nextLine();

        //Instantiate object
        CellPhone cellPhone1 = new CellPhone();
        //Setters from user
        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);
        //Setters for Pre-defined user
        CellPhone cellPhone2 = new CellPhone();
        cellPhone1.setSerialNumber(01234567);//maybe use long if irl
        cellPhone1.setModel("Galaxy S12");
        cellPhone1.setCarrier("Verison");
        cellPhone1.setPhoneNumber("480-555-8888");
        cellPhone1.setOwner("Danny");
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












    }
    //In your Main class, add a static method called display() that accepts a CellPhone object as a parameter.  (see below)
    public static void display(CellPhone phone) {
        phone.printAll(serialNumber, model, carrier, phoneNumber , owner);
    }
}
