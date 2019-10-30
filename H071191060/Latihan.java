import java.util.Scanner;
class Latihan{
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
         int[] Array = new int [20];
        double total =0;
        double rata =0;
        System.out.print("masukkan banyak elemen array :");
        for(int i=0; i<10; i++){
            System.out.print("nilai ke-"+i+":");
            Array[i]= x.nextInt();
            total = total + Array[i];
        }
        rata=total/20;
        System.out.println("===============================================");
        System.out.println("No\t||\tData\t||\tError\t||");
        System.out.println("===============================================");
        double []error = new double[20];
        for(int i=0; i<20; i++){
            error[i] =Math.sqrt(Math.pow(rata-Array[i],2));
            System.out.printf("%d\t||t%d\t||\t%.3f\t||",i+1,Array[i],error[i]);
            System.out.println();
        }
        System.out.println("================================================");

    }
}