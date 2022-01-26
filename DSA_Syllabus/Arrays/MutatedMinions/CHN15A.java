import java.util.*;
public class CHN15A{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt(), k = sc.nextInt();
				int count = 0 ;
				int[] m = new int[n];
				for (int i=0;i<n;i++) {
					m[i] = sc.nextInt() + k;
				}
				for (int i=0;i<n;i++) {
					if(m[i]%7==0){
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}