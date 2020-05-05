package org.launchcode.studio7;

// TODO: Implement your custom interface.
public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String aName, int maxCapacity, String aType, int usedCapacity) {
        super(aName, maxCapacity, aType, usedCapacity);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc() {
        System.out.println("The rotational speed, or angular velocity, of a DVD goes between 570-1600 rpm");
    }

    @Override
    public void dataInfo() {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that. -Hal 9000");
    }

}
