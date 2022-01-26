import java.util.*;
class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int carNo = sc.nextInt();
                ArrayList<Integer> carList = new ArrayList<>();
                for (int j = 0; j < carNo; j++) {
                    carList.add(sc.nextInt());
                }
                int c = 1; int mn = carList.get(0);
                for (int j = 1; j < carNo; j++) {
                    if(carList.get(j) <= mn){
                        c=c+1;
                    }
                    if(carList.get(j) < mn){
                        mn = carList.get(j);
                    }
                } 
                System.out.println(c);
            }
        }
    }
}