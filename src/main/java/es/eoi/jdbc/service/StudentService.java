package es.eoi.jdbc.service;

import es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student findById(String id);

    public List<Student> findAll();

    public Student create(Student student);

    public boolean delete(String id);

    public Student update(Student student);


}
