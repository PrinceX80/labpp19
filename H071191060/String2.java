import java.util.Scanner;
class String{
    public static void main(String[] args) {
        Scanner po =new Scanner(System.in);
        String in =in.nextLine();
        String op = "";
        
        for(int i=0; i<in.length(); i++){
            if(i%2! =0){
                op += Character.codepointAt(op, i);
            }else{
                op += masuk.charAt(i);
            }
        }
        System.out.println(op);
        int ukur =op.length();
        int jumlah = (ukur % 16==0 ? ukur/16 :(ukur/16)+1);
        int batas =0;
        for(int i =0; i<4; i++){
            for(int j=0; j<4; j++){
                for(int k=0; k<jumlah; k++){
                    if(batas < ukur){
                        System.out.print(op.charAt(batas));
                    }else{
                        System.out.print("?");
                    }else{
                        SysooutSy
                    }
                }
            }
        }
    }
}