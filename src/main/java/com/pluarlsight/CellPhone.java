package com.pluarlsight;

public class CellPhone {
    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";

    //Empty constructor
    public CellPhone(){
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

    //Why use the get/set
    public void printAll(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        System.out.println("Serial Number: " + serialNumber + "\n" +
                "Model: " + model + "\n" +
                "Carrier: " + carrier + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Owner Name: " + owner );
    }

    public void dial(String phoneNumber, String owner){
        System.out.println(owner + "'s phone is calling: " + phoneNumber);
    }


}
