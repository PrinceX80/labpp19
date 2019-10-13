import java.util.Scanner;

public class TugasPratikum2{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int x = userInput.nextInt();
        int y = userInput.nextInt();
        userInput.close();
        if (y>0){
            for ( int a=1 ; a<=y ; a++){
                System.out.print(a + " ");
                if ( a%x == 0){
                    System.out.print("\n");
                }
            }
        }
        else {
            for ( int a=-1 ; a>=y ; a--){
                System.out.print(a + " ");
                if ( a%x == 0){
                    System.out.print("\n");
                }
            }
        }
    }
}