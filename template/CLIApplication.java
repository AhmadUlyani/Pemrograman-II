package template;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLIApplication {
    private final Scanner scanner;
    private final DataStore dataStore;
    private final List<MenuOption> menuOptions;
    private boolean isRunning;

    public CLIApplication() {
        this.scanner = new Scanner(System.in);
        this.dataStore = new DataStore();
        this.menuOptions = new ArrayList<>();
        this.isRunning = true;

        menuOptions.add(new ScanInputOption("1. Scan Input Pengguna", scanner, dataStore));
        menuOptions.add(new DisplayInputOption("2. Tampilkan Input Tersimpan", dataStore));
        menuOptions.add(new ExitOption("0. Keluar", this));
    }

    public void run() {
        while (this.isRunning) {
            displayMenu();
            handleMenuSelection();
        }
        System.out.println("Terima kasih telah menggunakan aplikasi.");
        scanner.close();
    }

    public void stop() {
        this.isRunning = false;
    }

    private void displayMenu() {
        System.out.println("\n--- MENU UTAMA ---");
        for (MenuOption option : menuOptions) {
            System.out.println(option.getTitle());
        }
        System.out.print("Pilih opsi: ");
    }

    private void handleMenuSelection() {
        String input = scanner.nextLine();
        boolean optionExecuted = false;

        for (MenuOption option : menuOptions) {
            if (input.equals(option.getTitle().split("\\.")[0])) {
                option.execute();
                optionExecuted = true;
                break;
            }
        }

        if (!optionExecuted) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
        }
    }
}