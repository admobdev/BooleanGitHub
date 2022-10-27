import java.util.Scanner;

public class bool2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Musbat son: ");
        int a = sc.nextInt();
        boolean natija;
        natija =  a % 2 != 0;
        System.out.println(natija);
    }
}
