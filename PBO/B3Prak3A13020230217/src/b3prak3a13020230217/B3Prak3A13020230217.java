package b3prak3a13020230217;

import java.util.Scanner;
import universitas.ugm.MahasiswaUgm;
import universitas.umi.MahasiswaUmi;

public class B3Prak3A13020230217 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        MahasiswaUmi mhsUmi = new MahasiswaUmi("Jhon Due", "1302023");
        MahasiswaUgm mhsUgm = new MahasiswaUgm("Iskandar", "1302024");
        
        System.out.println("Mahasiswa : ");
        System.out.println("1. Tampilkan Mahasiswa UMI");
        System.out.println("2. Tampilkan Mahasiswa UGM");
        System.out.print("Masukkan Pilihan: ");
        int pil = input.nextInt();
        
        switch(pil){
            case 1:
                System.out.println(mhsUmi.universitas);
                System.out.println("Nama Mahasiswa: " + mhsUmi.name);
                System.out.println("Stambuk Mahasiswa: " + mhsUmi.stb);
                break;
            case 2:
                System.out.println(mhsUgm.universitas);
                System.out.println("Nama Mahasiswa: " + mhsUgm.name);
                System.out.println("Nim Mahasiswa: " + mhsUgm.stb);
                break;
                
            default:
                System.out.println("Menu tidak tersedia!");
        }
    }
    
}
