import java.util.Scanner;
class Praktikum1{
    public static void main(String[] args) {
        Scanner tri = new Scanner(System.in);

        System.out.printf("alas :");
        double a = tri.nextDouble();

        System.out.printf("tinggi :");
        double t = tri.nextDouble();
        
        double l = a*t / 2;
        System.out.printf( "Luas segitiga = %.1f ",l );
    }
}