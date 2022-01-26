import java.util.*;

class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt(), temp = 0, laddu = 0;
            for (int i = 0; i < t; i++) {
                int act = sc.nextInt();
                String nat = sc.nextLine().trim();
                String[] act_arr = new String[act];
                for (int j = 0; j < act; j++) {
                    act_arr[j] = sc.nextLine();
                }
                int rank = 0, bug = 0;
                for (int j = 0; j < act_arr.length; j++) {
                    if (act_arr[j].split(" ")[0].equals("CONTEST_WON")) {
                        rank = Integer.parseInt(act_arr[j].split(" ")[1]);
                        if (rank < 20) {
                            rank = 20 - rank;
                        } else {
                            rank = 0;
                        }
                    } else if (act_arr[j].split(" ")[0].equals("BUG_FOUND")) {
                        bug = Integer.parseInt(act_arr[j].split(" ")[1]);
                    }
                }
                for (int j = 0; j < act_arr.length; j++) {
                    if (act_arr[j].split(" ")[0].equals("CONTEST_WON")) {
                        laddu = laddu + 300 + rank;
                    } else if (act_arr[j].equals("TOP_CONTRIBUTOR")) {
                        laddu = laddu + 300;
                    } else if (act_arr[j].split(" ")[0].equals("BUG_FOUND")) {
                        laddu = laddu + bug;
                    } else if (act_arr[j].equals("CONTEST_HOSTED")) {
                        laddu = laddu + 50;
                    }
                }
                if (nat.equalsIgnoreCase("INDIAN")) {
                    while (laddu >= 200) {
                        laddu = laddu - 200;
                        temp++;
                    }
                } else {
                    while (laddu >= 400) {
                        laddu = laddu - 400;
                        temp++;
                    }
                }
                System.out.println(temp);
                temp = 0;
                laddu = 0;
            }
        }
    }
}