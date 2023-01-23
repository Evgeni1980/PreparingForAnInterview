package ru.kremenia.lesson_1.figure;

public class Circle extends Figure {

    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void areaFigure() {
        double x = Math.PI * (radius * radius);
        System.out.println("Area of a circle: " + x);
    }
}