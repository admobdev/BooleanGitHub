import java.util.Scanner;

public class bool32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:");
        int a = sc.nextInt();
        System.out.print("B:");
        int b = sc.nextInt();
        System.out.print("C:");
        int c = sc.nextInt();
        boolean natija;
        natija =  (a * a == c * c + b * b) || (b * b == c * c + a * a) || (c * c == a * a + b * b);
        System.out.println(natija);
    }
}
