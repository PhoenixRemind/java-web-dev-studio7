package org.launchcode.studio7;

// TODO: Implement your custom interface.
public class CD extends BaseDisc implements OpticalDisc {
    public CD(String aName, int maxCapacity, String aType, int usedCapacity) {
        super(aName, maxCapacity, aType, usedCapacity);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("CDs spin at an angular speed of 500 rpm when read from the center and 200 rpm when read near the circumference.");
    }

    @Override
    public void dataInfo() {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that. -Hal 9000");
    }
}
