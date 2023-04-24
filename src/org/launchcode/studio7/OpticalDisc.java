package org.launchcode.studio7;

public interface OpticalDisc {
// Interfaces do not need accessor since they are all Public
    void spinRate();
    void dataStorage(String data);

    boolean isFull();

}
