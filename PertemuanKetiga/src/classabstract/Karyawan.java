/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public abstract class Karyawan {

    // Properti umum untuk semua karyawan
    protected String nama;
    protected String id;

    // Konstruktor
    public Karyawan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    // Metode abstrak: harus diimplementasikan oleh kelas turunan
    public abstract double hitungGaji();

    // Metode konkret: dapat digunakan langsung oleh kelas turunan
    public void tampilkanDetail() {
        System.out.println("Nama: " + this.nama);
        System.out.println("ID: " + this.id);
    }
}

