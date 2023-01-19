package ru.kremenia.lesson_1.figure.testFigure;

import ru.kremenia.lesson_1.figure.Circle;
import ru.kremenia.lesson_1.figure.Figure;
import ru.kremenia.lesson_1.figure.Square;
import ru.kremenia.lesson_1.figure.Triangle;

public class FigureTest {
    public static void main(String[] args) {
        Figure circle = new Circle(6.0);
        Figure square = new Square(3.0);
        Figure triangle = new Triangle(3.0, 6.0);

        System.out.println("Area of a circle: " + circle.areaFigure());
        System.out.println("Square area: " + square.areaFigure());
        System.out.println("Area of a triangle: " + triangle.areaFigure());
    }
}
