import java.util.Scanner;
class BangunDatar {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a;  int b;  int c;
        double m;   double n;   double o;
        String bangunDatar[] = {"1.Persegi","2.Persegi Panjang","3.Segitiga",
        "4.Lingkaran","5.Trapesium","6.Layang-Layang","7.Jajar Genjang","8.Belah Ketupat"};
        String bangunRuang[] = {"1.Kubus","2.Balok","3.Prisma Segitiga","4.Limas Segiempat","5.Limas Segitiga","6.Tabung",
        "7.Kerucut","8.Bola"};

        System.out.println("--Pilih Jenis Bangun--");
        System.out.println();
        System.out.println("1.Bangun Datar"+"\n"+"2.Bangun Ruang");
        System.out.println();
        int choose = in.nextInt();
        if ( choose == 1) {
            System.out.println("--Pilih Bangun Datar--");
            printMenu(bangunDatar);
            int second = in.nextInt();
            switch (second) {
                case 1:
                System.out.println("Masukkan panjang rusuk : ");
                a = in.nextInt();
                System.out.println("Luas Persegi = " + luasPersegi(a));
                break;
                case 2:
                System.out.println("Masukkan Panjang dan Lebar");
                a = in.nextInt();
                b = in.nextInt();
                System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang(a, b));
                break;
                case 3:
                System.out.println("Masukkan Alas dan Tinggi : ");
                m = in.nextInt();
                n = in.nextInt();
                System.out.println("Luas Segitiga = " + luasSegitiga(m, n));
                break;
                case 4:
                System.out.println("Masukkan Jari-Jari : ");
                m =in.nextInt();
                System.out.println("Luas Lingkaran = " + luasLingkaran(m));
                break;
                case 5:
                System.out.println("Masukkan sisi 1: "+"\n"+"Sisi 2: "+"\n"+ "Tinggi : ");
                m =in.nextInt();
                n =in.nextInt();
                o = in.nextInt();
                System.out.println("Luas Trapesium = "+ luasTrapesium(m, n, o));
                break;
                case 6:
                System.out.println("Masukkan Diagonal 1 dan 2 : ");
                m =in.nextInt();
                n =in.nextInt();
                System.out.println("Luas Layang Layang : "+ luasLayangLayang(m, n));
                break;
                case 7:
                System.out.println("Masukkan Alas dan Tinggi : ");
                a =in.nextInt();
                b =in.nextInt();
                System.out.println("Luas Jajar Genjang = "+ luasJajarGenjang(a, b) );
                break;
                case 8:
                System.out.println("Masukkan Diagonal 1 & 2 : ");
                m =in.nextInt();
                n =in.nextInt();
                System.out.println("Luas Belah Ketupat = "+ luasBelahKetupat(m, n));
                break;
            }
        }else {
            System.out.println("--Pilih Bangun Ruang--");
            MainMenu(bangunRuang);
            int select = in.nextInt();
            switch (select) {
                case 1:
                System.out.println("Masukkan Luas Sisi : ");
                a = in.nextInt();
                System.out.println("volume Kubus = " + volumeKubus(a));
                break;
                case 2:
                System.out.println("Masukkan Panjang, lebar dan tinggi ");
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
                System.out.println("Volume Balok = " +volumeBalok(a, b, c));
                break;
                case 3:
                System.out.println("Masukkan Alas dan Tinggi : ");
                m = in.nextInt();
                n = in.nextInt();
                o =in.nextInt();
                System.out.println("Volume Prisma Segitiga = " + volumePrismaSegi3(m, n, o));
                break;
                case 4:
                System.out.println("Masukkan Panjang, Lebar dan Tinggi : ");
                m =in.nextInt();
                n =in.nextInt();
                o =in.nextInt();
                System.out.println("Volume Limas Segiempat = " + volumeLimasSegi4(m, n, o));
                break;
                case 5:
                System.out.println("Masukkan Luas Alas dan Tinggi : ");
                m =in.nextInt();
                n =in.nextInt();
                System.out.println("Volume Limas Segitiga = "+ volumeLimasSegi3(m, n));
                break;
                case 6:
                System.out.println("Masukkan Jari-Jari dan Tinggi : ");
                m =in.nextInt();
                n =in.nextInt();
                System.out.println("Volume Tabung : "+ volumeTabung(m, n));
                break;
                case 7:
                System.out.println("Masukkan Jari-Jari dan Tinggi : ");
                m =in.nextInt();
                n =in.nextInt();
                System.out.println("Volume Kerucut = "+ volumeKerucut(m, n) );
                break;
                case 8:
                System.out.println("Masukkan Jari-Jari : ");
                m =in.nextInt();
                System.out.println("Volume Bola = "+ volumeBola(m));
                break;
            }
        }
    }
    static void printMenu(String[] bangunDatar) {
        for (String e : bangunDatar) {
            System.out.println(e);         
        }
    }
    static void MainMenu(String[] bangunRuang) {
        for (String f : bangunRuang) {
            System.out.println(f);
        }
    }
    static int luasPersegi(int a) {
        int luas = a*a;
        return luas;
    }
    static double luasSegitiga(double m,double n) {
        double luas = m*n/2;
        return luas;
    }
    static double luasTrapesium(double m,double n,double o) {
        double luas = (m + n)*o/2;
        return luas;
    }
    static double luasPersegiPanjang(int a, int b) {
        int luas = a*b;
        return luas;
    }
    static double luasLingkaran(double m) {
        double luas = (m*m)*22/7;
        return luas;
    }
    static double luasLayangLayang(double m, double n) {
        double luas = (m*n/2);
        return luas;
    }
    static int luasJajarGenjang(int a, int b) {
        int luas = (a*b);
        return luas;
    }
    static double luasBelahKetupat(double m, double n) {
        double luas = (m*n/2);
        return luas;
    }
    //------------Bangun Ruang---------------//
    static int volumeKubus(int a) {
        int volume = a*a*a;
        return volume;
    }
    static  int volumeBalok(int a, int b, int c) {
        int volume = a*b*c;
        return volume;
    }
    static  double volumePrismaSegi3(double m,double n,double o) {
        double volume = m*n*o/2;
        return volume;
    }
    static double volumeLimasSegi4(double m,double n,double o) {
        double volume = m*n*o/3;
        return volume;
    }
    static double volumeLimasSegi3(double m,double n) {
        double volume = m*n/3;
        return volume;
    }
    static double volumeTabung(double m,double n) {
        double volume = (m*m)*n*22/7;
        return volume;
    }
    static double volumeKerucut(double m,double n) {
        double volume = (m*m)*n*3.14/3;
        return volume;
    }
    static double volumeBola(double m) {
        double volume = (m*m*m)*3.14*4/3;
        return volume;
    }
}