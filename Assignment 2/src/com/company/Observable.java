package com.company;

import java.util.List;

public interface Observable {
    void registerBettor(Observer bettor);
    void unregisterBettor(Observer bettor);
    void notifyAllBettors();
}
