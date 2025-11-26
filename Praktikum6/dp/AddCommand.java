package Praktikum6.dp;

import java.util.Scanner;

public class AddCommand implements Command {
    private DatabaseInterface repository;
    private Scanner scanner;

    public AddCommand(DatabaseInterface repository, Scanner scanner) {
        this.repository = repository;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String studentId = scanner.nextLine();

        if (repository.findStudent(studentId) == null) {
            repository.addStudent(new Student(name, studentId));
            System.out.println("Data berhasil disimpan.");
        } else {
            System.out.println("Gagal: NIM sudah ada.");
        }
    }

    @Override
    public String getDescription() {
        return "Masukkan Data Mahasiswa";
    }
}