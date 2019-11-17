import java.util.Scanner;
class Pokemon{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String pokemon1, pokemon2, element1, element2, fire, electric, ice, ground, water;
        System.out.println("Summon your pokemon :");
        pokemon1 = input.next();
        System.out.println("Element :");
        element1 = input.next();
        System.out.println("Summon your pokemon :");
        pokemon2 = input.next();
        System.out.println("Element :");
        element2 = input.next();
        System.out.println("Winner is :");

        switch (element1){
            case "fire":
            switch (element2){
                case "fire":
                    System.out.println("Draw");
                break;
                
                case "water":
                    System.out.println(pokemon2);
                break;
                
                case "electric":
                    System.out.println(pokemon1);
                break;
                
                case "ice":
                    System.out.println(pokemon1);
                break;
                
                case "ground":
                    System.out.println(pokemon2);
                break;
            }break;
                
                case "ground":
                switch(element2){
                    case "ground":
                        System.out.println("Draw");
                    break;
                    
                    case "fire":
                        System.out.println(pokemon1);
                    break;    
                    
                    case "ice":
                        System.out.println(pokemon2);
                    break;
                    
                    case "electric":
                        System.out.println(pokemon1);
                    break;
                    
                    case "water":
                        System.out.println(pokemon2);
                    break;    
                }break;
                    
                    case "water":
                    switch (element2){
                        case "water":
                            System.out.println("Draw");
                        break;

                        case "fire":
                            System.out.println(pokemon1);
                        break;

                        case "electric":
                            System.out.println(pokemon2);
                        break;

                        case "ground":
                            System.out.println(pokemon1);
                        break;

                        case "ice":
                            System.out.println(pokemon2);
                        break;
                    }break;
                        
                        case "electric":
                        switch (element2){
                            case "electric":
                                System.out.println("Draw");
                            break;
                            
                            case "fire":
                                System.out.println(pokemon2);
                            break;

                            case "ground":
                                System.out.println(pokemon2);
                            break;

                            case "water":
                                System.out.println(pokemon1);
                            break;

                            case "ice":
                                System.out.println(pokemon1);
                            break;
                        }break;

                            case "ice":
                            switch (element2){
                                case "ice":
                                    System.out.println("Draw");
                                break;

                                case "fire":
                                    System.out.println(pokemon2);
                                break;

                                case "ground":
                                    System.out.println(pokemon1);
                                break;

                                case "electric":
                                    System.out.println(pokemon2);
                                break;

                                case "water":
                                    System.out.println(pokemon1);
                                break;
                            }default:
                            break;                       
        }
    }
}