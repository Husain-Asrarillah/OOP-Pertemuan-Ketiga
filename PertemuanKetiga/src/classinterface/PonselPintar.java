/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classinterface;

/**
 *
 * @author Husain
 */
public class PonselPintar implements PerangkatElektronik, Kamera, KomunikasiNirkabel {

    private boolean isHidup = false;

    // Implementasi dari interface PerangkatElektronik
    @Override
    public void nyalakan() {
        isHidup = true;
        System.out.println("Ponsel pintar menyala. Selamat datang!");
    }

    @Override
    public void matikan() {
        isHidup = false;
        System.out.println("Ponsel pintar mati. Sampai jumpa!");
    }

    // Implementasi dari interface Kamera
    @Override
    public void ambilFoto() {
        if (isHidup) {
            System.out.println("Mengambil foto...");
        } else {
            System.out.println("Ponsel mati, tidak bisa mengambil foto.");
        }
    }

    @Override
    public void rekamVideo() {
        if (isHidup) {
            System.out.println("Mulai merekam video...");
        } else {
            System.out.println("Ponsel mati, tidak bisa merekam video.");
        }
    }

    // Implementasi dari interface KomunikasiNirkabel
    @Override
    public void kirimData(String data) {
        if (isHidup) {
            System.out.println("Mengirim data: '" + data + "'");
        } else {
            System.out.println("Ponsel mati, tidak bisa mengirim data.");
        }
    }

    @Override
    public void terimaData() {
        if (isHidup) {
            System.out.println("Menerima data dari jaringan.");
        } else {
            System.out.println("Ponsel mati, tidak bisa menerima data.");
        }
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas konkret
        PonselPintar myPhone = new PonselPintar();

        // Menggunakan metode dari kelas PonselPintar
        myPhone.nyalakan();
        myPhone.ambilFoto();
        myPhone.kirimData("Pesan rahasia");
        myPhone.matikan();
        myPhone.ambilFoto(); // Demonstrasi ketika ponsel mati
    }
}
