import java.util.Scanner;
class TugasPraktikum3{
    public static void main(String[] args) {
        double w=0;
        double x=0;
        Scanner ww = new Scanner(System.in);
        System.out.print("Ketinggian menara : ");
        double h = ww.nextDouble();
        System.out.print("sudut elevasi ujung depan : ");
        double a = ww.nextDouble();
        System.out.print("sudut evelasi ujung belakang : ");
        double b = ww.nextDouble();

        if(a<90 && b<a) {
            w=Math.tan(Math.toRadians(a))*h;
            x=Math.tan(Math.toRadians(b))*h;

            double panjang = w-x;
            System.out.printf("Panjang kapal adalah %.1f m" , panjang);
        }

        
    }
}