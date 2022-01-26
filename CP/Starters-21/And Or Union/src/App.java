import java.util.*;
public class App {

    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            // System.out.println(2&7);
            // System.out.println(2&1);
            // System.out.println(7&1);
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int index = 0; index < n; index++) {
                        arr[index]=sc.nextInt();
                }
                int[] newarr=new int[Math.abs((n-1)*n/2)];
                int ind=0;
                System.out.println(newarr.length);
                for (int j = 0; j < arr.length-1; j++) {
                    for (int j2 = j+1; j2 < newarr.length; j2++) {
                        newarr[ind]=arr[j]&arr[j2];
                        System.out.print(ind);
                        ind++;
                    }
                }
                 System.out.println(newarr.length);
                for (int j : newarr) {
                    System.out.print(j+" ");
                }
                
            }
        }
    }
}
