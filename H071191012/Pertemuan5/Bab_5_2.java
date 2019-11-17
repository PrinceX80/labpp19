import java.util.Scanner;
class Bab_5_2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input angka pertama");
        int n= in.nextInt();
        System.out.println("Input angka kedua");
        int m = in.nextInt();
        
        FPB(n,m);
        System.out.println("FPB dari " + n + " dan " + m +" adalah " +FPB(n, m));
    }
    static int FPB(int num1, int num2){
        do {
            int save = num2;
            num2 = num1%num2;
            num1 = save;
        } while (num2 != 0);
        
        return num1;
    }
}
