import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a<b+c && b<a+c && c<a+b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}