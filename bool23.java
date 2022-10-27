import java.util.Scanner;

public class bool23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uch xonali son: ");
        int num = sc.nextInt();
        int yuz = num / 100;
        int on = num / 100 % 10;
        int bir = num % 10;

        boolean natija;
        natija = yuz == bir && on == on;
        System.out.println(natija);
    }
}
