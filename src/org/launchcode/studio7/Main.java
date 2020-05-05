package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Dr. Compact Disc", 1000, "CD-RW", 42);
        DVD dvd = new DVD("Sir Digital Video Disc", 5000, "DVD-RW", 2020);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();


    }
}
