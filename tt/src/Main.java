import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Client c = new Client(in.nextFloat(), in.nextFloat(), in.nextFloat(), in.nextLine());

        System.out.println(c.getSum());
        System.out.println(c.getMonth());
        System.out.println(c.getPercent());
        System.out.println(c.getType());
    }
}
