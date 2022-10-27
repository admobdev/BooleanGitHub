import java.util.Scanner;

public class bool33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:");
        int a = sc.nextInt();
        System.out.print("B:");
        int b = sc.nextInt();
        System.out.print("C:");
        int c = sc.nextInt();
        boolean natija;
        natija = (a < b + c) && (b < c + a) && (c < a + b);
        System.out.println(natija);
    }
}
