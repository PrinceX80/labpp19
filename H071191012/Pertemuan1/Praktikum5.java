import java.util.Scanner;
class Praktikum5 {
    public static void main (String[] args){
        Scanner boat = new Scanner(System.in);
        
        System.out.println("tinggi menara:");
        int h = boat.nextInt();

        System.out.println("sudut depan:");
        int a = boat.nextInt();

        System.out.println("sudut belakang:");
        int b = boat.nextInt();

        double l = h*(Math.tan(Math.toRadians(b)));
        double trueL = ((Math.tan(Math.toRadians(a)))*h)-l;
        System.out.printf("panjang kapal %4.1f m", trueL);
    }
}