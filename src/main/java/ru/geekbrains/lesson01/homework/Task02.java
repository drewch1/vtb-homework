package ru.geekbrains.lesson01.homework;

public class Task02 {

    public static void main(String[] args) {
        int wNum = 0;
        System.out.println("Число " + wNum + ": " + whatIsNum(wNum));
    }

    public static String whatIsNum(int wNum) {
        if(wNum < 0) {
            return "Отрицательное";
        } else {
            return "Положительное";
        }
    }

}
