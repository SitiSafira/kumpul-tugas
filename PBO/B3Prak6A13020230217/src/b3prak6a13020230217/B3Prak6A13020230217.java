package b3prak6a13020230217;

import java.util.ArrayList;
import java.util.Scanner;

public class B3Prak6A13020230217 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== DAFTAR MAHASISWA =====");
        System.out.print("Input Nama : ");
        String nama = input.nextLine();
        System.out.print("Input NIM : ");
        String nim = input.nextLine();
        System.out.print("Input Prodi : ");
        String prodi = input.nextLine();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi);
        
        String pilih;
        do{
            System.out.println("\n===== Pilih Mata Kuliah =====");
            System.out.println("1. Pemrograman Berorientasi Objek");
            System.out.println("2. Algoritma dan Pemrograman 2");
            System.out.println("3. Jaringan Komputer");
            System.out.println("4. Selesai");
            System.out.print("Pilih Mata Kuliah : ");
            pilih = input.nextLine();
            
            switch (pilih){
                case "1":
                    Mahasiswa.MataKuliah pbo = new Mahasiswa.MataKuliah("Pemrograman Berorientasi Objek", 3);
                    mahasiswa.tambahMataKuliah(pbo);
                    System.out.println("Berhasil menambahkan matakuliah");
                    break;
                case "2":
                    Mahasiswa.MataKuliah alpro = new Mahasiswa.MataKuliah("Algoritma dan Pemrograman 2", 3);
                    mahasiswa.tambahMataKuliah(alpro);
                    System.out.println("Berhasil menambahkan matakuliah");
                    break;
                case "3":
                    Mahasiswa.MataKuliah jarkom = new Mahasiswa.MataKuliah("Jaringan Komputer", 3);
                    mahasiswa.tambahMataKuliah(jarkom);
                    System.out.println("Berhasil menambahkan matakuliah");
                    break;
                default :
                    System.out.println("Berhasil menambahkan matakuliah");
                    break;
            }
        } while (!pilih.equals("4"));
        
        System.out.println("\n");
        mahasiswa.infoMahasiswa();
    }
    
}
