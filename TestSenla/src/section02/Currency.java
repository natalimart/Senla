package section02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Enter amount BYN to convert: ");
        double byn = new Scanner(System.in).nextInt();


        double usd = 3.3162;
        double eur = 3.6040;
        double rub = 3.4252;
        double pln = 8.2778;
        double uah = 8.0518;
        var result = byn * usd + " USD" + '\n' +
                byn * eur + " UER" + '\n' +
                byn * rub + " RUB" + '\n' +
                byn * pln + " PLN" + '\n' +
                byn * uah + " UAH" +'\n';


        System.out.println(byn + " BYN = " + '\n' + result);

    }

}
