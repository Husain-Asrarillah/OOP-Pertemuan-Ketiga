# Laporan Praktikum Pemrograman Berbasis Objek (PBO) Pertemuan Ketiga

## Konsep Dasar dalam PBO: Abstraksi & Polimorfisme

### Deskripsi
Repositori ini berisi kode-kode praktikum untuk mata kuliah Pemrograman Berbasis Objek (PBO). Proyek ini berfokus pada implementasi dan pemahaman konsep-konsep inti PBO: **abstraksi** melalui **kelas abstrak** dan **interface**, serta **polimorfisme** melalui **method overriding** dan **method overloading**.

---

### Struktur Proyek

Berikut adalah struktur file dalam repositori ini:
├── README.md
├── AbstractClass
│   ├── Karyawan.java       (Kelas Abstrak)
│   ├── KaryawanTetap.java
│   ├── KaryawanKontrak.java
│   └── MainAbstract.java   (Kelas utama untuk demo)
├── Interface
│   ├── BangunDatar.java    (Interface)
│   ├── Lingkaran.java
│   ├── Persegi.java
│   └── MainInterface.java  (Kelas utama untuk demo)
├── OverloadOverride
│   ├── Kendaraan.java
│   ├── Mobil.java          (Menggunakan Override)
│   ├── Kalkulator.java     (Menggunakan Overload)
│   └── MainDemo.java       (Kelas utama untuk demo)
└── ...


---

### Ringkasan Konsep

#### 1. Kelas Abstrak vs. Interface

Kedua konsep ini digunakan untuk mencapai **abstraksi**, yaitu menyembunyikan detail implementasi.

| Fitur | **Kelas Abstrak** | **Interface** |
| :--- | :--- | :--- |
| **Implementasi** | Bisa memiliki metode abstrak (tanpa implementasi) dan metode konkret (dengan implementasi). | Semua metode (sebelum Java 8) adalah abstrak secara implisit. Tidak ada implementasi. |
| **Hubungan** | Kelas turunan menggunakan `extends`. Satu kelas hanya bisa `extends` satu kelas abstrak. | Kelas pengimplementasi menggunakan `implements`. Satu kelas bisa `implements` banyak interface. |
| **Penggunaan** | Cocok untuk hubungan `is-a` (misalnya, `Mobil` adalah `Kendaraan`). | Cocok untuk mendefinisikan kemampuan atau "kontrak" (misalnya, `Mobil` bisa `berjalan`, `berhenti`, dsb). |

**Kode:**
* **Kelas Abstrak:** Lihat `AbstractClass/Karyawan.java`
* **Interface:** Lihat `Interface/BangunDatar.java`

---

#### 2. Override vs. Overload

Kedua konsep ini merupakan wujud dari **polimorfisme**, yaitu kemampuan suatu objek untuk mengambil banyak bentuk.

| Konsep | **Method Overriding** | **Method Overloading** |
| :--- | :--- | :--- |
| **Definisi** | Menyediakan implementasi spesifik untuk metode yang sudah ada di kelas induk. | Mendefinisikan beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda dalam satu kelas. |
| **Letak** | Terjadi di antara kelas induk dan kelas turunan (inheritance). | Terjadi dalam satu kelas yang sama. |
| **Aturan** | Nama dan parameter **harus sama**. | Nama **sama**, tetapi jumlah atau tipe parameter **harus berbeda**. |

**Kode:**
* **`Override`**: Lihat bagaimana metode `info()` di `Mobil.java` menimpa metode `info()` dari `Kendaraan.java`.
* **`Overload`**: Lihat bagaimana kelas `Kalkulator.java` memiliki beberapa metode `tambah()` dengan parameter yang berbeda.

---

### Cara Menjalankan Kode

1.  **Clone Repositori:**
    ```bash
    git clone [URL-repositori-Anda]
    ```
2.  **Kompilasi:**
    Pilih folder yang ingin Anda kompilasi (`AbstractClass`, `Interface`, atau `OverloadOverride`) dan jalankan perintah ini di terminal:
    ```bash
    cd [nama-folder]
    javac *.java
    ```
3.  **Jalankan:**
    ```bash
    java [nama-kelas-utama]
    ```
    Contoh: `java MainAbstract` atau `java MainInterface`.
