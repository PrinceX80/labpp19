import java.util.Scanner;
class tes7{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println("N = ");
        int N = ww.nextInt();
        System.out.println("bilangan prima = ");
        
        for (int x=2; x<=N; x++){
            int odd = 1;
            for(int j=2; j<x; j++){
                if ( x%j==0){
                    odd = 0;
                }
            }
            
            if (odd==1) {
                System.out.print(x+",");
            }
        }
            
        ww.close();
        }
    }
