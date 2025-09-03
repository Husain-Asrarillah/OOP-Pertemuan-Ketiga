/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public abstract class Tumbuhan extends MakhlukHidup {

    public Tumbuhan(String nama) {
        super(nama);
    }

    // Implementasi metode abstrak dari MakhlukHidup
    @Override
    public void bernafas() {
        System.out.println(nama + " melakukan fotosintesis.");
    }

    // Metode abstrak spesifik untuk Tumbuhan
    public abstract void berfotosintesis();
}
