package test;

import main.Mammals;

public class TestMammals {

    public static void main(String[] args) {
        Mammals dog = new Mammals();
        dog.vid = "собака";
        dog.kolichestvo = 1000;
        dog.usy = 20.0;
        System.out.printf("гавгавгав", dog);
        System.out.println("dog.toString: " + dog.toString());


        Mammals cat = new Mammals();
        cat.vid = "кошка";
        cat.kolichestvo = 1000;
        cat.usy = 20.0;
        System.out.printf("мурмурмур", cat);
        System.out.println("cat.toString: " + cat.toString());


    }


