import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in)){
            int pen = sc.nextInt();
            int pencil = sc.nextInt();
            int costPen = sc.nextInt();
            int costPencil = sc.nextInt();
            System.out.println(pen*costPen + pencil*costPencil);
        }
    }
}
