package konfersibilangan;

import java.util.Scanner;

public class KonfersiBilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu Konversi Bilangan:");
            System.out.println("1. Biner ke Desimal, Oktal, Heksadesimal");
            System.out.println("2. Oktal ke Desimal, Biner, Heksadesimal");
            System.out.println("3. Heksadesimal ke Desimal, Biner, Oktal");
            System.out.println("4. Desimal ke Biner, Oktal, Heksadesimal");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = input.next();
                    try {
                        int desimalBiner = Integer.parseInt(biner, 2);
                        System.out.println("Desimal: " + desimalBiner);
                        System.out.println("Oktal: " + Integer.toOctalString(desimalBiner));
                        System.out.println("Heksadesimal: " + Integer.toHexString(desimalBiner).toUpperCase());
                    } catch (NumberFormatException e) {
                        System.out.println("Input biner tidak valid.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan bilangan oktal: ");
                    String oktal = input.next();
                    try {
                        int desimalOktal = Integer.parseInt(oktal, 8);
                        System.out.println("Desimal: " + desimalOktal);
                        System.out.println("Biner: " + Integer.toBinaryString(desimalOktal));
                        System.out.println("Heksadesimal: " + Integer.toHexString(desimalOktal).toUpperCase());
                    } catch (NumberFormatException e) {
                        System.out.println("Input oktal tidak valid.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksa = input.next();
                    try {
                        int desimalHeksa = Integer.parseInt(heksa, 16);
                        System.out.println("Desimal: " + desimalHeksa);
                        System.out.println("Biner: " + Integer.toBinaryString(desimalHeksa));
                        System.out.println("Oktal: " + Integer.toOctalString(desimalHeksa));
                    } catch (NumberFormatException e) {
                        System.out.println("Input heksadesimal tidak valid.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan bilangan desimal: ");
                    try {
                        int desimal = input.nextInt();
                        System.out.println("Biner: " + Integer.toBinaryString(desimal));
                        System.out.println("Oktal: " + Integer.toOctalString(desimal));
                        System.out.println("Heksadesimal: " + Integer.toHexString(desimal).toUpperCase());
                    } catch (NumberFormatException e) {
                        System.out.println("Input desimal tidak valid.");
                    }
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 0);

        input.close();
    }
}