
public class Challenge4 {
    public static void main(String[] args) {

        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("[0-9\\.]+")) {
                double val = Double.parseDouble(args[i]);
                sum += val;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
