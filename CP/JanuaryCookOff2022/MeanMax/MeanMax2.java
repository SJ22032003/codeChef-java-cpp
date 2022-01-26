import java.util.*;
public class MeanMax2{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int n = sc.nextInt();
				double[] arr = new double[n];
				for (int i=0;i<n;i++) {
				 	arr[i] = sc.nextDouble();
				 }
				 Arrays.sort(arr);
				 double p = arr[n-1]; double q = 0;
				 for (int i=0;i<n-1;i++) {
					q += arr[i];				  	
				  } 
				  System.out.printf("%.6f\n",p + q/(n-1));
			}
		}
	}
}