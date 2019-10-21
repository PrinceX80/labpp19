import java.util.Scanner;
class Arr2{
    public static void main(String[] args) {
        Scanner Po =new Scanner(System.in);
        int n =Po.nextInt();
        int[] in =new int[n];
        for(int i=0; i<in.length; i++){
            in[i] = Po.nextInt();
        }
            for(int i=0; i<in.length; i++){
                for(int j=i + 1; j < in.length; j++){
                    if(Math.max(in[i],in[j]) % Math.min(in[i],in[j])!=0){
                        System.out.printf("%f %f\n",in[i],in[j]);
                    }
                }
            }
    }
}