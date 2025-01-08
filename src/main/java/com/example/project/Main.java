package com.example.project;

public class Main{
    public static void main(String[] args) {
        HorseBarn barn1 = new HorseBarn(3);
        System.out.println(barn1.horseBarnInfo());
        barn1.placeHorse(new Horse("Silver",1210), 2);
        System.out.println(barn1.horseBarnInfo());
        barn1.placeHorse(new Horse("Trigger", 1340), 0);
        System.out.println(barn1.horseBarnInfo());
    }
}