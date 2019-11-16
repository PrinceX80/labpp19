import java.util.Scanner;
class String01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();

        //hexadecimal
        int hexa = kalimat.length() * kalimat.length();
        String hexaSum = String.format("%x", hexa);

        //palindrom
        String palindrom = kalimat.replace(" ", "");
        String palindrom2 = palindrom.substring(0, (kalimat.length()-1)/2);
        String palindrom3 = palindrom2.toUpperCase();

        char[] change = palindrom3.toCharArray();
        String str = "";
        System.out.println(palindrom3);
        for (int i = 0; i < palindrom3.length()-1; i++){
            str = change[i] + str;

        }
        String sumPalindrom = palindrom3 + str;
        
        //octal
        int octal = kalimat.length();
        String sumOctal = String.format("%o", octal);

        String s = "!";
        String t = "?";
        String r = "#";
        int hasil = (int)hexaSum.charAt(0);
        if (hasil <= 97 && hasil >= 122){
            System.out.printf("%s%s%s%s%s", r, hexaSum, sumPalindrom, sumOctal, t);
        }else {
            System.out.printf("%s%s%s%s%s", r, hexaSum, sumPalindrom, sumOctal, s);
        }
    }
}