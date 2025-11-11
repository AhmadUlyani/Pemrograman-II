package template;

import java.util.Scanner;
public class ScanInputOption extends BaseMenuOption {

    private final Scanner scanner;
    private final DataStore dataStore;

    public ScanInputOption(String title, Scanner scanner, DataStore dataStore) {
        super(title);
        this.scanner = scanner;
        this.dataStore = dataStore;
    }

    @Override
    public void execute() {
        System.out.print("Masukkan data baru: ");
        String input = scanner.nextLine();
        dataStore.setData(input);
        System.out.println("Data berhasil disimpan.");
    }
}