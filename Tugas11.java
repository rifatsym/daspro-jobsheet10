import java.util.Scanner;

public class Tugas11 {
    public static void main(String[] args) {
        int[][] surveyResults = new int[10][6]; 
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (nilai 1-5): ");
                surveyResults[i][j] = scanner.nextInt();

                while (surveyResults[i][j] < 1 || surveyResults[i][j] > 5) {
                    System.out.print("Nilai harus antara 1 dan 5. Masukkan lagi: ");
                    surveyResults[i][j] = scanner.nextInt();
                }
            }
        }

        System.out.println("\nHasil Survei:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Responden " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(surveyResults[i][j] + " ");
            }
            System.out.println();
        }
    }
}
