/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public class Mawar extends Tumbuhan {

    public Mawar(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " tumbuh ke arah matahari.");
    }

    @Override
    public void berfotosintesis() {
        System.out.println(nama + " membuat makanannya sendiri.");
    }
}
