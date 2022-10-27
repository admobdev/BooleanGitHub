import java.util.Scanner;

public class bool28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X :");
        int x = sc.nextInt();
        System.out.print("Y :");
        int y = sc.nextInt();

        boolean natija;
        natija = ((x > 0) && (x > 0)) || ((x < 0) && (x < 0));
        System.out.println(natija);
    }
}
