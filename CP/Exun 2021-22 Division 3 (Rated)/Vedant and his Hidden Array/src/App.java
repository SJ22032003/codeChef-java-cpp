import java.util.*;

class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int a = sc.nextInt();
                if (n == 1) {
                    if (a % 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");
                    }
                    continue;
                }
                if (a % 2 == 1) {
                    if (n % 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");
                    }
                } else {
                    System.out.println("Impossible");
                }
            }
        }
    }
}