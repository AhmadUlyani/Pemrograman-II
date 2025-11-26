package Praktikum6.cli;

import java.util.List;

public interface DatabaseInterface {
    void addStudent(Student student);
    boolean deleteStudent(String studentId);
    Student findStudent(String studentId);
    List<Student> getAllStudents();
}