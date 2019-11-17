import java.util.Scanner;
class String01{
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        String kata = ap.nextLine();
        String nisA = love1(kata);
        String nisB = love2(nisA);
        String nisC = love3(kata.length(), nisB);
        System.out.println(nisC);
    }

    static String love1(String wow){
        String apa = wow.toUpperCase().replaceAll(" ","");
        System.out.println(apa);
        return apa.substring(0, apa.length()/2);
    }

    static String love2(String wow){
        char[] balikan1 = wow.substring(0, wow.length() - 1).toCharArray();
        for (int i = 0; i < balikan1.length / 2; i++) {
            char temp = balikan1[i];
            balikan1[i] = balikan1[balikan1.length - i - 1];
            balikan1[balikan1.length - i - 1] = temp;
        }
        return wow + new String(balikan1);
    }

    static String love3(int apa, String wow){
        String hexadecimal = String.format("%x", apa *apa);
        char awalHex = hexadecimal.charAt(0);
        char simbol = awalHex >= '0' && awalHex <= '9' ? '!' : '?';

        return String.format("#%s%s%o%c" , hexadecimal, wow, apa, simbol);
    }
}