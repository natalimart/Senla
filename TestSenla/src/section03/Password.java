package section03;
import java.security.SecureRandom;
import java.util.Scanner;

public class Password {
    static String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@$%^&*";
    static SecureRandom rnd = new SecureRandom();
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter length: ");
            int leng = new Scanner(System.in).nextInt();

            if (leng < 8 || leng > 12) {
                System.out.println("Incorrect number!");
            } else {
                System.out.println(randomPass(symbols, leng));
                break;
            }
        }
    }

    public static String randomPass(String symbols, int len){
        StringBuilder pass = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            pass.append(symbols.charAt(rnd.nextInt(symbols.length())));
        }
        return pass.toString();
    }
}