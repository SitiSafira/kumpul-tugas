package evaluasi_modul2;

import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    String judul;
    String penulis;
    boolean dipinjam;
    String namaPeminjam;
    String tanggalPeminjaman;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }

    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + (dipinjam ? " (Dipinjam)" : "");
    }
}

public class Evaluasi_Modul2 {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahBuku() {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan penulis buku: ");
        String penulis = scanner.nextLine();
        daftarBuku.add(new Buku(judul, penulis));
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void lihatBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku di perpustakaan.");
            return;
        }
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
    }

    public void pinjamBuku() {
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String judul = scanner.nextLine();
        for (Buku buku : daftarBuku) {
            if (buku.judul.equalsIgnoreCase(judul) && !buku.dipinjam) {
                System.out.print("Masukkan nama peminjam: ");
                buku.namaPeminjam = scanner.nextLine();
                System.out.print("Masukkan tanggal peminjaman: ");
                buku.tanggalPeminjaman = scanner.nextLine();
                buku.dipinjam = true;
                System.out.println("Buku berhasil dipinjam.");
                return;
            }
        }
        System.out.println("Buku tidak tersedia atau sudah dipinjam.");
    }

    public void lihatPeminjaman() {
        System.out.println("Daftar Buku yang Dipinjam:");
        for (Buku buku : daftarBuku) {
            if (buku.dipinjam) {
                System.out.println("Judul: " + buku.judul + ", Peminjam: " + buku.namaPeminjam + ", Tanggal Peminjaman: " + buku.tanggalPeminjaman);
            }
        }
    }

    public void kembalikanBuku() {
        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
        String judul = scanner.nextLine();
        for (Buku buku : daftarBuku) {
            if (buku.judul.equalsIgnoreCase(judul) && buku.dipinjam) {
                buku.dipinjam = false;
                System.out.println("Buku berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan atau belum dipinjam.");
    }

    public void menu() {
        boolean running = true;
        while (running) {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Lihat Peminjaman");
            System.out.println("5. Kembalikan Buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1 -> tambahBuku();
                case 2 -> lihatBuku();
                case 3 -> pinjamBuku();
                case 4 -> lihatPeminjaman();
                case 5 -> kembalikanBuku();
                case 6 -> {
                    System.out.println("Terima kasih!");
                    running = false;
                }
                default -> System.out.println("Opsi tidak valid.");
            }
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        Evaluasi_Modul2 perpustakaan = new Evaluasi_Modul2();
        perpustakaan.menu();
    }
}