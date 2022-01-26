import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int input = sc.nextInt();
            if(input%5==0 || input%6==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}