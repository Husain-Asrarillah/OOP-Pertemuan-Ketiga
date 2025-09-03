/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Husain
 */
public class Kendaraan {

    protected String merek;

    public Kendaraan(String merek) {
        this.merek = merek;
    }

    // Metode yang akan di-override
    public void info() {
        System.out.println("Ini adalah kendaraan dengan merek " + merek);
    }
}
