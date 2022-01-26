import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
               String str = sc.next();
               if(str.contains("11") || str.contains("10")){
                System.out.println("Yes");
               }else{
                   System.out.println("No");
               }
            }
        }
    }
}