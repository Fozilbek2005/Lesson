package com.company;

import javax.sound.sampled.EnumControl;
import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String brend;
    private String[] commands;


    public Dog(String name, String brend, String[] commands,
               Color color, Shelter shelter) {
        this.name = name;
        this.brend = brend;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String brend,
               Color color, Shelter shelter) {
        this.name = name;
        this.brend = brend;
        super.setShelter(shelter);
        super.setColor(getColor());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(){
        System.out.println("гав гав ");
    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }
    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName" + name +
                "\nBreed:" + brend +
                "\nCommands" + Arrays.toString(commands);
    }
}
