import java.util.Scanner;

public class PideArray {

    static Scanner scan = new Scanner(System.in);

    static int[] Readnumbers() {
        System.out.print("Introduzca el tamaño del array: ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.print("El array debe tener al menos un valor, introduzca un tamaño superior a 0: ");
            n = scan.nextInt();
        }
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        return numbers;
    }

    static boolean isValueInArray(int[] array, int value) {
        boolean found = false;
        for (int number : array) {
            if (number == value) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int number = 0;
        int[] numbers1 = Readnumbers();
        int[] numbers2 = Readnumbers();
        for (int i = 0; i < numbers1.length; i++) {
            number = numbers1[i];
            if (isValueInArray(numbers2, number)) {
                System.out.println(number);
            }
        }
    }
}
