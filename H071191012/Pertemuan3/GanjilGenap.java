import java.util.Scanner;
public class GanjilGenap {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        for (int i = x; i >= x && i <= y; i++) {
            if ( i%2==0 && i < 0) {
                System.out.println(i + " genap negatif");
            }else if (i%2==0 && i > 0 ) {
                System.out.println(i + " genap positif");
            }if (i%2!=0 && i < 0) {
                System.out.println(i + " ganjil negatif");
            }else if (i%2!=0 && i > 0) {
                System.out.println(i + " ganjil positif");
            }if (i == 0) {
                System.out.println(i + " nol");
            } 
        }
        for (int i = y; i >= y && i <= x; i++) {
            if ( i%2==0 && i < 0) {
                    System.out.println(i + " genap negatif");
            }else if (i%2==0 && i > 0 ) {
                    System.out.println(i + " genap positif");
            }if (i%2!=0 && i < 0) {
                    System.out.println(i + " ganjil negatif");
            }else if (i%2!=0 && i > 0) {
                    System.out.println(i + " ganjil positif");
            }if (i == 0) {
                    System.out.println(i + " nol");
            }      
        }
    }
}
