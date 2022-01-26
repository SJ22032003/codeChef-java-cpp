import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt(), temp1=0, temp2=0;
            for (int k = 0; k < t; k++) {
                int g = sc.nextInt();   // number of games
                for (int j = 0; j < g; j++) {
                    int i = sc.nextInt();   // 1 for heads, 2 for tails 
                    int n = sc.nextInt();   // number of coins and rounds
                    int q = sc.nextInt();   // 1 for heads, 2 for tails
                    String[] coins = new String[n];
                    for (int l = 0; l < coins.length; l++) {
                        coins[l] = i==1?"H":"T";
                    }
                    for (int l = 0; l < coins.length; l++) {
                        for (int l2 = 0; l2 < coins.length; l2++) {
                            if( l2 <= l){
                                coins[l2] = coins[l2].equals("H")?"T":"H";
                            }
                        }
                    }
                    for (String string : coins) {
                        if(q == 1 && string.equals("H")){
                            temp1++;
                        }else if(q == 2 && string.equals("T")){
                            temp2++;
                        }
                    }
                    System.out.println(q==1?temp1:temp2);
                    temp1=0;temp2=0;
                }
            }
        }
    }
}