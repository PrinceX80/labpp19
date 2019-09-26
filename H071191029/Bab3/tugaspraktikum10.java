import java.util.Scanner;
class tugaspraktikum10{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println( " N = ");
        float N = ww.nextFloat();
        int derajat = 86400 / 360 ;
        float hasil = N*derajat;

        int jam = (int ) hasil / 3600;
        jam = jam + 6;
        if(jam>=24){
            jam=jam-24;
        }
        int menit = (int) (hasil % 3600) / 60;
        int detik = (int) (hasil % 3600) % 60;
        System.out.printf("%02d : %02d : %02d", jam, menit, detik);


    }
}