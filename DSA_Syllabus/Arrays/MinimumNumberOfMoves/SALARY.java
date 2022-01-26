import java.util.*;
public class SALARY{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt();
				int sumW = 0;
				int[] w = new int[n];
				for (int i=0;i<n;i++) {
					w[i] = sc.nextInt();
					sumW += w[i];
				}
				Arrays.sort(w);
				System.out.println(sumW - n*w[0]);
			}
		}
	}
}