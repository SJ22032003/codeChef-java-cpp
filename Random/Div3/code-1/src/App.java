import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            long sumN , sumS ;
            int rowInp = sc.nextInt();
            int[][] coins = new int[rowInp][4];
            for (int i = 0; i < rowInp; i++) {
                for (int j = 0; j < 4; j++) {
                    coins[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < rowInp; i++) {
                sumN = coins[i][0] + coins[i][2];
                sumS = coins[i][1] + coins[i][3];
                if(sumN >= sumS){
                    System.out.println("N");
                }else{
                    System.out.println("S");
                }
                sumN = 0 ; sumS = 0;
            }

        }
    }
}
