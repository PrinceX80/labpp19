import java.util.Scanner;
import java.util.InputMismatchException;

public class BilanganBulat{
    public static void main(String[]args){
        Scanner number = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
       
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;
       
        try{

             a = number.nextInt();
             b = number.nextInt();
             c = number.nextInt();
             d = number.nextInt();
             e = number.nextInt();
    
        if (a %2 == 0 ){ 
            genap++;
             if ( a > 0){
                 positif++;
            }else if(a < 0){
                    negatif++;
            }
        }else{
            ganjil++;
            if (a > 0){
                positif++;
            }else if(a < 0){
                negatif++;
            }
        }

        if (b %2 == 0 ){ 
            genap++;
             if ( b > 0){
                 positif++;
            }else if(b < 0){
                    negatif++;
            }
        }else{
            ganjil++;
            if (b > 0){
                positif++;
            }else if(b < 0){
                negatif++;
            }
        }

        if (c %2 == 0 ){ 
            genap++;
             if ( c > 0){
                 positif++;
            }else if(c < 0){
                    negatif++;
            }
        }else{
            ganjil++;
            if (c > 0){
                positif++;
            }else if(c < 0){
                negatif++;
            }
        }

        if (d %2 == 0 ){ 
            genap++;
             if ( d > 0){
                 positif++;
            }else if(d < 0){
                    negatif++;
            }
        }else{
            ganjil++;
            if (d > 0){
                positif++;
            }else if(d < 0){
                negatif++;
            }
        }

        if (e %2 == 0 ){ 
            genap++;
             if ( e > 0){
                 positif++;
            }else if(e < 0){
                    negatif++;
            }
        }else{
            ganjil++;
            if (e > 0){
                positif++;
            }else if(e < 0){
                negatif++;
            }
        }
        System.out.println(genap + " Bilangan Genap");
        System.out.println(ganjil + " Bilangan Ganjil");
        System.out.println(positif + " Bilangan Positif");
        System.out.println(negatif + " Bilangan Negatif");
        
        }catch(InputMismatchException nfe){
            System.out.println("Input Tidak Valid");
       
        }finally{
           System.out.println("end");
       }
    }
}