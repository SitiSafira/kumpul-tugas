package evaluasi_modul1;

import java.util.ArrayList;
import java.util.Scanner;

public class Evaluasi_Modul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Integer> itemPrices = new ArrayList<>();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Item Belanjaan");
            System.out.println("2. Hapus Item Belanjaan");
            System.out.println("3. Tampilkan Seluruh Item Belanjaan");
            System.out.println("4. Cari Item Belanjaan");
            System.out.println("0. Keluar dari program");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Item Belanjaan: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan Harga Item Belanjaan: ");
                    int price = input.nextInt();
                    itemNames.add(name);
                    itemPrices.add(price);
                    System.out.println("Item Belanjaan Telah Ditambahkan!");
                    break;

                case 2:
                    System.out.print("Masukkan Nama Item yang Akan Dihapus: ");
                    String deleteName = input.nextLine();
                    int indexToRemove = itemNames.indexOf(deleteName);
                    if (indexToRemove != -1) {
                        itemNames.remove(indexToRemove);
                        itemPrices.remove(indexToRemove);
                        System.out.println("Item Belanjaan Telah Dihapus!");
                    } else {
                        System.out.println("Tidak ada item yang di hapus harap masukkan nama item yang sesuai!!!");
                    }
                    break;

                case 3:
                    System.out.println("Daftar Seluruh Item Belanjaan:");
                    for (int i = 0; i < itemNames.size(); i++) {
                        System.out.println(
                            (i + 1) + ". Nama: " + itemNames.get(i) + 
                            ", Harga: " + itemPrices.get(i));
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Item yang Dicari: ");
                    String searchName = input.nextLine();
                    int indexToFind = itemNames.indexOf(searchName);
                    if (indexToFind != -1) {
                        System.out.println("Item Ditemukan: ");
                        System.out.println(
                            "Nama: " + itemNames.get(indexToFind) + 
                            ", Harga: " + itemPrices.get(indexToFind));
                    } else {
                        System.out.println("Item Belanjaan Tidak Ditemukan!");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Menu Tidak Tersedia!");
            }
            System.out.println();
        } while (choice != 0);

        input.close();
    }
}