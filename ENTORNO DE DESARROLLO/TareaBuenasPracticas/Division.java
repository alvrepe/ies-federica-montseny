public class Division {
    // Cálculo de division entre 2 números
    public static double getDivision(double x, double y) {
        double result = x / y;
        return result;
    }
    // Imprimir resultado de la división
    public static void printResult(double resultDivision) {
        System.out.println("El resultado de la división es: " + resultDivision);
    }

    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;
        double result = 0;

        if (args.length != 2) {
            System.out.println("ERROR. El programa no continúa.");
        } else {
            // pone el valor de la posicion 0 del array args dentro de la variable num,
            // y lo convierte a double
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);

            if (num2 == 0) System.out.println("ERROR. El segundo numero es 0.");
            else {
                result = getDivision(num1, num2);
                printResult(result);
            }
        }
    }

}

