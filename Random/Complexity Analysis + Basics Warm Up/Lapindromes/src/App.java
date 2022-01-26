import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String str = sc.next();
                int l = 0, r = str.length() - 1;
                HashMap<Character, Integer> d1 = new HashMap<>();
                HashMap<Character, Integer> d2 = new HashMap<>();
                while (l < r) {
                    if (d1.containsKey(str.charAt(l))) {
                        d1.put(str.charAt(l), d1.get(str.charAt(l)) + 1);
                    } else {
                        d1.put(str.charAt(l), 1);
                    }
                    if (d2.containsKey(str.charAt(r))) {
                        d2.put(str.charAt(r), d2.get(str.charAt(r)) + 1);
                    } else {
                        d2.put(str.charAt(r), 1);
                    }
                    l++;r--;
                }
                if (d1.equals(d2)) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}