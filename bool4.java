import java.util.Scanner;

public class bool4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:");
        int a = sc.nextInt();
        System.out.print("B:");
        int b = sc.nextInt();
        boolean natija;
        natija =  (a > 2 && b <= 3);
        System.out.println(natija);
    }
}
