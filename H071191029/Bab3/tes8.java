import java.util.Scanner;
class tes9{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println("N= ");
        int N = ww.nextInt();
        int hasil = 1;
        System.out.println(" Faktorial dari = ");

        for(int x=N; x>=1; x--){
            hasil=hasil*x;
            if (x==1) {
                System.out.print(x);
            } else {
                System.out.print(x + " x ");
            }
        }

        System.out.println( " = " + hasil );
    }
}