package es.eoi.jdbc.service;

import es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.StudentRepository;
import es.eoi.jdbc.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService() {

        studentRepository = new StudentRepositoryImpl();
    }

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student findById(String id);

    public List<Student> findAll();

    public Student create(Student student);

    public boolean delete(String id);

    public Student update(Student student);


}
