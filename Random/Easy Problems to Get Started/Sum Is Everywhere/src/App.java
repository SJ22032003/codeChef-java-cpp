import java.util.Scanner;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            Long n = sc.nextLong()*2;
            long i = 1 , even = 0 , odd = 0 ; 
            while (i<=n) {
                if(i%2==0){
                    even += i ;
                }else{
                    odd += i ;
                }
                i++;
            }
            System.out.println(odd);
            System.out.println(even);
        }
    }
}