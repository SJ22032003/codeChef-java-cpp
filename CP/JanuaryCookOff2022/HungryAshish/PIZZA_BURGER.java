import java.util.*;
public class PIZZA_BURGER{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt();
			while(t-- >0){
				int x = sc.nextInt(); int y = sc.nextInt(); int z = sc.nextInt();
				if(x>=y){
					System.out.println("PIZZA");
				}else if(x>=z){
					System.out.println("BURGER");
				}else{
					System.out.println("NOTHING");
				}
			}
		}
	}
}