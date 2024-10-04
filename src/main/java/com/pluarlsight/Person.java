package com.pluarlsight;

public class Person {
    // Fields (attributes)
    public String name;
    private int age;
    private String gender;
    public String firstName;
    public String lastName;
    private int privateInt;  //Prevents Main class from modifying var using objName.attribute = value;
    //like in line 19
    public double balance;




    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //Constructor helps create objects and have parameters
    public Person(String _firstName, String _lastName, int _age) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.age = _age;
        System.out.println();
    }

    //Empty Constructor to not get errors???
    public Person(){

    }

    public Person(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public void displayName() {
        System.out.println("Hi, my name is " + this.name);
    }

    public void setAge(int age){
        if(age >= 0 ) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public void getAge(){
        System.out.println("Getter age: " + age);
    }

    public void negativeBalance(double balance){
        if(balance < 0){
            System.out.println("Warning you have a negative balance of" + balance);
        } else {
            System.out.println();
        }
    }











}