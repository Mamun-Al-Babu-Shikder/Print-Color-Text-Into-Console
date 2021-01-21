package com.mcubes;

public enum Color {
    // Regular Colors
    BLACK("\033[0;30m"), BLUE("\033[0;34m"), CYAN("\033[0;36m"), GREEN("\033[0;32m"),
    PURPLE("\033[0;35m"), RED("\033[0;31m"), WHITE("\033[0;37m"), YELLOW("\033[0;33m"),

    // Bold Colors
    BLACK_BOLD("\033[1;30m"), BLUE_BOLD("\033[1;34m"), CYAN_BOLD("\033[1;36m"), GREEN_BOLD("\033[1;32m"),
    PURPLE_BOLD("\033[1;35m"), RED_BOLD("\033[1;31m"), WHITE_BOLD("\033[1;37m"), YELLOW_BOLD("\033[1;33m"),

    // Color With Underline
    BLACK_UNDERLINED("\033[4;30m"), BLUE_UNDERLINED("\033[4;34m"), CYAN_UNDERLINED("\033[4;36m"), GREEN_UNDERLINED("\033[4;32m"),
    PURPLE_UNDERLINED("\033[4;35m"), RED_UNDERLINED("\033[4;31m"), WHITE_UNDERLINED("\033[4;37m"), YELLOW_UNDERLINED("\033[4;33m"),

    // Reset color
    RESET("\033[0m");

    private String color;

    private Color(String color){
        this.color = color;
    }
    public void set(){
        System.out.print(this.color);
    }
    public String get(){
        return this.color;
    }
}
