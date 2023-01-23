package ru.kremenia.lesson_1.figure;

public class Triangle extends Figure{

    private final Double h;
    private final Double length;

    public Triangle(Double h, Double length) {
        this.h = h;
        this.length = length;
    }

    @Override
    public void areaFigure() {
        double x = h * length / 2;
        System.out.println("Area of a triangle: " + x);
    }
}
