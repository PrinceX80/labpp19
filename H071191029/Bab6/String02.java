import java.util.Scanner;
class String02{
    public static void main(String[] args){
        Scanner ap = new Scanner(System.in);
        String wow = ap.nextLine();
        String niss = changing(wow);
        int nissLength = niss.length();
        int haha = (int) Math.ceil(nissLength/16.0);
        System.out.println(niss);

        for(int i =0, j=0; i<16; i++){
            for (int k=0; k<haha; k++){
                if (j<nissLength){
                    System.out.print(niss.charAt(j++));
                }else{
                    System.out.print('?');
                }
            }

            if (i%4==3){
                System.out.println();
            }else {
                System.out.print(' ');
            }
        }
    }

    public static String changing (String wow){
        String result = "";

        for (int i=0; i<wow.length(); i++){
            if (i%2==0){
                result += wow.charAt(i);
            }else {
                result += wow.codePointAt(i);
            }
        }
        return result;
    }
}