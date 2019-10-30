import java.util.Scanner;
class String1{
    public static void main(String[] args) {
        String a = "tes";
        a.toCharArray()
        char[] b = {'t','e','s'};
        Scanner In =new Scanner(System.in);
        String input =In.nextLine();
        int po =input.length()*input.length();
        String sumOfpo =String.format("%x",po);
        String M1 =input.replace(" ","");
        String M2 =M1.substring(0,(input.length()-1)/2);
        String M3 =M2.toUpperCase();
        char[] pro =M3.toCharArray();
        String result ="";
        System.out.println(M3);
        for(int i=0; i<M3.length()-1; i++){
            result = pro[i] +result;
        }
        String polindrom =M3 +result;
        int ot = input.length();
        String sumOfOt =String.format("%o",ot);
        String x ="!";
        String y ="?";
        String z ="#";
        int hsl = (int)sumOfpo.charAt(0);
        if (hsl <= 97 && hsl >= 122){
            System.out.printf("%s%s%s%s%s",z,sumOfpo,polindrom,sumOfOt, y);
        }else{
            System.out.printf("%s%s%s%s%s",z,sumOfpo,polindrom,sumOfOt, x);
        }
    }
}