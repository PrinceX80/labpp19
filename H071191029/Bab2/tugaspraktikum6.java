import java.util.Scanner;
class tugaspraktikum6{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println("** pilih bangun datar**");
        System.out.println("1. persegi");
        System.out.println("2. persegi panjang");
        System.out.println("3. segitiga");
        System.out.println("4. lingkaran");
        System.out.println("5. jajar genjang");
        System.out.println("6. trapesium");
        System.out.println("7. belah ketupat");
        System.out.println("8. layang-layang");

        int input = ww.nextInt(); //terima input pilihan bangun

        switch (input) {
            case 1 : 
            double s=ww.nextDouble();
            double hasilPersegi = s*s;
            System.out.println(hasilPersegi);
            break;
            case 2 : 
            double p=ww.nextDouble();
            double l=ww.nextDouble();
            double hasilpersegipanjang = p*l;
            System.out.println(hasilpersegipanjang);
            break;
            case 3 :
            double a=ww.nextDouble();
            double t=ww.nextDouble();
            double hasilsegitiga = (a*t)/2;
            System.out.println(hasilsegitiga);
            break;
            case 4 :
            double r=ww.nextDouble();
            double phi=ww.nextDouble();
            double  hasillingkaran = phi*r;
            System.out.println(hasillingkaran);
            break;
            case 5 :
                double alasJ=ww.nextDouble();
                double tinggiJ=ww.nextDouble();
                double hasiljajargenjang = alasJ*tinggiJ;
                System.out.println(hasiljajargenjang);
                break;
            case 6 :
            double sisiT=ww.nextDouble();
            double tinggiT=ww.nextDouble();
            double hasiltrapesium = 0.5*sisiT*tinggiT;
            System.out.println(hasiltrapesium);
            break;
            case 7 :
            double d1B=ww.nextDouble();
            double d2B=ww.nextDouble();
            double hasilbelahketupat = 0.5*d1B*d2B;
            System.out.println(hasilbelahketupat);
            break;
            case 8 :
            double di1L=ww.nextDouble();
            double di2L=ww.nextDouble();
            double hasilLayangLayang = 0.5*di1L*di2L;
            System.out.println(hasilLayangLayang);
            break;

            case 9:
                System.out.println("ini case 9");
                break;
            
            default:
                System.out.println("default");
                break;          
        }
        

        String pilihMakanan = ww.next();

        switch (pilihMakanan) {
            case "roti":
                System.out.println("ini roti");
                break;
            case "nasi":
                System.out.println("ini nasi");
                break;
            default:
                System.out.println("tidak ada makananan");
                break;
        }

        
    }
}