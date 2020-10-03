package main;

import clasees.Potencias;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            Thread t = new Thread(new Potencias(i));
            if(i % 2 == 0) {
                t.setPriority(10);
            }
            t.start();
        }
    }
}
