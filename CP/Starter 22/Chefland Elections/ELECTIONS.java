import java.util.*;
public class ELECTIONS{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				if(a>50 && a>b && a>c){System.out.println("A");}
				else if(b>50 && b>a && b>c){System.out.println("B");}
				else if(c>50 && c>50 && c>a){System.out.println("C");}
				else{
					System.out.println("NOTA");
				}
			}
		}
	}
}