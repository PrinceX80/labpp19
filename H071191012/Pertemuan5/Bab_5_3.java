import java.util.Random;
import java.util.Scanner;
class Bab_5_3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String number = serialAngka(n, m);
        System.out.println(number);
    }
    static String serialAngka(int a, int b){
        String str = "";
        Random init = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int z = init.nextInt(10);
                str += z;
            }
            if (i < (a-1)){
                str += "-";
            }
        }
        return str;
    }
}