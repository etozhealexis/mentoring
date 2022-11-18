import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        CreditData creditData = new CreditData(in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextLine().trim());
        CreditCalculator calc = new CreditCalculator();

        double result = calc.calculateOverpayment(creditData);

        System.out.println(result);
    }
}
