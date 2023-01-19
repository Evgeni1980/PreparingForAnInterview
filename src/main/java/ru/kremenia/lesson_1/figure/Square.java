package ru.kremenia.lesson_1.figure;

public class Square extends Figure{

    private Double h;

    public Square(Double h) {
        this.h = h;
    }

    @Override
    public Double areaFigure() {
        return h * h;
    }
}
