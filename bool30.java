import java.util.Scanner;

public class bool30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:");
        int a = sc.nextInt();
        System.out.print("B:");
        int b = sc.nextInt();
        System.out.print("C:");
        int c = sc.nextInt();
        boolean natija;
        natija = ((a - c) == 0) && ((a - b) == 0) && ((b - c) == 0);
        System.out.println(natija);
    }
}
