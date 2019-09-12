import java.util.Scanner;
class pp{
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        double a = inpt.nextDouble();
        double b = inpt.nextDouble();
        double c = a*b/14.0;
        System.out.printf("%.2f",c);
    }
}