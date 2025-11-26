package Praktikum6.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;
    private Map<Integer, Command> commands;

    public ConsoleUI(Scanner scanner) {
        this.scanner = scanner;
        this.commands = new HashMap<>();
    }

    public void registerCommand(int key, Command command) {
        commands.put(key, command);
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = getUserInput();
            if (choice == 0) {
                System.out.println("Program selesai.");
                break;
            }
            if (commands.containsKey(choice)) {
                commands.get(choice).execute();
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (true);
    }

    private void displayMenu() {
        System.out.println("\n=== MENU DATABASE MAHASISWA ===");
        for (Map.Entry<Integer, Command> entry : commands.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getDescription());
        }
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
}