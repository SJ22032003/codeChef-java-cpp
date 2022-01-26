import java.util.Scanner;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int input = sc.nextInt();
            for (int i = 0; i < input; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b);
            }
        }
    }
}
