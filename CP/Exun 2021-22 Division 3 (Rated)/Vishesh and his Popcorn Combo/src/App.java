import java.util.*;

class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long t = sc.nextLong(), max = 0;
            for (long i = 0L; i < t; i++) {
                long[][] arr = new long[3][2];
                for (int j = 0; j < arr.length; j++) {
                    for (int j2 = 0; j2 < 2; j2++) {
                        arr[j][j2] = sc.nextLong();
                        if (max < arr[j][0] + arr[j][1]) {
                            max = arr[j][0] + arr[j][1];
                        }
                    }
                }
                System.out.println(max);
                max = 0;
            }

        }
    }
}