import java.util.InputMismatchException;
import java.util.Scanner;
class Method{
    public static int cariFPB(int x, int y) {
        return(y == 0) ? x : cariFPB(y, x % y);   
    }
    
    public static void main(String[] args) {
        Scanner po = new Scanner(System.in);
        try{
            int x, y, hasil;
            x = po.nextInt();
            y = po.nextInt();
            hasil = cariFPB(x, y);
            System.out.println("\nFPB dari " +Integer.toString(x)+" dan " +Integer.toString(y)+" = "+Integer.toString(hasil));
        }catch(InputMismatchException e) {
            System.out.println("Erorr!");
        }finally{
            po.close();
        }
    }
}