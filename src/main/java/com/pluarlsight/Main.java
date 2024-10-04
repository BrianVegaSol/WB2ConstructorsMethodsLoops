package com.pluarlsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
                //Person is a class
                //person1 is an object with attributes
                //Instantiating object
                Person person1 = new Person("Remsey",35,"Male");
                Person person2 = new Person("Reginald",24,"Male");
                Person person3 = new Person("Brian", 25,"Male");
                person1.displayName();
                person2.displayName();
                person3.displayName();

                Person person4 = new Person();
                person4.firstName = "John";
                person4.lastName = "Doe";
                person4.setAge(20);
                person4.getAge();
                //person4.age = 45;
                //person4.privateInt = 45;
                person4.balance = 0.0;

        Person[] family = new Person[4];
        family[0] = new Person("Dana", 63);
        family[1] = new Person("Natalie", 37);
        family[2] = new Person("Dale",55);
        family[3] = new Person("Betty",46);
        //System.out.println("Family members: " + family[0]);
        for (Person person : family) {
            System.out.println(person);
        }
                Dog doge = new Dog();






                //A class describes the properties of an object
            }
        }