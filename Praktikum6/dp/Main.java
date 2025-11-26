package Praktikum6.dp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseInterface repository = RepositoryFactory.createRepository();
        Scanner scanner = new Scanner(System.in);

        ConsoleUI app = new ConsoleUI(scanner);

        app.registerCommand(1, new AddCommand(repository, scanner));
        app.registerCommand(2, new DeleteCommand(repository, scanner));
        app.registerCommand(3, new FindCommand(repository, scanner));
        app.registerCommand(4, new ShowAllCommand(repository));

        app.run();
    }
}