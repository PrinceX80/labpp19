import java.util.Scanner;
class Praktikum4{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        
        System.out.printf("detik :");
        int detik = a.nextInt();
        
        System.out.printf("%02d:",detik/3600);
        System.out.printf("%02d:",(detik%3600)/60);
        System.out.printf("%02d",(detik%3600)%60);
    }
}