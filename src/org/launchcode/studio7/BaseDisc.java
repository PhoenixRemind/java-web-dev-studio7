package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;

    public BaseDisc(String aName, int maxCapacity, String aType, int usedCapacity) {
        name = aName;
        storageCapacity = maxCapacity;
        capacityUsed = testCapacity(usedCapacity);
        remainingCapacity = storageLeft();
    }

    private int testCapacity(int usedData) {
        if (storageCapacity < usedData) {
            return storageCapacity;
        }
        return usedData;
    }


}
