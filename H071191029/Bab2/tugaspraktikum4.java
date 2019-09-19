import java.util.Scanner;
class tugaspraktikum4{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        int a = ww.nextInt();
        int b = ww.nextInt();
        int c = ww.nextInt();
        int d = ww.nextInt();
        int e = ww.nextInt();

        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        if (a%2==0){
            genap++;
        }else {
            ganjil++;
        }
        if (a>0){
            positif++;
        }else if (a<0) {
            negatif++;
        }
        if (b%2==0){
            genap++;
        }else {
            ganjil++;
        }
        if (b>0){
            positif++;
        }else if (b<0) {
            negatif++;
        }
        if (c%2==0){
            genap++;
        }else {
            ganjil++;
        }
        if (c>0){
            positif++;
        }else if (c<0) {
            negatif++;
        }
        if (d%2==0){
            genap++;
        }else {
            ganjil++;
        }
        if (d>0){
            positif++;
        }else if (d<0) {
            negatif++;
        }
        if (e%2==0){
            genap++;
        }else {
            ganjil++;
        }
        if (e>0){
            positif++;
        }else if (e<0) {
            negatif++;
        }

        System.out.println(" Bilangan genap ada " + genap);
        System.out.println(" Bilangan ganjil ada" + ganjil);
        System.out.println(" Bilangan positif ada " + positif);
        System.out.println(" Bilangan negatif ada " + negatif);

    }
}