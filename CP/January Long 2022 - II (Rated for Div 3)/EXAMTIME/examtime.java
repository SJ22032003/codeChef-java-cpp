import java.util.*;
public class examtime{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int t = sc.nextInt(),sumD = 0,sumS = 0;
			for (int i=0;i<t;i++) {
				int[] dragon = new int[3];
				int[] sloth = new int[3];
				for (int j=0;j<3;j++) {
					sumD += dragon[j] = sc.nextInt();
				}
				for (int j=0;j<3;j++) {
					sumS += sloth[j] = sc.nextInt();
				}

				if(sumD>sumS){System.out.println("DRAGON");}
				else if(sumD<sumS){System.out.println("SLOTH");}
				else{
					System.out.println(dragon[0]>sloth[0]?"DRAGON":sloth[0]>dragon[0]?"SLOTH":dragon[1]>sloth[1]?"DRAGON":sloth[1]>dragon[1]?"SLOTH":"TIE");
				}
				sumS=0;sumD=0;
			}
		}
	}
}