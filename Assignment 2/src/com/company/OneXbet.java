package com.company;

import java.util.ArrayList;
import java.util.List;

public class OneXbet implements Observable{

    private List<String> matches = new ArrayList<>();
    private List<Observer> bettorName = new ArrayList<>();

    public void addMatch(String match){
        this.matches.add(match);
        notifyAllBettors();
    }

    public void removeMatch(String match){
        this.matches.remove(match);
        notifyAllBettors();
    }


    @Override
    public void registerBettor(Observer bettor) {
        this.bettorName.add(bettor);
    }

    @Override
    public void unregisterBettor(Observer bettor) {
        this.bettorName.remove(bettor);
    }

    @Override
    public void notifyAllBettors() {
        for (Observer bettor:bettorName
             ) {bettor.update(this.matches);

        }
    }

}
