import java.util.Scanner;
public class XY {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int xA = x;

        for (int nilai = 1; nilai <= y; nilai++) {
            if (nilai == xA+1) {
                System.out.print("\n");
                xA += x;
            }
            System.out.print(nilai+"\t");
        }
    }
}