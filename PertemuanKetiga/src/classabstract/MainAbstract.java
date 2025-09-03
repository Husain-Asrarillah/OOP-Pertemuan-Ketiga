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
        // Membuat objek dari kelas konkret
        Singa singa = new Singa("Raja Singa");
        Mawar mawar = new Mawar("Mawar Merah");

        System.out.println("Detail Makhluk Hidup:");
        System.out.println("---------------------");

        // Memanggil metode dari objek Singa
        singa.bernafas();
        singa.bergerak();
        singa.makan();
        System.out.println("---------------------");

        // Memanggil metode dari objek Mawar
        mawar.bernafas();
        mawar.bergerak();
        mawar.berfotosintesis();
    }
   }

