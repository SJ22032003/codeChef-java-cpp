import java.util.*;
public class FIZZBUZZ{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for (int i=1;i<=100;i++) {
				if(i%3==0 && i%5==0){
					System.out.println(i+" FIZZBUZZ");
				}else if(i%3==0){System.out.println(i+" BUZZ");}
				else if(i%5==0){System.out.println(i+" FIZZ");}
				else{
					System.out.println(i);
				}
			}
		}
	}
}