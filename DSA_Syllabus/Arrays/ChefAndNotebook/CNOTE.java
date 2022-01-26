import java.util.*;
public class CNOTE{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt(), n = sc.nextInt();
				boolean flag = false;
				for (int i=0;i<n;i++) {
					int p = sc.nextInt();
					int c = sc.nextInt();
					if(x-y <= p && k >= c){
						flag = true;
					}
				}
				if(flag == false){
					System.out.println("UnluckyChef");
				}else{
					System.out.println("LuckyChef");
				}
			}
		}
	}
}