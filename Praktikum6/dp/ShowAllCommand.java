package Praktikum6.dp;

import java.util.List;

public class ShowAllCommand implements Command {
    private DatabaseInterface repository;

    public ShowAllCommand(DatabaseInterface repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        List<Student> list = repository.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (Student student : list) {
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public String getDescription() {
        return "Tampilkan Semua Data Mahasiswa";
    }
}