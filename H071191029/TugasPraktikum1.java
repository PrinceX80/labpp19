import java.util.Scanner;
class TugasPraktikum1 {

    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        int waktu = ww.nextInt();
        int kecepatan = ww.nextInt();
        double efisiensi = 14;
        double hasil = (kecepatan * waktu) / efisiensi;
        System.out.printf("Bensin yang digunakan = %.3f L " , hasil);

    }
}