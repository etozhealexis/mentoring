import java.io.Console;

public class Main {
    public static void main(String[] args) throws Exception {
        Console console = System.console();

        if (console != null) {
            String data = console.readLine();
            String[] dataSplit = data.split(" ");

            CreditData creditData = new CreditData(Float.parseFloat(dataSplit[0]), Float.parseFloat(dataSplit[1]),
                    Float.parseFloat(dataSplit[2]), dataSplit[3]);
            CreditCalculator calc = new CreditCalculator();

            double result = calc.calculateOverpayment(creditData);

            console.printf(String.valueOf(result));
        }

    }
}
