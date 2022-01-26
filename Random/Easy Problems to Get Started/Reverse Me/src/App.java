import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int input = sc.nextInt();
            int[] rev = new int[input];
            for (int i = rev.length - 1; i >= 0; i--) {
                rev[i] = sc.nextInt();
            }
            for (int i : rev) {
                System.out.println(i);
            }

        }
    }
}