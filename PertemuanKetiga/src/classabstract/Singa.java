/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public class Singa extends Hewan {

    public Singa(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berlari.");
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan daging.");
    }
}
