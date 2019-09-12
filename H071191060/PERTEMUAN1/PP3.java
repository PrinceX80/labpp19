import java.util.Scanner;
class PP3{
    public static void main(String[] args) {
        Scanner pro = new Scanner(System.in);
        int h = pro.nextInt();
        int a = pro.nextInt();
        int b = pro.nextInt();
        
        double sudut =(Math.tan(Math.toRadians(a) ));
        double alas = sudut * h;

        double sudut2 =(Math.tan(Math.toRadians(b) ));
        double alas2 = sudut2 * h;

        double panjangkapal1= alas - alas2;

        System.out.printf("%.2f", panjangkapal1);
    }
}