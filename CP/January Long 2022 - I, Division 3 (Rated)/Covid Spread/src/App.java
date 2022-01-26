import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            long t = sc.nextLong(), k=1 , inf = 1;
            for (long i = 0; i < t; i++) {
                long n = sc.nextLong();
                long d = sc.nextLong();
                if(n>d){
                    while (k<=d) {
                        if(k<11){
                         inf = 2*inf;
                        }else{
                         inf = 3*inf;
                        }
                        k++;
                     }
                        if(inf <= n){
                            System.out.println(inf);
                        }else{
                            System.out.println(n);
                        }
                        inf=1;k=1;
                }else{
                    System.out.println(n);
                }
                
            }
        }
    }
}