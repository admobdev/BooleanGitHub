import java.util.Scanner;

public class bool16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ikki xonali juft son: ");
        int num = sc.nextInt();
        boolean natija;

        natija = num % 2 == 0 && num > 9 && num < 100;
        System.out.println(natija);
    }
}
