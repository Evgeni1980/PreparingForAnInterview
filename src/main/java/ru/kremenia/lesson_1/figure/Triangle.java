package ru.kremenia.lesson_1.figure;

public class Triangle extends Figure{

    private Double h;
    private Double length;

    public Triangle(Double h, Double length) {
        this.h = h;
        this.length = length;
    }

    @Override
    public Double areaFigure() {
        return h * length / 2;
    }
}
