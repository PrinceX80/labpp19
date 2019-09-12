import java.util.Scanner;
class PP2{
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        int jam;
        int menit;
        int detik;

        System.out.println("input detik =");
        detik = yo.nextInt();
        
        jam=detik/3600;
        detik=detik-(jam*3600);
        menit=detik/60;
        detik=detik-(menit*60);

        System.out.printf("%2d:%02d:%02d" ,jam,menit,detik); 
    }
}