import java.util.Scanner;
class Praktikum2{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.printf(" Input Nama :");
        String out = input.nextLine();
        
        System.out.printf(" Input Tinggi :");
        int a = input.nextInt();
        
        System.out.printf(" Input Berat :");
        int b = input.nextInt();
        
        System.out.println("persentase (laki-laki = 10%)(perempuan = 15%) :");
        double c = input.nextDouble();
        
        double d = (a - 100) - (a-100) * c/100;
        System.out.println("berat badan ideal "+ d + "kg");

        double e = d - b;
        System.out.printf("target berat badan %.1f kg", e);
    }
}