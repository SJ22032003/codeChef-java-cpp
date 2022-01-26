import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            long t = sc.nextLong();
            for (Long i = 0L; i < t; i++) {
                int n = sc.nextInt();
                long[][] arrBit = new long[n][n];
                for (int j = 0; j < arrBit.length; j++) {
                    for (int j2 = 0; j2 < arrBit.length; j2++) {
                        arrBit[j][j2] = 1L;
                    }
                }
                for (int j = 0; j < arrBit.length; j++) {
                    for (int j2 = 0; j2 < arrBit.length; j2++) {
                        System.out.print(arrBit[j][j2]+" ");
                    }
                    System.out.println();
                } 
            }
        }
    }
}