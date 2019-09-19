import java.util.Scanner;
class tugaspraktikum5{
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        System.out.println(" Masukkan Nilai x ");
        int x = ww.nextInt();
        System.out.println(" Masukkan Nilai y ");
        int y = ww.nextInt();
        int a = 5;
        int b = 12;
        int c = 20; 
        double s = Math.sqrt(Math.pow(x, 2)) + (Math.pow(y, 2));
        if (s<a){
            System.out.println(" berada dalam lingkaran a, b dan c");
        }else if (s==a){
            System.out.println(" berada pada tepi lingkaran a ");
        if (s>a && s<b){
            System.out.println(" berada dalam lingkaran a dan b");
        }else if (s==b){
            System.out.println(" berada pada tepi lingkaran b");
        if (s>b && s<c){
            System.out.println(" berada dalam lingkaran b dan c");
        }else if (s==c){
            System.out.println(" berada pada tepi lingkaran c");
        }else {
            System.out.println(" berada diluar lingkaran a, b dan c");
        }
       
    }
}

        
    }
}