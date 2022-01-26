import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int z  = sc.nextInt();int y  = sc.nextInt();int a  = sc.nextInt();int b  = sc.nextInt();int c  = sc.nextInt();
                int zy = z - y;
                int abc = a+b+c;
                if(zy >= abc){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}