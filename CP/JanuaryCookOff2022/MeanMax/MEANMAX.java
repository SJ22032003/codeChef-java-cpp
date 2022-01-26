import java.util.*;
public class MEANMAX{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt();
				double[] a = new double[n];
				for (int i=0;i<a.length;i++) {
					a[i] = sc.nextDouble();
				}
				Arrays.sort(a);
				double countP = 0d , countQ = 0d, sumP = 0d, sumQ = 0d;
				int mid = a.length/2;
				for (int i=0;i<mid;i++) {
					sumP += a[i]; countP++;
					sumQ += a[a.length -1 -i]; countQ++;
				}
				System.out.println((sumP/countP)+(sumQ/countQ));
			}
		}
	}
}