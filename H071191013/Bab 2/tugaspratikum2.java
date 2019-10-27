import java.util.Scanner;
class Tugaspratikum2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("Input Angka Sesuai Dengan Menu Yang Diinginkan : ");
        int input1 = scan.nextInt();
        if (input1 == 1){
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajargenjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-Layang");
            int input11 = scan.nextInt();
            if(input11 == 1){
                System.out.println("Input Sisi : ");
                int panjang = scan.nextInt();
                double persegi = Math.pow(panjang, 2);
                System.out.println("Luas Persegi = " + persegi);
            }if(input11 == 2){
                System.out.println("Input Panjang : ");
                int panjang = scan.nextInt();
                System.out.println("Input Lebar : ");
                int lebar = scan.nextInt();
                double persegiPanjang = panjang * lebar;
                System.out.println("Luas Persegi Panjang : " + persegiPanjang);
            }if(input11 == 3){
                System.out.println("Input Alas");
                int alas = scan.nextInt();
                System.out.println("Input Tinggi");
                int tinggi = scan.nextInt();
                double segitiga = (alas * tinggi)/2;
                System.out.println("Luas Segitiga : " + segitiga);
            }if(input11 == 4){
                System.out.println("Input Jari Jari");
                int jari = scan.nextInt();
                double lingkaran = Math.PI * (Math.pow(jari, 2));
                System.out.println("Luas Lingkaran : " + lingkaran);
            }if(input11 == 5){
                System.out.println("Input Alas");
                int alas = scan.nextInt();
                System.out.println("Input Tinggi");
                int tinggi = scan.nextInt();
                double jajargenjang = alas * tinggi;
                System.out.println("Luas Jajargenjang : " + jajargenjang);
            }if(input11 == 6){
                System.out.println("Input Sisi Bawah");
                int sisiBawah = scan.nextInt();
                System.out.println("Input Sisi Atas");
                int sisiAtas = scan.nextInt();
                System.out.println("Input Tinggi");
                int tinggi = scan.nextInt();
                double trapesium = (sisiBawah +sisiAtas) * tinggi / 2;
                System.out.println("Luas Trapesium : " + trapesium);
            }if(input11 == 7){
                System.out.println("Input Diagonal 1");
                int d1 = scan.nextInt();
                System.out.println("Input Diagonal 2");
                int d2 = scan.nextInt();
                double belahKetupat = d1 * d2 /2;
                System.out.println("Luas Belah Ketupat : " + belahKetupat);
            }if(input11 == 8){
                System.out.println("Input Diagonal 1");
                int d1 = scan.nextInt();
                System.out.println("Input Diagonal 2");
                int d2 = scan.nextInt();
                double layang = d1 * d2 /2;
                System.out.println("Luas Layang-Layang : " + layang); 
            }
            }
            if(input1 == 2){
            System.out.println("** Pilih Bangun Ruang **");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Prisma Segitiga");
            System.out.println("4. Limas Segiempat");
            System.out.println("5. Limas Segitiga");
            System.out.println("6. Tabung");
            System.out.println("7. Kerucut");
            System.out.println("8. Bola");
            int input2 = scan.nextInt();
            if(input2 == 1){
                System.out.println("Input Sisi");
                int sisi = scan.nextInt();
                double kubus = Math.pow(sisi, 3);
                System.out.println("Volume Kubus : " + kubus);
            }if(input2 == 2){
                System.out.println("Input Panjang");
                int panjang = scan.nextInt();
                System.out.println("Input Lebar");
                int lebar = scan.nextInt();
                System.out.println("Input Tinggi");
                int tinggi = scan.nextInt();
                double balok = panjang * lebar * tinggi;
                System.out.println("Volume Balok : " + balok);
            }if(input2 == 3){
                System.out.println("Input Alas Segitiga");
                int alasSegitiga = scan.nextInt();
                System.out.println("Input Tinggi Segitiga");
                int tinggiSegitiga = scan.nextInt();
                System.out.println("Input Tinggi Prisma");
                int tinggiPrisma = scan.nextInt();
                double prisma = ( alasSegitiga * tinggiSegitiga * tinggiPrisma) / 2;
                System.out.println("Volume Prisma Segitiga : " + prisma);
            }if(input2 == 4){
                System.out.println("Input Panjang Alas : ");
                int panjangAlas = scan.nextInt();
                System.out.println("Input Lebar Alas : ");
                int lebarAlas = scan.nextInt();
                System.out.println("Input Tinggi Limas : ");
                int tinggiLimas = scan.nextInt();
                double limasSegiempat = (panjangAlas * lebarAlas * tinggiLimas) / 3;
                System.out.println("Volume Limas Segiempat : " + limasSegiempat);
            }if(input2 == 5){
                System.out.println("Input Alas Segitiga : ");
                int alasSegitiga = scan.nextInt();
                System.out.println("Input Tinggi Segitiga : ");
                int tinggiSegitiga = scan.nextInt();
                double luas = (alasSegitiga * tinggiSegitiga) / 2;
                System.out.println("Input Tinggi Limas : ");
                int tinggiLimas = scan.nextInt();
                double limasSegitiga = (luas * tinggiLimas) / 3;
                System.out.println("Volume Limas Segitiga : " + limasSegitiga);
            }if(input2 == 6){
                System.out.println("Masukkan Jari Jari");
                int jari = scan.nextInt();
                double luas = Math.PI * (Math.pow(jari, 2));
                System.out.println("Masukkan Tinggi");
                int tinggi = scan.nextInt();
                double tabung = luas * tinggi;
                System.out.println("Volume Tabung : " + tabung);
            }if(input2 == 7){
                System.out.println("Masukkan Jari Jari");
                int jari = scan.nextInt();
                double luas = Math.PI * (Math.pow(jari, 2));
                System.out.println("Masukkan Tinggi");
                int tinggi = scan.nextInt();
                double kerucut = (luas * tinggi) / 3;
                System.out.println("Volume Kerucut : " + kerucut);
            }if(input2 == 8){
                System.out.println("Masukkan Jari Jari");
                int jari = scan.nextInt();
                double bola = (Math.PI * (Math.pow(jari, 3)) * 4) / 3;
                System.out.println("Volume Bola : " + bola);
            }
        }
    }
}