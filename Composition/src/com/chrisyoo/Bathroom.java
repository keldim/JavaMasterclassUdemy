package com.chrisyoo;

public class Bathroom {
    private boolean bathtub;
    private boolean toilet;

    public Bathroom(boolean bathtub, boolean toilet) {
        this.bathtub = bathtub;
        this.toilet = toilet;
    }

   public void toiletPresent () {
       System.out.println("There is a bathroom with toilet and bathtub");
   }
}
