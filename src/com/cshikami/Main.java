package com.cshikami;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int myInt;

    public static void main(String[] args) {
        //System.out.print("Enter a word: ");

        int[] numbers = new int[5];

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        System.out.println(numbers[1]);

        int[] numbers2 = {31, 45, 22, 98, 10};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
        System.out.println("Index 1 : " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Butterfinger";
        System.out.println("Index 2 : " + myFavoriteCandyBars[2]);
        System.out.println("Length:" + myFavoriteCandyBars.length);

        System.out.println(Array.get(myFavoriteCandyBars,2)); //uses Array class method rather than instance method

        Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true);

        Car sallyCar = new Car(13.9, "3D2OBN", Color.black, false);

        double myCarSpeed = 50;

        myCarSpeed = myCar.speedingUp(myCarSpeed); //need to do this because Java is pass by value

        System.out.println(myCarSpeed);

        String s = "dog";
        String replacedF = s.replace('d', 'f');
        System.out.println(replacedF);

        Dog dog1 = new Dog("Buster", Color.LIGHT_GRAY, 12);
        Dog dog2 = new Dog("Buddy", Color.RED, 6);

        System.out.println(dog1.name);
        System.out.println(dog1.color);
        System.out.println(dog1.age);

        dog1.changeDogName("Ryan");

        System.out.println(dog1.name);

        dog1.changeDogColor(Color.BLUE);

        System.out.println(dog1.color);

        dog1.changeDogAge(10);
        System.out.println(dog1.age);

        dog1.incrementAge(dog1.age);
        System.out.println(dog1.age);

        dog1.bark();

        int dog1AgeInDogYears = dog1.getDogYears();
        System.out.println(dog1AgeInDogYears);

        dog1.fetch();
        dog1.fetch();
        dog1.fetch();
        dog1.fetch();

        System.out.println("");

        dog1.fetchRandom();
        dog1.fetchRandom();
        dog1.fetchRandom();
        dog1.fetchRandom();

        /* must comment this out when using other scanner
        System.out.println("Please enter an age (Type Q to quit program): ");


        try (Scanner scanner = new Scanner(System.in)) {
//            while(scanner.hasNext() == true || scanner.hasNextDouble() == true || scanner.hasNextInt() == true) {
            if(scanner.hasNextInt()) {
                int userAge = scanner.nextInt();
                Age firstPersonAgeInt = new Age(userAge);
                firstPersonAgeInt.getAgeGroupInt();
            }

            if(scanner.hasNextDouble()) {
                double userAge = scanner.nextDouble();
                Age firstPersonAgeInt = new Age(userAge);
                firstPersonAgeInt.getAgeGroupDouble();
            }

            if(scanner.hasNext()) {
                String userString = scanner.next();
                Age enteredString = new Age(userString);
                enteredString.printExitMessage();
            }
            scanner.close();
        }*/



        System.out.println("While Loop");
        int x = 3;
        while(x > 0) {
            System.out.println("Current x: " + x);
            x = x - 1;
        }

        System.out.println("Final x: " + x);
        System.out.println();

        //DO WHILE
        System.out.println("Do-While Loop");

        int y = 3;

        do {
            System.out.println("Current y: " + y);
            y = y - 1;
        } while(y > 0);

        System.out.println("Final y: " + y);
        System.out.println();

        //FOR LOOP
        System.out.println("For Loop");
        for(int i = 3; i > 0; i--) {
            System.out.println("Current i: " + i);
        }
        System.out.println();

        /* Java Libraries
        * Java.lang
        * -Fundamental to the core Java language (math, boolean, byte)
        *
        * Java.util
        * -Generic utilities (scanning, formatting strings, data manipulation)
        *
        * Java.net
        * -Infrastructure for networking
        */

        double power = Math.pow(5, 3);
        System.out.println(power);

        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        Random rand = new Random();
        int randomNumber = rand.nextInt();
        System.out.println(randomNumber);

        int randomNumberWithBound = rand.nextInt(10);
        System.out.println(randomNumberWithBound); //prints random number between 0 and 9


        Coin c = new Coin();
        System.out.println("Initial: " + c.getFaceUp());

        for(int i = 0; i < 10; i++) {
            c.flip();
            System.out.println("After flip: " + c.getFaceUp());
        }

        Dice d = new Dice();
        d.roll();

        BankAccount myBankAccount = new BankAccount(4141, 100);
//        System.out.println(myBankAccount.bank_account);

        myBankAccount.getAccount_balance();

        myBankAccount.deposit(-60);
        myBankAccount.withdraw(150);

        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);

        myBankAccount.getAccount_balance();

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome.\n*Press 1 to check account balance\n*Press 2 to deposit\n*Press 3 to withdraw\n*And 0 to exit");

        int userEntry = myScanner.nextInt();

        myBankAccount.userInterface(userEntry);


        //Inheritance

        Insect insect = new Insect(5, 6);
        Spider spider = new Spider(13, true);
        Cricket cricket = new Cricket(2, 1.25);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl();
        cricket.says();
        cricket.jump();

        if (spider instanceof Insect && spider instanceof Spider) {
            System.out.println("Spider is an insect and a spider");
        }

        //Interfaces

        Dog2 d2 = new Dog2();
        Cat c2 = new Cat();

        if (c2 instanceof Pet) {
            c2.play();
        }

        if (d2 instanceof Pet) {
            d2.play();
        }

        Pet p;
        Random rand2 = new Random();
        int n = rand2.nextInt(2);

        //p is initialized to either Dog2 or Cat
        if (n == 0) {
            p = new Dog2();
        } else {
            p = new Cat();
        }

        p.play(); //we say which one p is initialized to by which play() method it prints out to the consoleq


        //Interfaces are the definition of a behavior
        //When used, they force classes and objects to have certain properties without forcing their implementation
        //For example, every pet must have play() property, but the implementation of the play method is up to
        //each individual class that implements the interface


        //Functional Programming

        //Functional programming focuses on computing results from functions rather than performing
        //actions on objects

        //In functional programming, objects are immutable

        //Instead of modifying or changing an object, you create a new object which looks like the old
        //object, except for the change

        Answerable phone = () -> "Hello"; //no input, returns "Hello"

        System.out.println(phone.answer()); //returns correctly because phone.answer() has 0 inputs and returns a string
                                            // and in this implementation we have 0 inputs and return a string

        Predicate isOdd = n2 -> n2 % 2 != 0; //n is the input, true if n is odd, false if n is even

        System.out.println(isOdd.test(2));

        Predicate isEven = n3 -> n3 % 2 == 0;
        System.out.println(isEven.test(2));

        /*System.out.println("Enter either quit or roll to roll the two dice");
        Scanner scanner = new Scanner(System.in);
        String userCommand = scanner.next();

        if(!userCommand.equals("quit")) {
            if (userCommand.equals("roll")) {
                d.roll();
            }
        }*/
        /*if (userCommand.equals("roll")) {
            System.out.println("Good");
        }*/

        //when user types "roll", dice rolls and outputs value of each dice
        //like "Dice 1: 4"
        //"Dice 2: 3"
        //"Total amount:7"


//        int userAge = scanner.nextInt();
//        double userAge2 = scanner.nextDouble();

        /*if (userAge >= 0 && userAge <= 5) {
            System.out.println("Baby");
        } else if (userAge >= 6 && userAge <= 11){
            System.out.println("Kid");
        } else if (userAge >= 12 && userAge <= 17) {
            System.out.println("Teen");
        } else {
            System.out.println("Invalid");
        }*/


//        Age firstPersonAgeDouble = new Age(userAge2);
//
//        firstPersonAgeDouble.getAgeGroupDouble();

        //Java is a call by value language
        /* This means that a function receives a copy of each argument passed to it
         * rather than a reference to the object itself */

        /* Call by reference is when a function receives a reference to each argument
        * and can modify these arguments within its body code */

        /*Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println(userNumber);

        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);*/
        /*
        String userInput = sc.next();

        //System.out.println("Hello, world!");

        Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true);

        Car sallyCar = new Car(13.9, "3D2OBN", Color.black, false);

        System.out.println("My car's license plate: " + myCar.licensePlate);
        System.out.println("Sally's car's license plate: " + sallyCar.licensePlate);

        System.out.println("My car's color is: " + myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println("My car's color is: " + myCar.paintColor.toString());

        //String userInput = "entertainment";
        String uppercase = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercase);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains enter: " + userInput.contains("Enter".toLowerCase()));

        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;

        float f = 1f;
        double d = 1d;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        System.out.println("Hello, World!");
        System.out.println(args[0]);
        System.out.println("The value of myInt is " + myInt);*/
    }
}
