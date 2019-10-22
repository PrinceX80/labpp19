import java.util.Scanner;
public class Performance {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Pemain: ");
        int index = input.nextInt();
        int[][][] team = new int[index][2][3];
        String actionType[] =  {"Services : ","Block : ","Smash : "};
        //0 1
        for (int i = 0; i < team.length; i++) {
            String name = input.next();
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    team[i][j][k] = input.nextInt();
                }
            }
        }
        int sum[][] = new int[2][3];
        for (int i = 0; i < team.length; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                  sum[j][k] += team[i][j][k];  
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(actionType[i]);
            System.out.printf("%.2f%s\n",((double)sum[1][i]/sum[0][i])*100,"%");
        }

        System.out.println();
    }
}