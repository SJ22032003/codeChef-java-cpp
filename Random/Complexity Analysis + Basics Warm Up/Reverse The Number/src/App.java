import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String s = sc.next();
                String[] arr = s.split("");
                String ans = "";
                String[] arrStr = new String[arr.length];
                for (int j = 0; j < arr.length; j++) {
                    arrStr[j] = arr[arr.length-1-j];
                    ans = ans + arrStr[j];
                }
                System.out.println(Integer.parseInt(ans));
            }
        }
    }
}