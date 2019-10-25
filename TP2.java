import java.util.Scanner;
class TP3{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("mencari luas bangun datar");
        System.out.println("==========================");
        int pilihan = input.nextInt();

        switch (pilihan){
        case 1:
            double s;
            s = input.nextDouble();
            double luas =s*s;
            System.out.println("luas persegi :" +luas);
            break;
        case 2:
             double p;
             double l;
             p=input.nextDouble();
             l=input.nextDouble();
             double luas1=p*l;
             System.out.println("luas persegi panjang :" +luas1);
             break;
        case 3:
             double a;
             double t;
             a=input.nextDouble();
             t=input.nextDouble();
             double luas2 =1/2*a*t;
             System.out.println("luas segitiga :" +luas2);
             break;
        case 4:
             double phi;
             double r2;
             phi=input.nextDouble();
             r2=input.nextDouble();
             double luas3 =phi*r2;
             System.out.println("luas lingkaran :" +luas3);
             break;
        case 5:
             double alas;
             double tinggi;
             alas=input.nextDouble();
             tinggi=input.nextDouble();
             double luas4 =alas*tinggi;
             System.out.println("luas jajar genjang :" +luas4);
             break;
        case 6:
             double sa;
             double sb;
             double tng;
             sa=input.nextDouble();
             sb=input.nextDouble();
             tng=input.nextDouble();
             double luas5 =sa*sb*tng*1/2;
             System.out.println("luas trapesium :" +luas5);
             break;
        case 7:
             double d1;
             double d2;
             d1=input.nextDouble();
             d2=input.nextDouble();
             double luas6 =d1*d2*1/2;
             System.out.println("luas belah ketupat :" +luas6);
             break;
        case 8:
              double diagonal1;
              double diagonal2;
              diagonal1=input.nextDouble();
              diagonal2=input.nextDouble();
              double luas7=diagonal1*diagonal2*1/2;
              System.out.println("luas layang-layang :" +luas7);
              break;
        
        }


    }
}