import java.util.*;
public class MERGELIS{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt() , m = sc.nextInt() , countN=1 , countM=1;
				int[] an = new int[n] ; int[] am = new int[m];
				for (int i=0;i<n;i++) {
					an[i] = sc.nextInt();					
				}
				for (int i=0;i<m;i++) {
					am[i] = sc.nextInt();
				}
				for (int i=0;i<n-1;i++) {
					if(an[i]<=an[i+1]){
						countN++;
					}
				}
				for (int i=0;i<m-1;i++) {
					if(am[i]<=am[i+1]){
						countM++;
					}
				}
				System.out.println(countM+countN);
			}
		}
	}
}