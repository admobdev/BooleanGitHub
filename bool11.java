import java.util.Scanner;

public class bool11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:");
        int a = sc.nextInt();
        System.out.print("B:");
        int b = sc.nextInt();
        boolean natija,natija1,natija2;
        natija1 = (a % 2 != 0) && (b % 2 != 0);
        natija2 = (a % 2 == 0) && (b % 2 != 0);
        natija = (natija1 || natija2);
        System.out.println(natija);
    }
}
