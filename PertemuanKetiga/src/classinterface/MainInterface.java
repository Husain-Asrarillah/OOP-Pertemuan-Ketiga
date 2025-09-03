/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classinterface;

/**
 *
 * @author Husain
 */
public class MainInterface {
    public static void main(String[] args) {
        // Menggunakan interface sebagai tipe data
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar persegi = new Persegi(5);

        System.out.println("Detail Lingkaran:");
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println("Keliling: " + lingkaran.hitungKeliling());
        System.out.println("---------------------------------");

        System.out.println("Detail Persegi:");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());
    }
}