import java.util.Scanner;
class Tugaspratikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int menit;
        int detik;
        int a;

        System.out.println("Masukkan Detik : ");
        a = sc.nextInt();
        jam = a / 3600;
        a = a%3600;
        menit = a / 60;
        a = a%60;
        detik = a;
        System.out.printf("%02d : %02d : %02d", jam, menit, detik);
        
    }
}