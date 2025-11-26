package Praktikum6.cli;

public class Student extends Person {
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String getRole() {
        return "Mahasiswa";
    }

    @Override
    public String toString() {
        return "NIM: " + studentId + " | Nama: " + name;
    }
}