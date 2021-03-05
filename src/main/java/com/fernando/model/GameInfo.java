package com.fernando.model;

public class GameInfo extends Game{
    public GameInfo(String name, double price, int quantity, String producer){ super(name, price, quantity, producer);}

    @Override
    public int compareTo(Game o) {
        return Integer.valueOf(getName().compareTo(o.getName()));
    }
}
