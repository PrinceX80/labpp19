import java.util.Scanner;
class Latihan2{
    public static void main(String[] args) {
        Scanner ying =new Scanner(System.in);
        System.out.println("Hasil Nilai AB");
        int matrix[][]=new int[2][2];
        System.out.println("==");
        matrix[0][0]=4;
        matrix[0][1]=3;
        matrix[1][0]=3;
        matrix[1][1]=2;
        System.out.println("Hasil Nilai BA");
        int matrix2[][]=new int[2][2];
        System.out.println("==");
        matrix2[0][0]=5;
        matrix2[0][1]=4;
        matrix2[1][0]=3;
        matrix2[1][1]=2;
        for(int i=0;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                int elem =matrix[i][j]*matrix2[i][j];
                System.out.print(elem +" ");
            }
            System.out.println();
        }
    }
}