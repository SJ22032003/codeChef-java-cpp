import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == b && b == c){
                System.out.println(1);
            }else if(a !=b && b == c || b != c && b == a && a<b+c && b<a+c && c<b+a){
                System.out.println(2);
            }else if(a != b && b != c && a<b+c && b<a+c && c<b+a){
                System.out.println(3);
            }else{
                System.out.println(-1);
            }
        }
    }
}