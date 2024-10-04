package com.pluarlsight;

import java.util.Scanner;

public class CellPhoneService {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*What is the serial number? 2597153
        What model is the phone? iPhone 15 Pro Max
        Who is the carrier? Verizon
        What is the phone number? 888-555-1234
        Who is the owner of the phone? Sandra
        */
        System.out.println("What is the serial number?");
        int serialNumber = scan.nextInt();
        System.out.println("What model is the phone?");
        scan.nextLine(); //Necessary
        String model = scan.nextLine();
        System.out.println("Who is the carrier?");
        String carrier = scan.nextLine();
        System.out.println("What is the phone number?");
        String phoneNumber = scan.nextLine();
        System.out.println("Who is the owner of the phone?");
        String owner = scan.nextLine();

        //Instantiate object
        CellPhone cellPhone1 = new CellPhone();
        //Setters
        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);
        //Print getters
        /*System.out.println("Serial Number" + cellPhone1.getSerialNumber());
        System.out.println(cellPhone1.getModel());;
        System.out.println(cellPhone1.getPhoneNumber());
        System.out.println(cellPhone1);*/


        //Method
        cellPhone1.printAll(cellPhone1.getSerialNumber(), cellPhone1.getModel(), cellPhone1.getCarrier(), cellPhone1.getPhoneNumber(), cellPhone1.getOwner());













    }
    //In your Main class, add a static method called display() that accepts a CellPhone object as a parameter.  (see below)
    public static void display(CellPhone phone) {
        System.out.println();
    }
}
