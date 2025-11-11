package template;

public class DataStore {
    private String sharedData;

    public DataStore() {
        this.sharedData = "Belum ada data.";
    }

    public String getData() {
        return sharedData;
    }

    public void setData(String data) {
        if (data != null && !data.isEmpty()) {
            this.sharedData = data;
        } else {
            this.sharedData = "Data yang dimasukkan kosong.";
        }
    }
}