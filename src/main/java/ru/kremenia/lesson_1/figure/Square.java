package ru.kremenia.lesson_1.figure;

public class Square extends Figure{

    private final Double h;

    public Square(Double h) {
        this.h = h;
    }

    @Override
    public void areaFigure() {
        double x = h * h;
        System.out.println("Square area: " + x);
    }
}
