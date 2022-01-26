import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt(), z = 5, trail = 0;
            for (int i = 0; i < t; i++) {
                int f = sc.nextInt();
                while (f >= z) {
                    trail += f / z;
                    z = z * 5;
                }
                System.out.println(trail);
                z = 5;trail = 0;
            }
        }
    }
}