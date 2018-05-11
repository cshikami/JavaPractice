package com.cshikami;

import java.util.Random;

public class Coin {

    public final static int HEADS = 0;
    public final static int TAILS = 1;

    private int faceUp;

    public Coin() {
        flip();
    }

    //create variable rand that is part of Random java.util class
    //set random int with bound of 2 (either 0 or 1) to private int variable faceUp
    public void flip() {
        Random rand = new Random();
        this.faceUp = rand.nextInt(2);
    }

    public String getFaceUp() {
        if (faceUp == HEADS) {
            return "HEADS";
        }
        if (faceUp == TAILS) {
            return "TAILS";
        }
        else {
            return "INVALID";
        }
    }




}
