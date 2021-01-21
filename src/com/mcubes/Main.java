package com.mcubes;

public class Main {
    public static void main(String[] args) {

        Color[] colors = Color.values();
        for (Color color : colors){
            color.set();
            System.out.println(color.name());
        }
    }
}
