import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();int x = sc.nextInt();int y = sc.nextInt();
                if((x+y)%2==0){System.out.println("0");}else{System.out.println("1");}
            }
        }
    }
}