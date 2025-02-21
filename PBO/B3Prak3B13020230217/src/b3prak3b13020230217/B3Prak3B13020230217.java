package b3prak3b13020230217;

import java.util.Scanner;
import perpustakaan.Buku;

public class B3Prak3B13020230217 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Buku[] books = new Buku[10];
        
        System.out.println("Program Perpustakaan");
        System.out.println("====================");
        
        while(true){
            System.out.println("Menu: ");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = scanner.nextInt();
            
            if (menu == 1){
                if(Buku.count >= 10){
                    System.out.println("Maaf, maksimum buku sudah tercapai.");
                    continue;
                }
                
                System.out.print("Judul: ");
                scanner.nextLine();
                String title = scanner.next();
                System.out.print("Penulis: ");
                String author = scanner.next();
                
                books[Buku.count] = new Buku(title, author);
                
                System.out.println("Buku berhasil ditambahkan.");
            } else if (menu == 2) {
                System.out.println("Daftar Buku:");
                System.out.println("============");
                for (int i = 0; i < Buku.count; i++){
                    Buku book = books[i];
                    System.out.println("Buku " + (i+1));
                    System.out.println("Judul: " + book.title);
                    System.out.println("Penulis: " + book.author);
                    System.out.println();
                }
            } else if (menu == 3){
                System.out.println("Terima kasih.");
            } else {
                System.out.println("Menu tidak valid.");
            }
        }
    }
    
}
