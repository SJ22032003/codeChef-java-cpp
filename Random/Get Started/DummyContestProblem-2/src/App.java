import java.util.*;

class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            int temp = 0;
            for (int i = 0; i < input; i++) {
                String f = sc.next();
                char[] strF = f.toCharArray();
                for (char c : strF) {
                    if (c == '4') {
                        temp++;
                    }
                }
                System.out.println(temp);
                temp = 0;
            }

        }
    }
}
