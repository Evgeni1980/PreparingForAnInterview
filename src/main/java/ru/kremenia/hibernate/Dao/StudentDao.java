package ru.kremenia.hibernate.Dao;

import ru.kremenia.hibernate.Entity.StudentEntity;

import java.util.List;

public interface StudentDao {

    public List<StudentEntity> getAllStudentEntity();

    public void saveStudentEntity(StudentEntity student);

    public StudentEntity getStudentEntity(int id);

    public void deleteStudentEntity(int id);

}
