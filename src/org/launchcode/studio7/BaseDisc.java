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

    private int storageLeft() {
        return storageCapacity - capacityUsed;
    }

    public String discStats() {
        String result = "Disc Name: " + this.name + "\nMax Capacity: " + this.storageCapacity + "\nStorage Used: " + capacityUsed + "\nAvailable Storage: " + remainingCapacity;
        return result;
    }

    public String writeData(int dataSize) {
        if (dataSize > remainingCapacity) {
            return "I'm sorry, there is no space available Dave. -Hal 9000";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Successfully wrote data to disc your remaining space is " + remainingCapacity;
    }


}
