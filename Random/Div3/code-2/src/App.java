import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int inputNo = sc.nextInt();
            // int[] len = new int[inputNo];
            String[] strRes = new String[inputNo];
            for (int i = 0; i < inputNo; i++) {
                int len = sc.nextInt();
                String str = sc.next();

                int o = str.indexOf("o");
                int f = str.indexOf("f");

                if(o < f ){
                    System.out.println("AC");
                }else{
                    System.out.println("WA");
                }
            }
        }
    }
}
