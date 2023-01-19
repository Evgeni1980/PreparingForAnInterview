package ru.kremenia.lesson_1.figure;

public class Circle extends Figure{

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double areaFigure() {
        return Math.PI * (radius * radius);
    }
}
