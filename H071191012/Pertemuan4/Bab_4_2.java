import java.util.Scanner;
class Bab_4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =in.nextInt();
        int j =in.nextInt();
        int k =in.nextInt();
        int a[][] = new int[i][j];
        int b[][] = new int[j][k];
        int c[][] = new int[i][k];

        //Untuk Matrix A
        System.out.print("Input Matrix A: ");
        for (int p = 0; p < i; p++) {
            for (int q =0; q < j; q++) {
                a[p][q] = in.nextInt();
                System.out.print(a[p][q]+" ");
            }
        System.out.println();
        }
        System.out.print("Input Matrix B: ");
        for (int p = 0; p < j; p++) {
            for (int q =0; q< k; q++) {
                b[p][q] = in.nextInt();
                System.out.print(b[p][q]+" ");
            }
            System.out.println();
        }
        System.out.println("Hasil Perkalian Matrix A dan Matrix B"+"\n");
        for (int p = 0; p < i; p++) {
            for (int q =0; q < k; q++) {
                int hasil = 0;
                for (int r =0; r < j; r++) {
                    hasil += a[p][r]*b[r][q];
                }
                System.out.print(hasil + " ");
            }System.out.println();
        }
     }
}