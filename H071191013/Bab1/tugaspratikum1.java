import java.util.Scanner;
class Tugaspratikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waktu;
        int kecepatan;
        double efesiensi;
        double hasil;
        
        System.out.println("Masukkan Waktu");
        waktu = sc.nextInt();
        System.out.println("Masukkan Kecepatan");
        kecepatan = sc.nextInt();
        efesiensi = 14;
        hasil = (waktu * kecepatan) / efesiensi;
        System.out.printf("Bensin Yang Digunakan = %.2f L" , hasil);
    }
}