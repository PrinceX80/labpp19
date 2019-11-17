import java.util.Scanner;
class TugasArray4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (Math.max(a[i],a[j]) % Math.min(a[i],a[j]) != 0){
                    System.out.printf("%f %f \n",a[i],a[j]);
                }
            }
        }
    }
}