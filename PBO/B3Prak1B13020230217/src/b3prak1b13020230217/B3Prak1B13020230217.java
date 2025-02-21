package b3prak1b13020230217;

import java.util.ArrayList;
import java.util.Scanner;

public class B3Prak1B13020230217 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> mahasiswa = new ArrayList<>();
        
        int pilihan = 0;
        
        do {
            System.out.println("Daftar Mahasiswa: ");
            System.out.println("1. Tambah Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar dari Program");
            
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Consume the leftover newline
            
            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String mhs = input.nextLine();
                    
                    mahasiswa.add(mhs);
                    
                    System.out.println("Mahasiswa Telah DiTambahkan!");
                    break;
                case 2:
                    System.out.println("Daftar Seluruh Mahasiswa : ");
                    for (String value : mahasiswa) {
                        System.out.println("Nama : " + value);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
            System.out.println();
        } while (pilihan != 0);
    }
}