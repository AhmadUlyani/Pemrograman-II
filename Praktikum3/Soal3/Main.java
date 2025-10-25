package Praktikum3.Soal3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner inputScanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            displayMenu();

            try {
                choice = Integer.parseInt(inputScanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Pilihan tidak valid, silakan masukkan angka.");
                continue;
            }

            switch (choice) {
            case 1:
                addStudent(inputScanner, studentList);
                break;
            case 2:
                deleteStudent(inputScanner, studentList);
                break;
            case 3:
                findStudent(inputScanner, studentList);
                break;
            case 4:
                showAllStudents(studentList);
                break;
            case 0:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
            }
        }

        inputScanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
        System.out.println("3. Cari Mahasiswa berdasarkan NIM");
        System.out.println("4. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }

    private static void addStudent(Scanner scanner, List<Student> list) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String studentID = scanner.nextLine();

        boolean isUnique = true;
        for (Student mhs : list) {
            if (mhs.getStudentID().equals(studentID)) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            Student newStudent = new Student(name, studentID);
            list.add(newStudent);
            System.out.println("Mahasiswa " + name + " ditambahkan.");
        } else {
            System.out.println("NIM sudah terdaftar. Mahasiswa tidak ditambahkan.");
        }
    }

    private static void deleteStudent(Scanner scanner, List<Student> list) {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String deleteNim = scanner.nextLine();
        boolean removed = false;

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student mhs = iterator.next();
            if (mhs.getStudentID().equals(deleteNim)) {
                iterator.remove();
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Mahasiswa dengan NIM " + deleteNim + " dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + deleteNim + " tidak ditemukan.");
        }
    }

    private static void findStudent(Scanner scanner, List<Student> list) {
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String searchNim = scanner.nextLine();
        boolean found = false;

        for (Student mhs : list) {
            if (mhs.getStudentID().equals(searchNim)) {
                System.out.println("Data Mahasiswa Ditemukan:");
                System.out.println("NIM: " + mhs.getStudentID() + ", Nama: " + mhs.getName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Mahasiswa dengan NIM " + searchNim + " tidak ditemukan.");
        }
    }

    private static void showAllStudents(List<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Daftar Mahasiswa kosong.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Student mhs : list) {
                System.out.println("NIM: " + mhs.getStudentID() + ", Nama: " + mhs.getName());
            }
        }
    }
}