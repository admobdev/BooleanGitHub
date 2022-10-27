import java.util.Scanner;

public class bool15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:");
        int a = sc.nextInt();
        System.out.print("B:");
        int b = sc.nextInt();
        System.out.print("C:");
        int c = sc.nextInt();
        boolean natija;
        natija = (a <= 0 && b > 0 && c > 0 || a > 0 && b <= 0 && c > 0 || a > 0 && b > 0 && c <= 0);
        System.out.println(natija);
    }
}
