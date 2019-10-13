import java.util.Scanner;
class TugasPratikum4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai X");
        int x = scan.nextInt();
        System.out.println("Masukkan nilai y");
        int y = scan.nextInt();
        int a = 5;
        int b = 12;
        int c = 20;
        double s = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (s<a){
            System.out.println("Berada didalam lingkaran a, b dan c");
        } else if (s==a){
            System.out.println("Berada pada tepi lingkaran a");
        } else if (s>a && s<b){
            System.out.println("Berada diantara lingkaran a dan b");
        } else if (s==b){
            System.out.println("Berada pada tepi lingkaran b");
        } else if (s>b && s<c){
            System.out.println("Berada diantara lingkaran b dan c");
        } else if (s==c){
            System.out.println("Berada pada tepi lingkaran c");
        } else {
            System.out.println("Berada diluar lingkaran a, b dan c");
        }
            
         
    }
}