import java.util.Scanner;

public class bucles71 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un entero positivo...");
        int n = scan.nextInt();

        while (n < 1) {
            System.out.println("Introduce un numero que sea positivo y mayor que 0...");
            n = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print(i + j);
            }

        }
    }
}

