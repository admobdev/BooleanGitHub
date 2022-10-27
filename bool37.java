import java.util.Scanner;

public class bool37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X1: ");
        int x1 = sc.nextInt();
        System.out.print("Y1: ");
        int y1 = sc.nextInt();
        System.out.print("X2: ");
        int x2 = sc.nextInt();
        System.out.print("Y2: ");
        int y2 = sc.nextInt();
        boolean natija;
        natija = (Math.abs(y2 - y1) <= 1) && (Math.abs(x2-x1) <= 1);
        System.out.println(natija);
    }
}
