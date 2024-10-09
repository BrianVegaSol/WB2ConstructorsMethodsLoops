package com.pluarlsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //Empty constructor
    public CellPhone() {
        this.serialNumber = 0;
        //

    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public CellPhone(int setSerialNumber, String setModel, String carrier, String phoneNumber, String owner) {
        setSerialNumber(serialNumber);
        setModel(model);
        setCarrier(carrier);
        setPhoneNumber(phoneNumber);
        setOwner(owner);
    }

    //Why use the get/set when you can just use scanned vars + print???
   /* public void printAll(int getSerialNumber, String getModel, String getCarrier, String getPhoneNumber, String getOwner) {
        System.out.println("Serial Number: " + serialNumber + "\n" +
                "Model: " + model + "\n" +
                "Carrier: " + carrier + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Owner Name: " + owner);
    }*/
    public void printAll() {
        System.out.println("Serial Number: " + serialNumber + "\n" + "Model: " + model + "\n" +
            "Carrier: " + carrier + "\n" + "Phone Number: " + phoneNumber + "\n" + "Owner Name: " + owner); }

    //public void dial(CellPhone cellphone){
    public void dial(String getOwner, String getPhoneNumber) {
        System.out.println("--------------------");
        System.out.println(getOwner() + "'s phone is calling you: " + getPhoneNumber());// wanted to try to add some () like (480)
        //tho many not necessary since user may input that
        //unless there's an if else to check?
        //then maybe use split? refer to BGs Ex for refresher
    }

    public void dial(CellPhone phone) {
        System.out.println(phone.getOwner() + " is calling you! Phone Number: " + phone.getPhoneNumber());
    }

}
