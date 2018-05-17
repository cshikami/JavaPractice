package com.cshikami;

/*Program where the user rolls a dice and the program will output the value of the dice
* INPUT: User must input something in the console to roll the dice
* OUTPUT: The program prints out the outcome of two random rolls (assuming the user is rolling two dice
* at a time*/

import java.util.Random;
import java.util.Scanner;

public class Dice {

    private int diceOne;
    private int diceTwo;
    private int diceTotal;

    public Dice () {
        //roll();
    }

    public void userInput() {


        System.out.print("Enter r to roll or q to quit: ");
        Scanner scanner = new Scanner(System.in);
        String userCommand = scanner.next();

        //trying to get

        //while(true) {
            while (!userCommand.equals("q") && userCommand.equals("r")){
                printMessage();
                roll();
                break;
                //printMessage();
            }

            if (!userCommand.equals("r") && !userCommand.equals("q")) {
                //roll();
                System.out.println("You did not enter r or q.");
                //printMessage();
                roll();
                //break;
            }
            else {
                System.out.println("You have quit the game. Thanks for playing!");
                //break;
            }

//        }



        /*while(!userCommand.equals("q")) {
            if (userCommand.equals("r")){
                printMessage();
            }
            else {
                System.out.print("Wrong command. Enter either r to roll or q to quit: ");
            }
        }*/

        /*if (userCommand.equals("q")) {
            System.out.println("You quit the game. Thanks for playing!");
        }
        else if (userCommand.equals("r")){
            printMessage();
        }
        else {
            System.out.print("Wrong command. Enter either r to roll or q to quit: ");
        }*/
    }

    public void printMessage() {

        System.out.println("Dice 1: " + diceOne);
        System.out.println("Dice 2: " + diceTwo);
        System.out.println("Total of both dice: " + diceTotal);
    }


    public void roll() {

        Random rand = new Random();
        this.diceOne = rand.nextInt(6) + 1;
        this.diceTwo = rand.nextInt(6) + 1;

        this.diceTotal = this.diceOne + this.diceTwo;

        userInput();
    }

}
