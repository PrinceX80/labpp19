import java.util.Scanner;
class TugasArray1 {
    public static void main(String[] args) {
        char[] nama = {'A', 'B', 'C'};
        System.out.print("{ ");
        for (int i = 0; i < nama.length; i++){
            System.out.printf("%d%s", (int)nama[i],i == nama.length - 1? "":",");
        }
        System.out.print(" }");
    }
}