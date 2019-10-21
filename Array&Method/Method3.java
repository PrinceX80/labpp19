import java.util.InputMismatchException;
import java.util.Scanner;
class Method3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int umur =in.nextInt();
            int x= tahun(umur);
            int y =bulan(umur,tahun(umur));
            int z =hari(umur,tahun(umur),bulan(umur, tahun(umur)));
            myDay(x, y, z);
            }catch(InputMismatchException ime){
                System.out.print(ime.getMessage());
            }
                
            }public static void myDay(int tahun,int bulan,int hari){
                System.out.println(+tahun+ "= tahun");
                System.out.println(+bulan+ "= bulan");
                System.out.println(+hari+ "= hari");
            }public static int tahun(int a){
                int hasil=a/365;
                return hasil;
            }public static int bulan(int a, int b) {
                int hasil =(a-(b*365))/30;
                return hasil;    
            }public static  int hari(int a, int b, int c) {
                int hasil =a-((b*365)+(c*30));
                return hasil;
                
            }
        }