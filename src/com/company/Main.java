package com.company;

import javax.sound.sampled.EnumControl;

public class Main {

    public static void main(String[] args) {
        String[] commands = {"сидеть", "Лежать"};

        Shelter ramashka = new Shelter("Рамашка", "Первомайская 9");

        Dog layka = new Dog("layka", "Dvornyaga", commands, Color.BLACK, ramashka);
        System.out.println(layka.getInfo());
        layka.makeVoice();

        System.out.println("-------------------------");
        Dog rex = new Dog("Rex", "Ovcgarka",Color.BROWN,
                ramashka);
        System.out.println(rex.getInfo());
        rex.makeVoice("гав гав");
    }
}
