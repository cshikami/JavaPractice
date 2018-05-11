package com.cshikami;

import java.awt.*;

public class Dog {

    //attributes:
    //name
    //color
    //age

    //methods:
    //change name
    //change color
    //add 1 to age

    String name;
    Color color;
    int age;
    String[] fetchedItems = {"bone", "stick", "ball"};
    private int fetchCounter = -1;

    public Dog(String dogName, Color dogColor, int dogAge) {
        this.name = dogName;
        this.color = dogColor;
        this.age = dogAge;
    }

    //prints "bark!" to the console
    public void bark() {
        System.out.println("bark!");
    }

    public int getDogYears() {
        int ageInDogYears = this.age * 7;
        return ageInDogYears;
    }

    //change the dog's name
    public void changeDogName(String dogName) {
        this.name = dogName;
    }

    //change the color of the dog
    public void changeDogColor(Color dogColor) {
        this.color = dogColor;
    }

    //change the dog's age
    public int changeDogAge(int dogAge) {
        this.age = dogAge;
        return age;
    }

    //increment dog's age by 1
    public void incrementAge(int dogAge) {
        this.age = this.age + 1;
    }

    public void fetch() {
        /*if ((this.fetchCounter % 3) == 0) { long way to do this
            this.fetchCounter = 0;
        }*/

        /*this.fetchCounter = (this.fetchCounter % 3);
        this.fetchCounter = this.fetchCounter + 1;  faster way to do this*/

        this.fetchCounter = (this.fetchCounter + 1) % 3; //fastest way to modulo by 3 and then increment fetchcounter

        String item = this.fetchedItems[this.fetchCounter];

        System.out.println(this.name + " fetched the " + item + ".");
    }

    public void fetchRandom() {

        String item = this.fetchedItems[(int)(Math.random()*100) % 3];

        System.out.println(this.name + " fetched the " + item + ".");
    }


}
