import java.util.Scanner;
class TP1{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();
        int d =in.nextInt();
        int e =in.nextInt();

        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        if (a %2 == 0){
            genap++;
            if (a > 0){
                positif++;
            }else if (a < 0){
                negatif++;
            }
        } else{
            ganjil++;
            if (a > 0){
                positif++;
            }else if (a < 0){
                negatif++;
            }
        }

        if (b %2 == 0){
            genap++;
            if (b > 0){
                positif++;
            }else if (b < 0){
                negatif++;
            }
        } else{
            ganjil++;
            if (b > 0){
                positif++;
            }else if (b < 0){
                negatif++;
            }
        }

        if (c %2 == 0){
            genap++;
            if (c > 0){
                positif++;
            }else if (c < 0){
                negatif++;
            }
        } else{
            ganjil++;
            if (c > 0){
                positif++;
            }else if (c < 0){
                negatif++;
            }
        }
        
        if (d %2 == 0){
            genap++;
            if (d > 0){
                positif++;
            }else if (d < 0){
                negatif++;
            }
        } else{
            ganjil++;
            if (d > 0){
                positif++;
            }else if (d < 0){
                negatif++;
            }
        }
        
        if (e %2 == 0){
            genap++;
            if (e > 0){
                positif++;
            }else if (e < 0){
                negatif++;
            }
        } else{
            ganjil++;
            if (e > 0){
                positif++;
            }else if (e < 0){
                negatif++;
            }
        }
        System.out.println("bil genap :" +genap);
        System.out.println("bil ganjil :" +ganjil);
        System.out.println("bil positif :" +positif);
        System.out.println("bil negatif :" +negatif);
}
}