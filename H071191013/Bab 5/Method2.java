import java.util.Random;
import java.util.Scanner;
class Method2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        String c =input(a,b);
        System.out.println(c);
        in.close();
    }
    public static String input (int x, int o){
        String in =" ";
        Random r = new Random();
        for(int i=0; i<x; i++){
            for(int j=0; j<o; j++){
                in += r.nextInt(10);
            }
            in += i ==(x -1) ?" " :"-";
        }
        return in;

    }
}