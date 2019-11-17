import java.util.Scanner;
class tugaspraktikum7{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        int x = ww.nextInt();
        int y = ww.nextInt();
        
        for (int i = x; i <= y; i++){
            if(i % 2 == 0 && i < 0){
                System.out.println(i+"genap negatif");
            }else if(i%2==0 && i>0){
                System.out.println(i+"genap positif");
            }
            else if(i%2==-1 || i>0){
                System.out.println(i+" ganjil negatif ");
            }else if(i%2==1 && i>0) {
                System.out.println(i+"ganjil positif");
            }
            else if(i == 0){
                System.out.println(i+"Nol");
            }   
        }
    }
}    
