package ru.geekbrains.lesson04.homework;

public class Wall {

    private String name;
    private final int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

}
