import java.util.*;
public class MASKPOL{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt(); 
				int a = sc.nextInt();
				int z = n-a;
				System.out.println(Math.min(z,a));

			}
		}
	}
}