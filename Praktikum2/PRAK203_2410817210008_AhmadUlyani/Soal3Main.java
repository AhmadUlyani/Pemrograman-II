package Praktikum2.PRAK203_2410817210008_AhmadUlyani;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // pada baris ini terjadi error karena kurangnya titik koma (;)
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan ("Assasin");

        // variabel umur tidak ada
        p1.umur = 17;

        // Pada baris ini diminta output Nama saja
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada baris ini diminta output umur dengan tahun di belakangnya
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " Tahun");
    }
}
