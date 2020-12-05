import java.util.*;
import java.text.*;

public class Currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + n.format(payment));
        System.out.println("India: Rs." + n.format(payment).substring(1));
        n = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + n.format(payment));
        n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + n.format(payment));
    }
}
