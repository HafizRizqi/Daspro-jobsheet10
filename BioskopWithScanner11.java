import java.util.Scanner;
public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];
        while(true) {
            System.out.println("-----MENU-----");
            System.out.println("Ketik '1' Input Data Penonton. ");
            System.out.println("Ketik '2' Daftar Penonton. ");
            System.out.println("Ketik '3' Exit");
            System.out.println("Pilih menu: ");
             int menu = sc.nextInt();
            sc.nextLine();
        
        if (menu == 1) {
            while (true) { 
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
              while (true) {
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();
            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                System.out.println("Nomor baris/kolom tidak tersedia. Silahkan masukkan kembali.");
            } else if (penonton[baris - 1][kolom - 1] != null) {
                System.out.println("Maaf, kursi sudah terisi:) Silahkan pilih kursi lain.");
            } else {
                penonton[baris - 1][kolom - 1] = nama;
                break;
            }

            
        }
        System.out.print("Input nama penonton lainnya? (y/n): ");
            next = sc.nextLine();
            if(next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
           
        if (menu == 2) {
            System.out.println("Daftar penonton: ");

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-"+(i+1)+ ": "+ String.join(", ", penonton[i]));
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] == null) {
                    System.out.print("*** ");
                } else {
                    System.out.print(penonton[i][j] + " ");
                }
            }
            System.out.println();
        }
        }else if (menu == 3) {
            System.out.println("Terima kasih:)");
            break;
        } 
        }
}
    }