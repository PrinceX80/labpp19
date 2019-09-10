import java.util.Scanner;
class Praktikum3{   
    public static void main(String[] args){
        Scanner sya = new Scanner(System.in);

        int waktu;
        int kecepatan;
        
        System.out.printf("input waktu (jam):");
        waktu = sya.nextInt();
        
        System.out.printf("input kecepatan (km/jam):");
        kecepatan = sya.nextInt();
       
        double jarak = waktu*kecepatan;
        double bensin = jarak/14;
        
        System.out.printf("bensin yang digunakan: %.3f liter ", bensin);
    }
}