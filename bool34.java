import java.util.Scanner;

public class bool34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();

        boolean natija;
        natija = ((x + y) % 2 != 0);
        System.out.println(natija);
    }
}
