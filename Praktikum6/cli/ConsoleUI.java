package Praktikum6.cli;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;
    private DatabaseInterface repository;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.repository = new StudentRepository();
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = getUserInput();
            processChoice(choice);
        } while (choice != 0);
    }

    private void displayMenu() {
        System.out.println("\n=== MENU DATABASE MAHASISWA ===");
        System.out.println("1. Masukkan Data Mahasiswa");
        System.out.println("2. Hapus Data berdasarkan NIM");
        System.out.println("3. Cari Data berdasarkan NIM");
        System.out.println("4. Tampilkan Semua Data Mahasiswa");
        System.out.println("0. Keluar");
        System.out.println("=================================");
        System.out.print("Pilihan: ");
    }

    private int getUserInput() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void processChoice(int choice) {
        switch (choice) {
        case 1:
            performAdd();
            break;
        case 2:
            performDelete();
            break;
        case 3:
            performSearch();
            break;
        case 4:
            performShowAll();
            break;
        case 0:
            System.out.println("Program selesai.");
            break;
        default:
            System.out.println("Pilihan tidak valid.");
        }
    }

    private void performAdd() {
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

    private void performDelete() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String studentId = scanner.nextLine();
        if (repository.deleteStudent(studentId)) {
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    private void performSearch() {
        System.out.print("Masukkan NIM yang dicari: ");
        String studentId = scanner.nextLine();
        Student student = repository.findStudent(studentId);
        if (student != null) {
            System.out.println("Data Ditemukan: " + student.toString());
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    private void performShowAll() {
        List<Student> list = repository.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (Student student : list) {
                System.out.println(student.toString());
            }
        }
    }
}