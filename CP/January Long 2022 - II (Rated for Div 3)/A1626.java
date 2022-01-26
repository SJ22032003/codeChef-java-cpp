import java.util.*;
public class A1626{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t =  sc.nextInt();
			while(t-- >=0){
				String[] str = sc.nextLine().split("");
				String resStr = "";
				Arrays.sort(str);
				for (int i=0;i<str.length;i++) {
					resStr+=str[i];					
				}
				System.out.println(resStr);
			}
		}
	}
}