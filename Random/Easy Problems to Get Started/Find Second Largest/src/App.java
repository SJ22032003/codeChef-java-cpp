import java.util.Scanner;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a<b && a>c || a>b && a<c){
                System.out.println(a);
            }else if(b>a && b<c || b<a && b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
