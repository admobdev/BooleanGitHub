import java.util.Scanner;

public class bool24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A soni 0 dan farqli:");
        int a = sc.nextInt();
        System.out.print("B :");
        int b = sc.nextInt();
        System.out.print("C :");
        int c = sc.nextInt();
        int d = (int) (Math.pow(b, 2) - 4 * a * c);
        boolean natija = (!(a == 0) && (d >= 0));
        System.out.println(natija);
    }
}
