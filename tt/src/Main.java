import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        Client c = new Client(in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextLine().trim());

        System.out.println(c.findAns());
    }
}
