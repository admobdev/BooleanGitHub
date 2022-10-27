import java.util.Scanner;

public class bool29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X :");
        int x = sc.nextInt();
        System.out.print("Y :");
        int y = sc.nextInt();
        System.out.print("X1 :");
        int x1 = sc.nextInt();
        System.out.print("Y1 :");
        int y1 = sc.nextInt();
        System.out.print("X2 :");
        int x2 = sc.nextInt();
        System.out.print("Y2 :");
        int y2 = sc.nextInt();

        boolean natija = (x > x1) && (x < x2) && (y < y1) && (y > y2);
        System.out.println(natija);
    }
}
