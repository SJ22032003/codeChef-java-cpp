import java.util.*;
public class NOPAL{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = "qwertyuiopasdfghjklmnbvcxz";
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt();
				String res = "";
				for (int i=0;i<n;i++) {
					if(i > 25){ n=n-i ; i = 0;}
					res += str.charAt(i);					
				}
				System.out.println(res);
			}
		}
	}
}