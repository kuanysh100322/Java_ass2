package com.company;

import java.util.List;

public class Bettors implements Observer{

    private String name;
    public Bettors(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> matches) {
        System.out.println("Hello " + this.name+" future matches:" + matches);
    }
}
