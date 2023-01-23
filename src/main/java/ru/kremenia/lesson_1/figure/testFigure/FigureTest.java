package ru.kremenia.lesson_1.figure.testFigure;

import ru.kremenia.lesson_1.figure.Circle;
import ru.kremenia.lesson_1.figure.Figure;
import ru.kremenia.lesson_1.figure.Square;
import ru.kremenia.lesson_1.figure.Triangle;



public class FigureTest {
    public static void main(String[] args) {

        Figure[] myFigure = new Figure[3];
        myFigure[0] = new Circle(4.0);
        myFigure[1] = new Square(3.0);
        myFigure[2] = new Triangle(3.0, 5.0);

        for (Figure figure : myFigure) {
            figure.areaFigure();
        }
    }
}
