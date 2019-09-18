import java.util.Scanner;
class Tugaspratikum3 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double e;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tinggi Menara : ");
        a = sc.nextDouble();
        System.out.println("Sudut Elevasi Ujung Depan : ");
        b = sc.nextDouble();
        System.out.println("Sudut Elevasi Ujung Belakang : ");
        c = sc.nextDouble();

        d=Math.tan(Math.toRadians(b))*a;
        e=Math.tan(Math.toRadians(c))*a;

        double panjang = d-e;
        System.out.printf("Panjang Kapal Adalah %.1f m", panjang);
    }
}