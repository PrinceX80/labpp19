import java.util.Scanner;
class Bab_5_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int date = in.nextInt();
        bDay(date);
    }
    public static void bDay(int a){
        int year = a / 365;
        a = a % 365;
        int month = a / 30;
        a = a % 30;

        System.out.println(year + " tahun");
        System.out.println(month + " bulan");
        System.out.println(a + " hari");
    }
}