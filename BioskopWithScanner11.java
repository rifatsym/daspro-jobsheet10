import java.util.Scanner;
public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int menu, baris, kolom;
        String nama, next;

        while (true) {
            System.out.println("---MENU---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan Nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan Baris (1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan Kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine();
                
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Nomor baris/kolom tidak tersedia. Silahkan Coba lagi!");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    break;
                }

            } else if (menu == 2) {
                System.out.println("---Daftar Penonton---");

                for(int i = 0; i < 4; i++){
                    for(int j = 0; j < 2; j++){
                        System.out.print((penonton[i][j] == null ? "***" : penonton[i][j] + "\t"));
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terimakasih");
                break;
            } else {
                System.out.println("Pilihan Menu Tidak Vadlid!");
            }
        }
    }
}
