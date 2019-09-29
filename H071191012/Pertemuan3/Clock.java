import java.util.Scanner;
import java.util.Locale;
public class Clock {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        
        while (input.hasNextFloat()) {
            float derajat = input.nextFloat();
            float waktu = derajat * 240;
            int jam = (int)(6 + waktu / 3600);
            int menit = (int)((waktu / 60)%60);
            int detik =(int) (waktu % 60);
        
            if (jam >= 12 && jam <= 15) {
                    System.out.println("Selamat Siang");
                }else if (jam > 15 && jam < 18) {
                        System.out.println("Selamat Sore");
                    }else if (jam >= 18 && jam <= 24) {
                        System.out.println("Selamat Malam");
                        }else {
                            System.out.println("Selamat Pagi");
                        }
                    
            if (jam >= 24) {
                float x = jam - 24;
                
                System.out.printf("%02d : %02d : %02d", x, menit, detik); 
            }else {
                System.out.printf("%02d : %02d : %02d", jam, menit, detik);
            }
        }
    }
}
