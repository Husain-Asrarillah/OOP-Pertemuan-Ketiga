/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstract;

/**
 *
 * @author Husain
 */
public class KaryawanKontrak extends Karyawan {
    private double upahPerJam;
    private int jamKerja;

    public KaryawanKontrak(String nama, String id, double upahPerJam, int jamKerja) {
        super(nama, id); // Memanggil konstruktor kelas induk (Karyawan)
        this.upahPerJam = upahPerJam;
        this.jamKerja = jamKerja;
    }

    @Override
    public double hitungGaji() {
        return upahPerJam * jamKerja;
    }
}
