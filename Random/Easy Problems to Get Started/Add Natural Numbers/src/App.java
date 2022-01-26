import java.util.Scanner;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            long n = sc.nextLong() , l = 0 ;
            for (long i = 1; i <= n; i++) {
                l += i ; 
            }
            System.out.println(l);
        }
    }
}