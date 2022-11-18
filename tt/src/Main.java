
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        String[] dataSplit = data.split(" ");

        CreditData creditData = new CreditData(Float.parseFloat(dataSplit[0]), Float.parseFloat(dataSplit[1]),
                    Float.parseFloat(dataSplit[2]), dataSplit[3]);
        CreditCalculator calc = new CreditCalculator();

        double result = calc.calculateOverpayment(creditData);

        System.out.println(result);


    }
}
