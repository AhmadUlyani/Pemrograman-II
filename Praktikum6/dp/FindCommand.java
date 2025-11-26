package Praktikum6.dp;

import java.util.Scanner;

public class FindCommand implements Command {
    private DatabaseInterface repository;
    private Scanner scanner;

    public FindCommand(DatabaseInterface repository, Scanner scanner) {
        this.repository = repository;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Masukkan NIM yang dicari: ");
        String studentId = scanner.nextLine();
        Student student = repository.findStudent(studentId);
        if (student != null) {
            System.out.println("Data Ditemukan: " + student.toString());
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    @Override
    public String getDescription() {
        return "Cari Data Mahasiswa berdasarkan NIM";
    }
}