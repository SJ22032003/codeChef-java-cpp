import java.util.*;
public class MINFD{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			for (int i=0;i<t;i++) {
				int n = sc.nextInt();
				int x = sc.nextInt();
				int[] arr = new int[n];
				for (int j=0;j<n;j++) {
					arr[j] = sc.nextInt();
				}
				Arrays.sort(arr);
				int max = arr[n-1], temp=2;boolean flag = false;
				for (int j=n-2;j>=0;j--) {
					if(max>=x){System.out.println(1);flag=true;break;}
					else{
						if(max+arr[j]>=x){
							System.out.println(temp);
							flag = true;
							break;
						}else{
							temp++;
							max+=arr[j];
						}
					}
				}
				if(flag == false){
					System.out.println(-1);
				}
			}
		}
	}
}