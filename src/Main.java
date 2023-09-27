// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Random;
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        long l;
        boolean b;
        float f;
        short s = 1200;
        f = s;
        Random random = new Random();
        l = random.nextInt(201) - 100;
        s = (short) l;
        l = (long) f;
        System.out.println("f = " + f);
        System.out.println("l = " + l);
        System.out.println("s = " + s);
    }
}