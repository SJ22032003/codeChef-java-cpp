import java.util.*;

class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean flag = false;
            int[] numArr = new int[n];
            for (int i = 0; i < numArr.length; i++) {
                numArr[i] = sc.nextInt();
                if (numArr[i] == k) {
                    System.out.println(1);
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(-1);
            }
        }
    }
}