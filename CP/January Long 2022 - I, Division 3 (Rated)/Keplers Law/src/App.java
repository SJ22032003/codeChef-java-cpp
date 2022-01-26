import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                double t1 = sc.nextDouble();
                double t2 = sc.nextDouble();
                double r1 = sc.nextDouble();
                double r2 = sc.nextDouble();
                double t = (t2*t2)/(t1*t1) , r = (r2*r2*r2)/(r1*r1*r1);
                if(t == r){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}