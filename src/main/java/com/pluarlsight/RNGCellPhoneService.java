package com.pluarlsight;

import java.util.Random;
import java.util.Scanner;

public class RNGCellPhoneService {
    static Scanner scan = new Scanner(System.in);
    //making vars static to pass this to dial method
    static int serialNumber;
    static String model;
    static String carrier;
    static String phoneNumber;
    static String owner;
    //Trying same as callCount here and IT ALSO WOOOORKEDDD
    static int objectCount = 0;

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
            RNGCellPhone.myVars();
        } else {
            //System.out.println("What is the serial number?");
            // serialNumber = scan.nextInt();
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
        RNGCellPhone cellPhone1 = new RNGCellPhone();
        //System.out.println(RNGCellPhone.callCount); Used to test if callCount was working
        //Code was breaking here bc display was not updated with new if ()
        if (RNGCellPhone.callCount >= 1) {
        populateVars(cellPhone1);
        }else{
            //Setters from user's manual inputs
            cellPhone1.setSerialNumber(serialNumber);
            cellPhone1.setModel(model);
            cellPhone1.setCarrier(carrier);
            cellPhone1.setPhoneNumber(phoneNumber);
            cellPhone1.setOwner(owner);
        }
        //Setters for Pre-defined user
        RNGCellPhone cellPhone2 = new RNGCellPhone();
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
        //System.out.println("------------------");
        display(cellPhone2);
        cellPhone2.dial(cellPhone1.getOwner(), cellPhone1.getPhoneNumber());


        //Ex3
        RNGCellPhone cellPhone3 = new RNGCellPhone();
        setVars(cellPhone3);
        cellPhone3.dial(cellPhone1.getOwner(), cellPhone1.getPhoneNumber());
        display(cellPhone3);


    }

    //In your Main class, add a static method called display() that accepts a CellPhone object as a parameter.  (see below)
    public static void display(RNGCellPhone phone) {
        //int objectCount = 0; maybe make this static??
        objectCount ++;
        System.out.println("------------------");
        System.out.println("Info for Object " + objectCount + ":");
        if(RNGCellPhone.callCount >= 1){
            //System.out.println(populateVars(););
            populateVars(phone);
            printPopVars(phone);
        }else {
            phone.printAll(serialNumber, model, carrier, phoneNumber, owner);
        }
    }

    //Use a RNG to populate serial# (up to 9 #9s), phone$ (3RNG-3RNG-4RNG), carrier & owner (String [] preset names, )
    public static void populateVars(RNGCellPhone phone) {
        //separate into many popVars?
        //RNG
        Random rand = new Random();
        //int random0to9 = rand.nextInt(10) + 1; +1 makes this 1-10
        int randomPhoneNumP1 = rand.nextInt(900) + 100;//100-999
        int randomPhoneNumP2 = rand.nextInt(900) + 100;//100-999
        int randomPhoneNumP3 = rand.nextInt(9000) + 1000;//1000-9999
        int randomSerialNum = rand.nextInt(900_000_000) + 100_000_000;//100,000,000 and 999,999,999
        //int randomCarriers = rand.nextInt(10); //0-(10 - 1) so 0-9

        //For each and RNG planning unnecessary, Just do:
        //make String []s
        String[] carriers = {"T-Mobile", "Verizon", "At&T", "Mint", "Boost", "Cricket", "Visible", "Metro PCS", "Google Fi", "Straight Talk"}; //10
        String[] owners = {"Alice", "Bob", "Charlie", "David", "Eve",
                "Fiona", "George", "Hannah", "Ian", "Julia",
                "Kevin", "Liam", "Mia", "Noah", "Olivia",
                "Paul", "Quinn", "Rachel", "Sam", "Tina"};//20
        String[] models = {"Samsung Galaxy Z Fold 4",
                "iPhone 14 Pro Max",
                "Google Pixel 7",
                "OnePlus 10 Pro",
                "Xiaomi Mi 12",
                "Sony Xperia 1 IV",
                "Oppo Find X5 Pro",
                "Nokia G50",
                "Motorola Edge 30",
                "Huawei P50 Pro",
                "Realme GT 2 Pro",
                "Asus ROG Phone 6",
                "LG Wing 5G",
                "Vivo X80 Pro",
                "ZTE Axon 20",
                "Honor Magic 4 Pro",
                "Samsung Galaxy S22 Ultra",
                "iPhone SE (3rd generation)",
                "Google Pixel 6a",
                "OnePlus Nord 2"};

        int randomCarriers = rand.nextInt(carriers.length); //S U  S
        int randomOwners = rand.nextInt(owners.length);
        int randomModels = rand.nextInt(models.length);

        //Parse to String??? Yes, for phone#

        String phoneNumP1 = Integer.toString(randomPhoneNumP1);
        String phoneNumP2 = Integer.toString(randomPhoneNumP2);
        String phoneNumP3 = Integer.toString(randomPhoneNumP3);

        //for each, set
        //must remove String[] owner??? maybe only if lastName was included?
        //LOL for each is not necessary with RNG just do:
        phone.setSerialNumber(randomSerialNum);
        phone.setModel(models[randomModels]);
        phone.setCarrier(carriers[randomCarriers]);
        phone.setPhoneNumber("(" + phoneNumP1 + ")" + "-" + phoneNumP2 + "-" + phoneNumP3);
        phone.setOwner(owners[randomOwners]);
        //if need to remove use StringBuilder? sb.delete(0, 8); // Deletes characters from index 0 to 7
    }
    //Side notes
    //To sout a # with commas eg: 1,111
    //split every 3rd #??? or in this case, use the 100-999RNG + "," + ...
    //but will mess up when digit is !=3, if digit!=3 then use RNG for 2 digits else 1 digit

    public static void printPopVars(RNGCellPhone phone){
        System.out.println("Serial Number: " + phone.getSerialNumber() + "\n" +
                "Model: " + phone.getModel() + "\n" +
                "Carrier: " + phone.getCarrier() + "\n" +
                "Phone Number: " + phone.getPhoneNumber()+ "\n" +
                "Owner Name: " + phone.getOwner() );
    }

    //Ex3
    public static void setVars(RNGCellPhone phone) {
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);
    }

    //++ a tempVar everytime a method is called??? OR if newObject created ++ tempVar
    // if setVars/RNGCellphone cellphone[] called, then ++ so the [] changes and userInput is for that particular cellPhone[]
    //Make an array of RNGCellPhone cellPhone objects and loop through array???


}
