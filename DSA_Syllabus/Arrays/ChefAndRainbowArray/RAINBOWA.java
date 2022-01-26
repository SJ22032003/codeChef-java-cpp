import java.util.*;
public class RAINBOWA{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				boolean flag = false, check = false;
				int n = sc.nextInt();
				int[] a = new int[n];
				for (int i=0;i<n;i++) {
					a[i] = sc.nextInt();
					if(a[i]>7){System.out.println("no");check=true;break;}
				}
				int midIndex = a[n%2==0?(n/2)-1:n/2];
				if(check==false){
					for (int i=0;i<midIndex;i++) {
					if(a[i] != a[a.length - 1 - i]){
						System.out.println("no");
						flag = true;
						break;
					}
				}
					if(flag == false){
						System.out.println("yes");
					}
				}
			}
		}
	}
}