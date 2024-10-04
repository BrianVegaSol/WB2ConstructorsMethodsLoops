package com.pluarlsight;

public class Dog {
    //Fields, usually dont want them to change so make the private
    //Can be accessed via methods
    private String dogName;
    private String color;
    private int age;
    private String breed;
    private String gender;
    private boolean isTrained;


    public Dog(){

    }

    public Dog(String _dogName){
        this.dogName = _dogName;
        System.out.println(_dogName + ": woof woof");
    }









}
