/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Husain
 */
// File: Kalkulator.java (Class dengan Overload)
public class Kalkulator {

    // Overload 1: Menambah dua bilangan bulat (int)
    public int tambah(int a, int b) {
        System.out.println("Menambah dua bilangan bulat...");
        return a + b;
    }

    // Overload 2: Menambah tiga bilangan bulat (int)
    public int tambah(int a, int b, int c) {
        System.out.println("Menambah tiga bilangan bulat...");
        return a + b + c;
    }

    // Overload 3: Menambah dua bilangan desimal (double)
    public double tambah(double a, double b) {
        System.out.println("Menambah dua bilangan desimal...");
        return a + b;
    }


// File: MainOverload.java
//public class MainOverload {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();

        System.out.println("Hasil 2 + 3 = " + calc.tambah(2, 3));
        System.out.println("---");
        System.out.println("Hasil 2 + 3 + 4 = " + calc.tambah(2, 3, 4));
        System.out.println("---");
        System.out.println("Hasil 2.5 + 3.5 = " + calc.tambah(2.5, 3.5));
    }
}
