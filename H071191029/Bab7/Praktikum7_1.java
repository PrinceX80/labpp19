import java.util.HashMap;
import java.util.Scanner;

public class Praktikum7_1{
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);
        String niss = wow.nextLine();
        HashMap<String, Character> morse = new HashMap<>();
        String[] space = niss.split("\\s+");
        morse.put(".-", 'A');
        morse.put("-...", 'B');
        morse.put("-.-.",'C');
        morse.put("-..",'D');
        morse.put(".",'E');
        morse.put(".._.",'F');
        morse.put("--.",'G');
        morse.put("....",'H');
        morse.put("..",'I');
        morse.put(".---",'J');
        morse.put("-.-",'K');
        morse.put(".-..",'L');
        morse.put("--",'M');
        morse.put("-.",'N');
        morse.put("---",'O');
        morse.put(".--.",'P');
        morse.put("--.-",'Q');
        morse.put(".-.",'R');
        morse.put("...",'S');
        morse.put("-",'T');
        morse.put("..-",'U');
        morse.put("...-",'V');
        morse.put(".--",'W');
        morse.put("-.--",'Y');
        morse.put("--..",'Z');
        
        
        for (String result: space){
            System.out.print(morse.get(result));
        }  
    }
}