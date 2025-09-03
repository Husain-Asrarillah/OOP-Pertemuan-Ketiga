/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public class MainAbstract {

    public static void main(String[] args) {
        // Membuat objek dari kelas turunan (konkret)
        KaryawanTetap karyawanTetap = new KaryawanTetap("Budi Santoso", "E001", 5000000);
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak("Siti Aminah", "E002", 50000, 160);

        // Menggunakan metode dari objek karyawan
        System.out.println("Detail Karyawan Tetap:");
        karyawanTetap.tampilkanDetail();
        System.out.println("Gaji: Rp" + karyawanTetap.hitungGaji());
        System.out.println("---------------------------------");

        System.out.println("Detail Karyawan Kontrak:");
        karyawanKontrak.tampilkanDetail();
        System.out.println("Gaji: Rp" + karyawanKontrak.hitungGaji());
    }
}
