import java.util.Scanner;
class TugasPratikum3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("x = ");
        int x = scan.nextInt();
        System.out.print("y = ");
        int y = scan.nextInt();
        scan.close();
        if (x==0 && y==0){
            System.out.print("Titik " + "(" + x + "," + y + ") berada di titik pusat");
        }else if (x<0 && y>0){
            if (x+y <0){
                System.out.print("Titik " + "(" + x + "," + y + ") berada pada kuadran 1");
            }else if (x+y >0){
                System.out.print("Titik " + "(" + x + "," + y + ") berada pada kuadran 2");
            }else{
                System.out.print("Titik " + "(" + x + "," + y + ") berada di garis -x = y");
            }
        }else if (x>0 && y>0){
            if (x<y){
                System.out.print("Titik " + "(" + x + "," + y + ") berada pada kuadran 3");
            }else if (x>y){
                System.out.print("Titik " + "(" + x + "," + y + ") berada pada kuadran 4");
            }else{
                System.out.print("Titik " + "(" + x + "," + y + ") berada di garis x = y");
            }
        }else if (x>0 && y<0){
            if (x+y <0){
                System.out.print("Titik " + "(" + x + "," + y + ") berada pada kuadran 6");
            }else if (x+y >0){
                System.out.print("Titik " + "(" + x + "," + y + ") berada pada kuadran 5");
            }else{
                System.out.print("Titik " + "(" + x + "," + y + ") berada di garis x = -y");
            }
        }else if ( x<0 && y<0){
            if (x<y){
                System.out.print("Titik " + "(" + x + "," + y + ") berada pada kuadran 8");
            }else if (x>y){
                System.out.print("Titik " + "(" + x + "," + y + ") berada pada kuadran 7");
            }else{
                System.out.print("Titik " + "(" + x + "," + y + ") berada di garis -x = -y");
            }
        }else if (x==0 && y>0){
                System.out.print("Titik " + "(" + x + "," + y + ") berada di garis y");
        }else if (y==0 && x>0){
                System.out.print("Titik " + "(" + x + "," + y + ") berada di garis x");
        }else if (x==0 && y<0){
                System.out.print("Titik " + "(" + x + "," + y + ") berada di garis -y");
        }else if (y==0 && x<0){
                System.out.print("Titik " + "(" + x + "," + y + ") berada di garis -x");
        }
        
     
    }
}