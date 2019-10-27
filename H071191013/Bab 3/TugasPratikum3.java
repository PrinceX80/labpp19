import java.util.Scanner;
public class TugasPratikum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan deret fibonacci");
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            c = (a+b);
            a=b;
            b=c;
            
        }
    }
}