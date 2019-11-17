import java.util.Scanner;
class tugaspraktikum9{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println(" Masukkan jumlah deret fibonacci");
        int x= ww.nextInt();
        long n0 = 0; 
        long n1 = 1;
        for(int i = 0; i<x; i++){
            System.out.print(n0 + " ");
            long n = n1 + n0;
            n0 = n1; 
            n1 = n;
        }
    }
}        