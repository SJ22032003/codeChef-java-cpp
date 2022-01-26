import java.util.Scanner;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt() , k ;
            for (int i = 0; i < n; i++) {
                k = n-1 ;
                    while (k > i) {
                        System.out.print(" ");
                        k--;
                    }
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}