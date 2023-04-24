package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    public CD() {
        super(700, 500);
    }

    @Override
    public void spinRate() {
        System.out.println("A CD spins at a rate of " + this.getSpinSpeed() + " rpm");
    }

    @Override
    public void dataStorage(String data) {
        this.writeData(data);
    }

    @Override
    public boolean isFull() {
        if (this.readData().length() >= this.getStorageCapacity()) return true;
        else return false;
    }


    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
