package com.pluarlsight;

public class RNGCellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
    //Experimenting with callCount
    public static int callCount = 0; //this WOOOORKED :'D

    //Empty constructor
    public RNGCellPhone () {

    }

    public RNGCellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){
         this.serialNumber = 0;
         this.model = "";
         this.carrier = "";
         this.phoneNumber = "";
         this.owner = "";
    }

    public int getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    //Overload Ex3
    //public RNGCellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        /*setSerialNumber(serialNumber);
        setModel(model);
        setCarrier(carrier);
        setPhoneNumber(phoneNumber);
        setOwner(owner);*/
    //}

    //Why use the get/set when you can just use scanned vars + print???
    public void printAll(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        System.out.println("Serial Number: " + serialNumber + "\n" +
                "Model: " + model + "\n" +
                "Carrier: " + carrier + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Owner Name: " + owner );
    }

    //public void dial(CellPhone cellphone){
    public  void dial(String owner, String phoneNumber){
        System.out.println("------------------");
        System.out.println(owner + "'s phone is calling you: " + phoneNumber);// wanted to try to add some () like (480)
        //tho many not necessary since user may input that
        //unless there's an if else to check?
        //then maybe use split? refer to BGs Ex for refresher
    }

    public static void myVars(){
        callCount ++;

        System.out.println("Serial Number: 123456789\n" +
                "Model: Samsung Galaxy Note 9\n" +
                "Carrier: Mint\n" +
                "Phone Number: 602-555-7777\n" +
                "Owner Name: Brian Ve");
    }


}