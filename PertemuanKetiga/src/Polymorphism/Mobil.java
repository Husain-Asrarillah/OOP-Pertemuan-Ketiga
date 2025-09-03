/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Husain
 */
public class Mobil extends Kendaraan {
    private String model;

    public Mobil(String merek, String model) {
        super(merek); // Panggil konstruktor kelas induk
        this.model = model;
    }

    // Meng-override metode info() dari kelas Kendaraan
    @Override
    public void info() {
        System.out.println("Ini adalah mobil " + merek + " model " + model);
    }


// File: MainOverride.java
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Honda");
        Mobil mobil = new Mobil("Toyota", "Avanza");

        kendaraan.info(); // Output: Ini adalah kendaraan dengan merek Honda
        mobil.info();     // Output: Ini adalah mobil Toyota model Avanza
    }
}
