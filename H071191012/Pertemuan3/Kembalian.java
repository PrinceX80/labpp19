import java.util.Scanner;
public class Kembalian {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Harga Barang :");
        int harga = input.nextInt();
        System.out.println(" Jumlah Uang :");
        int uang = input.nextInt();
        int kembali = uang-harga;
        int seratus = 0;
        int limaPuluh = 0;
        int duaPuluh = 0;
        int sepuluh = 0;
        int lima = 0;
        int duaribu = 0;
        int seribu = 0;

        while (kembali>=100000) {
            kembali-=100000;
            seratus++;
        }
        while (kembali>=50000) {
            kembali-=50000;
            limaPuluh++;
        }
        while (kembali>=20000) {
            kembali-=20000;
            duaPuluh++;
        }
        while (kembali>=10000) {
            kembali-=10000;
            sepuluh++;
        }
        while (kembali>=5000) {
            kembali-=5000;
            lima++;
        }
        while (kembali>=2000) {
            kembali-=2000;
            duaribu++;
        }
        while (kembali>=1000) {
            kembali-=1000;
            seribu++;
        }
            System.out.println(seratus + " uang Rp. 100.000");
            System.out.println(limaPuluh + " uang Rp. 50.000");
            System.out.println(duaPuluh + " uang Rp. 20.000");
            System.out.println(sepuluh + " uang Rp. 10.000");
            System.out.println(lima + " uang Rp. 5.000");
            System.out.println(duaribu + " uang Rp. 2.000");
            System.out.println(seribu + " uang Rp. 1.000");    
    }
}