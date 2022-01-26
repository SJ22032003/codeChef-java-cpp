import java.util.Scanner;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt(), j = 1 , k = 1 , l = 1;
            for (int i = 1; i <= n; i++) {
                if(i%2!=0){
                    while(j <= i*5){
                        System.out.print(j+" ");
                        j++;
                    }
                }else{
                    k = i*5 ; l =  i*5-5 ;
                    while (k > l) {
                        System.out.print(k+" ");
                        k--;
                    }
                    j = i*5+1;
                }   
                System.out.println();
            }
        }
    }
}