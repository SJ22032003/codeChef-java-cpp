import java.util.*;
public class EQCARDGAME{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt();
				n = 52%n;
				System.out.println(n);
			}
		}
	}
}