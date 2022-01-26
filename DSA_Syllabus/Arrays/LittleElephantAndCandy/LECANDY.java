import java.util.*;
public class LECANDY{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt();int c = sc.nextInt();
				int a = 0;
				for (int i=0;i<n;i++) {
					a += sc.nextInt();
				}
				System.out.println(a<=c?"Yes":"No");
			}
		}
	}
}