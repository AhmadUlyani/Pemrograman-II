package template;

public class DisplayInputOption extends BaseMenuOption {
    private final DataStore dataStore;

    public DisplayInputOption(String title, DataStore dataStore) {
        super(title);
        this.dataStore = dataStore;
    }

    @Override
    public void execute() {
        System.out.println("\n--- Data Tersimpan ---");
        System.out.println(dataStore.getData());
        System.out.println("----------------------");
    }
}