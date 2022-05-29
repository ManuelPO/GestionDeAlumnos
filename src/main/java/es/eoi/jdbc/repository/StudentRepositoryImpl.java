package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.sql.Connection;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

    private Connection openConnection(){
        return null;
    }



    public Student findById(String id) {
        return null;
    }


    public List<Student> findAll() {
        return null;
    }


    public Student create(Student student) {
        return null;
    }


    public boolean delete(String id) {
        return false;
    }


    public Student update(Student student) {
        return null;
    }
}
