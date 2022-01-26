import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int input  = sc.nextInt();
            int largest = 10;
            int temp = 0;
            while (input%largest!=0) {
                temp = largest--;
            }
            System.out.println(temp-1);
        }
    }
}
