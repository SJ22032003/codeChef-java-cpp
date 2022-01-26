import java.util.*;
public class crycolr{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			for (int i=0;i<t;i++) {
				int n = sc.nextInt();
				int[][] a = new int[3][3];
				for (int j=0;j<3;j++) {
					a[j][0] = sc.nextInt();
					a[j][1] = sc.nextInt();
					a[j][2] = sc.nextInt();
				}
				if(a[0][0]==a[1][1] && a[1][1]==a[2][2] && a[2][2]==n){
					System.out.println(0);
				}
				int check1 = a[1][0]+a[2][0]+a[2][1];int check2 = a[0][1]+a[0][2]+a[1][2];
				int checkMax = Math.max(check1,check2);
				System.out.println(checkMax);
			}
		}
	}
}