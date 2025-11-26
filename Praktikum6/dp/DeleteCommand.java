package Praktikum6.dp;

import java.util.Scanner;

public class DeleteCommand implements Command {
    private DatabaseInterface repository;
    private Scanner scanner;

    public DeleteCommand(DatabaseInterface repository, Scanner scanner) {
        this.repository = repository;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String studentId = scanner.nextLine();
        if (repository.deleteStudent(studentId)) {
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    @Override
    public String getDescription() {
        return "Hapus Data Mahasiswa berdasarkan NIM";
    }
}