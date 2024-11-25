import java.util.Scanner;
public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        for(int i = 0; i < jumlahSiswa; i++){
            System.out.print("Input nilai mahasiswa ke-" + (i+1) + ": ");
            double totalPerSiswa = 0;

            for(int j = 0; j < jumlahMataKuliah; j++){
                System.out.println("\nNilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata - rata: " + totalPerSiswa/jumlahMataKuliah);
        }

        System.out.println("\n============================");
        System.out.println("Rata - rata nilai setiap mata kuliah: ");

        for(int j = 0; j < jumlahMataKuliah; j++){
            double totalPerMatkul = 0;
            for(int i = 0; i < jumlahSiswa; i++){
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul / jumlahSiswa);
        }
    }
}
