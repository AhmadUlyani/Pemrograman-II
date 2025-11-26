package Praktikum6.dp;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements DatabaseInterface {
    private List<Student> database;

    public StudentRepository() {
        this.database = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        database.add(student);
    }

    @Override
    public boolean deleteStudent(String studentId) {
        Student student = findStudent(studentId);
        if (student != null) {
            database.remove(student);
            return true;
        }
        return false;
    }

    @Override
    public Student findStudent(String studentId) {
        for (Student student : database) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return database;
    }
}