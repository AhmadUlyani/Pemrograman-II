package Praktikum2.PRAK203_2410817210008_AhmadUlyani;

// pada baris ini terjadi error karena nama object harusnya Pegawai, bukan employees
// public class Employee {
public class Pegawai {
    public String nama;

    // pada baris ini terjadi error karena kesalahan tipe data
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // pada baris ini terjadi error karena parameter j tidak di deklarasikan
    // public void setJabatan(){
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}