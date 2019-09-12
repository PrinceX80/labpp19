import java.util.Scanner;
class TugasPraktikum2{
    
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        int jam, menit, detik;
        int a = ww.nextInt();
        jam = a / 3600;
        menit = (a % 3600) / 60;
        detik = (a % 3600) % 60;
        System.out.printf("%02d : %02d : %02d", jam, menit, detik);

        
    }
}