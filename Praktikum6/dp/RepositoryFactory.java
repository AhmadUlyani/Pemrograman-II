package Praktikum6.dp;

public class RepositoryFactory {
    public static DatabaseInterface createRepository() {
        return new StudentRepository();
    }
}