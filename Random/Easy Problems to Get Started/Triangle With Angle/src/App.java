import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b+c == 180 && a>0 && b>0 && c>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}