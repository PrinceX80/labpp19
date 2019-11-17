import java.util.Scanner;
class Bab_4_1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rel[] = new int[n];

        for (int i = 0; i < rel.length; i++) {
            rel[i] = in.nextInt();
        }
        for (int i = 0; i < rel.length; i++) {
            for (int j = i+1; j < rel.length; j++){  
                if (Math.max(rel[i],rel[j]) % Math.min(rel[i],rel[j]) != 0) {
                System.out.println(rel[i] + " " + rel[j]);
                }
            }
        }
    }
}
