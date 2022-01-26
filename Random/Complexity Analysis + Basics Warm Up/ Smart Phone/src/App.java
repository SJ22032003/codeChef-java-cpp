import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
         int t = sc.nextInt();
         long[] arr = new long[t];
         for (int i = 0; i < t; i++) {
             arr[i] = sc.nextLong();
         } 
         Arrays.sort(arr);
         for (int i = 0; i < arr.length; i++) {
             arr[i] = arr[i] * (t-i);
         }
         Arrays.sort(arr);
         System.out.println(arr[t-1]);
        }
    }
}