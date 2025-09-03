/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public abstract class Hewan extends MakhlukHidup {

    public Hewan(String nama) {
        super(nama);
    }

    // Metode abstrak yang diwarisi dari MakhlukHidup akan diimplementasikan oleh kelas konkret Hewan
    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas menggunakan paru-paru.");
    }

    // Metode abstrak spesifik untuk Hewan
    public abstract void makan();
}
