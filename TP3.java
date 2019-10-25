import java.util.Scanner;
class TP3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("*HIDUP MAHASISWA==HIDUP RAKYAT==SAVE KPK*");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x<0 && y>0 && x>y){
            System.out.println("Berada pada kuadran 1");
        }else if (x<0 && y>0 && x<y){
            System.out.println("Berada pada kuadran 2");
        }else if (x>0 && y>0 && x<y){
            System.out.println("Berada pada kuadran 3");
        } else if (x>0 && y>0 && x>y){
            System.out.println("Berada pada kuadran 4");
        } else if (x>0 && y<0 && x>y){
            System.out.println("Berada pada kuadran 5");
        } else if (x>0 && y<0 && x<y){
            System.out.println("Berada pada kuadran 6");
        } else if (x<0 && y<0 && x<y){
            System.out.println("Berada pada kuadran 7");
        } else if (x<0 && y<0 && x>y){
            System.out.println("Berada pada kuadran 8");
        } else if (-x == -y){
            System.out.println("Terletak pada garis -x = -y");
        } else if (x == y){
            System.out.println("Terletak pada garis x = y");
        } else if (x == -y){
            System.out.println("Terletak pada garis x = -y");
        } else if (-x == y){
            System.out.println("Terletak pada garis -x = y");
        } else {
            System.out.println("Berada pada titik 0,0");
            
    }
}
}