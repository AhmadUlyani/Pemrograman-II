package Praktikum6.dp;

import java.util.List;

public interface DatabaseInterface {
    void addStudent(Student student);
    boolean deleteStudent(String studentId);
    Student findStudent(String studentId);
    List<Student> getAllStudents();
}