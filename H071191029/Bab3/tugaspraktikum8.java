import java.util.Scanner;
class tugaspraktikum8{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        int x = ww.nextInt();
        int y = ww.nextInt();

        for(int i=1; i<=y; i++){
            System.out.print(i+" ");
            if(i%x==0){
                System.out.print("\n");
            }
        }
           
    }
}