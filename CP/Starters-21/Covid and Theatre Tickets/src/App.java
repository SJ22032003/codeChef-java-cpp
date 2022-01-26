import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();int m = sc.nextInt();int temp = 0 ;
                for (int j = 1; j <= n; j++) {
                    for (int j2 = 1; j2 <= m; j2++) {
                        if(j%2!=0 && j2%2!=0){temp++;}
                    }
                }
                System.out.println(temp);temp = 0 ;
            }
        }
    }
}