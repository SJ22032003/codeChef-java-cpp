import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            while(n != 42){
                System.out.println(n);
                n = sc.nextInt();
            }
        }
    }
}