import java.util.*;
public class SEGDIV{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt();
				int[] a = new int[n];
				int j = 2 , k = 1;
				for (int i=0;i<n;i++) {
					a[i] = j;
					j = a[i] + k ;
					k = k==1?3:1;
				}
				for (int i=0;i<n;i++) {
					System.out.print(a[i]+" ");
				}
				System.out.println();
			}
		}
	}
}