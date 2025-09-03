# 📘 Laporan Praktikum PBO – Pertemuan Ketiga  

## 🔑 Konsep Dasar dalam PBO: Abstraksi & Polimorfisme  

### 📝 Deskripsi  
Repositori ini berisi kode-kode praktikum untuk mata kuliah **Pemrograman Berbasis Objek (PBO)**.  
Proyek ini berfokus pada implementasi dan pemahaman konsep inti PBO:  

- 🔹 **Abstraksi** melalui **kelas abstrak** & **interface**  
- 🔹 **Polimorfisme** melalui **method overriding** & **method overloading**  

---
## 📂 Struktur Proyek  

Berikut adalah struktur folder dalam repositori ini:  

```plaintext
├── README.md
├── AbstractClass
│   ├── MakhlukHidup.java       (Kelas Abstrak)
│   ├── Hewan.java      (Kelas Abstrak)
│   ├── Tumbuhan.java    (Kelas Abstrak)
│   ├── Singa.java      (Kelas Konkret)
│   ├── Mawar.java    (Kelas Konkret)
│   └── MainAbstract.java   (Demo Abstrak)
├── Interface
│   ├── PerangkatElektronik.java    (Interface)
│   ├── Kamera.java    (Interface)
│   ├── KomunikasiNirkabel.java    (Interface)
│   └── PonselPintar.java  (Demo Interface)
├── OverloadOverride
│   ├── Kendaraan.java
│   ├── Mobil.java          (Contoh Override)
│   └── Kalkulator.java     (Contoh Overload)
└── ...
---
```
## 📖 Ringkasan Konsep  

### 1️⃣ Kelas Abstrak vs. Interface  

Keduanya dipakai untuk mencapai **abstraksi** (menyembunyikan detail implementasi).  

| 🔍 Fitur | 🏷️ **Kelas Abstrak** | 🏷️ **Interface** |
| :---: | :--- | :--- |
| **Implementasi** | Bisa memiliki **method abstrak** & **method konkret** | Method default-nya **abstrak** (kecuali `default`/`static`) |
| **Hubungan** | Turunan menggunakan `extends` → hanya boleh **1 superclass** | Turunan menggunakan `implements` → bisa **multi-interface** |
| **Penggunaan** | Cocok untuk hubungan **is-a** (contoh: `Mobil` adalah `Kendaraan`) | Cocok untuk mendefinisikan **kemampuan** (contoh: `Mobil` bisa `berjalan`, `berhenti`) |

---

### 2️⃣ Override vs. Overload  

Keduanya merupakan bentuk **polimorfisme** (satu nama, banyak perilaku).  

| 🔍 Konsep | ⚡ **Overriding** | ⚡ **Overloading** |
| :---: | :--- | :--- |
| **Definisi** | Menimpa method milik **kelas induk** dengan implementasi baru | Membuat beberapa method dengan **nama sama** tapi parameter berbeda |
| **Letak** | Terjadi di antara **kelas induk & turunan** | Terjadi dalam **kelas yang sama** |
| **Aturan** | Nama & parameter **harus sama** | Nama **sama**, parameter **berbeda** |

💡 **Contoh Kode:**  
- Override → lihat `Mobil.java` menimpa method `info()` dari `Kendaraan.java`  
- Overload → lihat `Kalkulator.java` dengan banyak method `tambah()`  

---

🎯 Kesimpulan
Abstrak digunakan untuk membuat blueprint class (is-a).

Interface digunakan untuk mendefinisikan kemampuan (can-do).

Overriding menunjukkan dynamic polymorphism (perilaku berbeda meski nama method sama).

Overloading menunjukkan static polymorphism (method sama tapi parameter berbeda).

🚀 Dengan memahami konsep ini, kita bisa membuat kode lebih modular, reusable, dan fleksibel.
