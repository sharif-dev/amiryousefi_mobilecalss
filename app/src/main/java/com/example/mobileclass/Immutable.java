package com.example.mobileclass;

public class Immutable {
    private int counter = 0;

    public Immutable(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void add() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                counter++;
            }
        }

    }
}
