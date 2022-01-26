import java.util.*;
public class INTSEQ{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- > 0){
				int a = sc.nextInt();
				int m = 0;
				while(a%2==0){
					a = a/2;
					m++;
				}
				System.out.println(m);
			}
		}
	}
}