import java.util.Scanner;
class TugasArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[i][j];
        int[][] b = new int[j][k];
        

        //Untuk Matriks A
        System.out.println("Untuk Matriks A");
        for (int p = 0; p < i; p++){
            for (int q = 0; q < j; q++){
                
                a[p][q] = sc.nextInt();
                System.out.print(a[p][q] + " ");
            }
            System.out.println();    
        }
        //Untuk Matriks B
        System.out.println("Untuk Matriks B");
        for (int q = 0; q < j; q++){
            for (int r = 0; r < k; r++){
                
                b[q][r] = sc.nextInt();
                System.out.print(b[q][r] + " ");  
            }
            System.out.println();   
        }
        //Matriks A X Matriks B
        System.out.println("Matriks A x Matriks B");
        for (int p = 0; p < i; p++){
            for (int r = 0; r < k; r++){
                int hasil = 0;
                for (int q =0; q < j; q++){
                    hasil += a[p][q]*b[q][r];
                }
                System.out.print(hasil + " ");
            }
            System.out.println();    
        }
    }
}