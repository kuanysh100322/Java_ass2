package com.company;

public class Main {
    public static void main(String[] args){
        OneXbet monday = new OneXbet();
        monday.addMatch("Real Madrid vs Barcelona");
        monday.addMatch("Atletico Madrid vs Liverpool");
        monday.addMatch("Manchester City vs Tottenham");

        Bettors bettorMan = new Bettors("Kuanysh");

        monday.registerBettor(bettorMan);

        monday.addMatch("Bayern Munich vs. Chelsea");

    }
}
