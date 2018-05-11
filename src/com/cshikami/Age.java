package com.cshikami;

public class Age {

    int ageInt;
    double ageDouble;
    String ageString;

    public Age(int userAge) {
        this.ageInt = userAge;
    }

    public Age (double userAge) {
        this.ageDouble = userAge;
    }

    public Age (String userString) {
        this.ageString = userString;
    }

    public void getAgeGroupInt() {
        if (this.ageInt >= 0 && this.ageInt <= 5) {
            System.out.println("Baby");
        } else if (this.ageInt >= 6 && this.ageInt <= 11){
            System.out.println("Kid");
        } else if (this.ageInt >= 12 && this.ageInt <= 17) {
            System.out.println("Teen");
        } else {
            System.out.println("Invalid");
        }

        System.out.println("Thanks for using this program!");
    }

    public void getAgeGroupDouble() {
        if (this.ageDouble >= 0 && this.ageDouble <= 5) {
            System.out.println("Baby");
        } else if (this.ageDouble >= 6 && this.ageDouble <= 11){
            System.out.println("Kid");
        } else if (this.ageDouble >= 12 && this.ageDouble <= 17) {
            System.out.println("Teen");
        } else {
            System.out.println("Invalid");
        }

        System.out.println("Thanks for using this program!");
    }

    public void printExitMessage() {

        if (ageString.equals("Q")) {
            System.out.println("Thanks for using the program!");
        }
    }
}
