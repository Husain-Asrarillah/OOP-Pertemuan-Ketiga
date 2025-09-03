/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public class KaryawanTetap extends Karyawan {

    private double gajiBulanan;

    public KaryawanTetap(String nama, String id, double gajiBulanan) {
        super(nama, id); // Memanggil konstruktor kelas induk (Karyawan)
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public double hitungGaji() {
        return gajiBulanan;
    }
}
