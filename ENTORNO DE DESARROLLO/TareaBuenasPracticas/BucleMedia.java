public class BucleMedia {
    // Cálculo de la media
    static double getAvg(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] numbers = new double[args.length];
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                double number = Double.parseDouble(args[i]);
                numbers[i] = number;
            }
            double media = getAvg(numbers);
            System.out.println("La media es " + media);
        } else {
            System.out.println("Añade los argumentos");
        }
    }
}
