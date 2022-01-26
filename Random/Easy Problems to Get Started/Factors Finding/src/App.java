import java.util.Scanner;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String str = "";
            int temp = 0 ;
            for (int j = 1; j <= n; j++) {
                if(n%j==0){
                 temp++;
                 str += " "+j;  
                }
            }
            System.out.println(temp);
            System.out.println(str.substring(1,str.length()));
        }
    }
}
