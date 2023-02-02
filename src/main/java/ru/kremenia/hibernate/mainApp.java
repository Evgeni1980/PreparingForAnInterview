package ru.kremenia.hibernate;

import ru.kremenia.hibernate.Dao.StudentDaoImpl;
import ru.kremenia.hibernate.Entity.StudentEntity;

import java.util.Random;

public class mainApp {
    public static void main(String[] args) {

        StudentDaoImpl studentDao = new StudentDaoImpl();

        for (int i = 0; i < 1000; i++) {
            studentDao.saveStudentEntity(new StudentEntity("Student " + i, new Random().nextInt(3) + 3));

            System.out.println(studentDao.getStudentEntity(5));

            studentDao.deleteStudentEntity(5);



        }
    }

}
