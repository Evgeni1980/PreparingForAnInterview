package ru.kremenia.hibernate.Dao;

import org.hibernate.Session;
import ru.kremenia.hibernate.Entity.StudentEntity;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<StudentEntity> getAllStudentEntity() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        List<StudentEntity> Student = session.createQuery("from  StudentEntity", StudentEntity.class).getResultList();
        session.getTransaction().commit();
        return Student;
    }

    @Override
    public void saveStudentEntity(StudentEntity student) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(student);
        session.getTransaction().commit();

    }

    @Override
    public StudentEntity getStudentEntity(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        StudentEntity student = session.get(StudentEntity.class, id);
        session.getTransaction().commit();
        return student;
    }

    @Override
    public void deleteStudentEntity(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.createQuery("delete from StudentEntity where id ="+id).executeUpdate();
        session.getTransaction().commit();
    }


}
