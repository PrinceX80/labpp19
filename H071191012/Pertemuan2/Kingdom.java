import java.util.Scanner;
import java.util.InputMismatchException;

public class Kingdom{
    public static void main(String[]args){
        Scanner lol = new Scanner(System.in);
        String input1 = lol.nextLine();
        String input2 = lol.nextLine();
        String input3 = lol.nextLine();

        try{
            if (input1.equals("vertebrado")){
                if (input2.equals("ave")){
                    if(input3.equals("carnivo")){
                        System.out.println("agula");
                    }else{
                        System.out.println("pomba");
                    }
                }else if (input2.equals("mamifero")){
                    if (input3.equals("ornivo")){
                        System.out.println("homem");
                    }else{
                        System.out.println("vaca");
                    }
                }
            
            }else if (input1.equals("invertebrado")){
                if (input2.equals("inseto")){
                    if (input3.equals("hematofago")){
                        System.out.println("pulga");
                    }else{
                        System.out.println("lagarta");
                    }
                }else if (input2.equals("anelideo")){
                    if (input3.equals("hematofago")){
                        System.out.println("sanguessuga");
                    }else{
                        System.out.println("minhoca");
                    }
                }
            }
        
        }catch (InputMismatchException ime){
            System.out.println("input tidak valid");
        }
    }
} 

