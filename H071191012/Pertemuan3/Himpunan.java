import java.util.Scanner;
public class Himpunan {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f = 1;
        int f1 = 0;
        int f2 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d " , f2);
            f2 = f1 + f;
            f = f1;
            f1 = f2;
        }
    }
}