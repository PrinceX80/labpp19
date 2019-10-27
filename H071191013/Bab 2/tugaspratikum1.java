import java.util.Scanner;
class Tugaspratikum1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        if (a%2==0){
          genap++;
        }else{
            ganjil++;
        }
        if(a>0){
            positif++;
        }else if (a<0){
            negatif++;
        }
        
        if (b%2==0){
            genap++;
        }else{
            ganjil++;
        }
        if(b>0){
            positif++;
        }else if (b<0){
            negatif++;
        }

        if (c%2==0){
            genap++;
        }else{
            ganjil++;
        }
        if(c>0){
            positif++;
        }else if (c<0){
            negatif++;
        }

        if (d%2==0){
            genap++;
        }else{
            ganjil++;
        }
        if(d>0){
            positif++;
        }else if (d<0){
            negatif++;
        }
        
        if (e%2==0){
            genap++;
        }else{
            ganjil++;
        }
        if(e>0){
            positif++;
        }else if (e<0){
            negatif++;
        }

        System.out.println("Bilangan Genap ada " + genap);
        System.out.println("Bilangan Ganjil ada " + ganjil);
        System.out.println("Bilangan Positif ada " + positif);
        System.out.println("Bilangan Negatif ada " + negatif);


    }
}