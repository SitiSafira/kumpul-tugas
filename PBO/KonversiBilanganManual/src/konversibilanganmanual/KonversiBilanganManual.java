package konversibilanganmanual;

import java.util.Scanner;

public class KonversiBilanganManual {

    // Desimal
    public static String desimalKeBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        while (desimal > 0) {
            biner.insert(0, desimal % 2);
            desimal /= 2;
        }
        return biner.length() > 0 ? biner.toString() : "0";
    }

    public static String desimalKeOktal(int desimal) {
        StringBuilder oktal = new StringBuilder();
        while (desimal > 0) {
            oktal.insert(0, desimal % 8);
            desimal /= 8;
        }
        return oktal.length() > 0 ? oktal.toString() : "0";
    }

    public static String desimalKeHeksadesimal(int desimal) {
        StringBuilder heksa = new StringBuilder();
        while (desimal > 0) {
            int sisa = desimal % 16;
            char karakterHeksa;
            if (sisa < 10) {
                karakterHeksa = (char) (sisa + '0');
            } else {
                karakterHeksa = (char) (sisa - 10 + 'A');
            }
            heksa.insert(0, karakterHeksa);
            desimal /= 16;
        }
        return heksa.length() > 0 ? heksa.toString() : "0";
    }

    // Biner
    public static int binerKeDesimal(String biner) {
        int desimal = 0;
        int panjang = biner.length();
        for (int i = 0; i < panjang; i++) {
            if (biner.charAt(i) == '1') {
                desimal += Math.pow(2, panjang - 1 - i);
            }
        }
        return desimal;
    }

    public static String binerKeOktal(String biner) {
        int panjang = biner.length();
        while (panjang % 3 != 0) { // Tambahkan nol di depan jika panjang tidak kelipatan 3
            biner = "0" + biner;
            panjang++;
        }

        StringBuilder oktal = new StringBuilder();
        for (int i = 0; i < panjang; i += 3) {
            int digit = (biner.charAt(i) - '0') * 4 + (biner.charAt(i + 1) - '0') * 2 + (biner.charAt(i + 2) - '0') * 1;
            oktal.append(digit);
        }
        return oktal.toString();
    }

    public static String binerKeHeksadesimal(String biner) {
        int panjang = biner.length();
        while (panjang % 4 != 0) { // Tambahkan nol di depan jika panjang tidak kelipatan 4
            biner = "0" + biner;
            panjang++;
        }

        StringBuilder heksa = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < panjang; i += 4) {
            int digit = (biner.charAt(i) - '0') * 8 + (biner.charAt(i + 1) - '0') * 4 +
                        (biner.charAt(i + 2) - '0') * 2 + (biner.charAt(i + 3) - '0') * 1;
            heksa.append(hexChars[digit]);
        }
        return heksa.toString();
    }

    // Oktal
    public static int oktalKeDesimal(String oktal) {
        int desimal = 0;
        int panjang = oktal.length();
        for (int i = 0; i < panjang; i++) {
            int digit = oktal.charAt(i) - '0';
            desimal += digit * Math.pow(8, panjang - 1 - i);
        }
        return desimal;
    }

    public static String oktalKeBiner(String oktal) {
        int desimal = oktalKeDesimal(oktal);
        return desimalKeBiner(desimal);
    }

    public static String oktalKeHeksadesimal(String oktal) {
        // Pastikan jumlah digit Oktal kelipatan 3 dengan menambahkan nol di depan jika perlu
        while (oktal.length() % 3 != 0) {
            oktal = "0" + oktal;
        }

        StringBuilder heksa = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < oktal.length(); i += 3) {
            int nilai = (oktal.charAt(i) - '0') * 64 +   // 8^2 = 64
                        (oktal.charAt(i + 1) - '0') * 8 +  // 8^1 = 8
                        (oktal.charAt(i + 2) - '0');      // 8^0 = 1
            heksa.append(hexChars[nilai]);
        }

        return heksa.toString().replaceFirst("^0+(?!$)", ""); // Hapus nol di depan jika ada
    }


    // Heksadesimal
    public static int heksadesimalKeDesimal(String heksa) {
        int desimal = 0;
        int panjang = heksa.length();
        for (int i = 0; i < panjang; i++) {
            char karakter = heksa.charAt(i);
            int nilaiDigit;
            if (karakter >= '0' && karakter <= '9') {
                nilaiDigit = karakter - '0';
            } else if (karakter >= 'A' && karakter <= 'F') {
                nilaiDigit = karakter - 'A' + 10;
            } else if (karakter >= 'a' && karakter <= 'f') {
                nilaiDigit = karakter - 'a' + 10;
            } else {
                return -1; // Invalid input
            }
            desimal += nilaiDigit * Math.pow(16, panjang - 1 - i);
        }
        return desimal;
    }

    public static String heksadesimalKeBiner(String heksa) {
        StringBuilder biner = new StringBuilder();

        for (char c : heksa.toUpperCase().toCharArray()) {
            int nilai;

            // Konversi karakter heksadesimal ke desimal
            if (c >= '0' && c <= '9') {
                nilai = c - '0';
            } else {
                nilai = c - 'A' + 10;
            }

            // Konversi nilai desimal (0-15) ke 4-bit biner
            StringBuilder tempBiner = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                tempBiner.insert(0, nilai % 2); // Simpan hasil modulus di awal
                nilai /= 2;
            }

            biner.append(tempBiner);
        }

        return biner.toString().replaceFirst("^0+(?!$)", ""); // Hapus nol di depan jika ada
    }


    public static String heksadesimalKeOktal(String heksa) {
        // Langkah 1: Konversi Heksadesimal ke Biner
        String biner = heksadesimalKeBiner(heksa);

        // Langkah 2: Pastikan jumlah digit biner kelipatan 3
        while (biner.length() % 3 != 0) {
            biner = "0" + biner;
        }

        // Langkah 3: Konversi Biner ke Oktal
        StringBuilder oktal = new StringBuilder();
        for (int i = 0; i < biner.length(); i += 3) {
            int nilai = (biner.charAt(i) - '0') * 4 + 
                        (biner.charAt(i + 1) - '0') * 2 + 
                        (biner.charAt(i + 2) - '0');
            oktal.append(nilai);
        }

        return oktal.toString().replaceFirst("^0+(?!$)", ""); 
    }


     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nPilih jenis konversi:");
            System.out.println("1. Desimal ke Biner");
            System.out.println("2. Desimal ke Oktal");
            System.out.println("3. Desimal ke Heksadesimal");
            System.out.println("4. Biner ke Desimal");
            System.out.println("5. Biner ke Oktal");
            System.out.println("6. Biner ke Heksadesimal");
            System.out.println("7. Oktal ke Desimal");
            System.out.println("8. Oktal ke Biner");
            System.out.println("9. Oktal ke Heksadesimal");
            System.out.println("10. Heksadesimal ke Desimal");
            System.out.println("11. Heksadesimal ke Biner");
            System.out.println("12. Heksadesimal ke Oktal");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            
            if (pilihan == 0) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }
            
            String input;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan Desimal: ");
                    int desimal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Hasil: " + desimalKeBiner(desimal));
                    break;
                case 2:
                    System.out.print("Masukkan bilangan Desimal: ");
                    desimal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Hasil: " + desimalKeOktal(desimal));
                    break;
                case 3:
                    System.out.print("Masukkan bilangan Desimal: ");
                    desimal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Hasil: " + desimalKeHeksadesimal(desimal));
                    break;
                case 4:
                    System.out.print("Masukkan bilangan Biner: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + binerKeDesimal(input));
                    break;
                case 5:
                    System.out.print("Masukkan bilangan Biner: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + binerKeOktal(input));
                    break;
                case 6:
                    System.out.print("Masukkan bilangan Biner: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + binerKeHeksadesimal(input));
                    break;
                case 7:
                    System.out.print("Masukkan bilangan Oktal: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + oktalKeDesimal(input));
                    break;
                case 8:
                    System.out.print("Masukkan bilangan Oktal: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + oktalKeBiner(input));
                    break;
                case 9:
                    System.out.print("Masukkan bilangan Oktal: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + oktalKeHeksadesimal(input));
                    break;
                case 10:
                    System.out.print("Masukkan bilangan Heksadesimal: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + heksadesimalKeDesimal(input));
                    break;
                case 11:
                    System.out.print("Masukkan bilangan Heksadesimal: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + heksadesimalKeBiner(input));
                    break;
                case 12:
                    System.out.print("Masukkan bilangan Heksadesimal: ");
                    input = scanner.nextLine();
                    System.out.println("Hasil: " + heksadesimalKeOktal(input));
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
        scanner.close();
    }
        
}