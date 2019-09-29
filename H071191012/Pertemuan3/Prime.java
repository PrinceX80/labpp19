import java.util.Scanner;
 
public class Prime {
        public static void main (String args []){
  
        Scanner input = new Scanner(System.in);
        System.out.println("Silakan masukkan angka yang akan di cek: ");
  
        int angka = input.nextInt();
        int temp;
        boolean prima = true;

        for (int i = 2; i <= angka / 2; i++){
        
        temp = angka % i;
        if(temp == 0){
        prima = false;
        break;
        }
        }
  
        /* Jika prima adalah true dan angka yang diinput
            bukanlah 0 dan 1 */
        if(prima && ((angka > 0)&&(angka != 1)))
        System.out.println(angka + " adalah bilangan prima");
        else
        System.out.println(angka + " bukanlah bilangan prima");
    }
}