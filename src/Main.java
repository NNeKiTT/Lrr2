// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Random;
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        long l;
        boolean b = true;
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
        System.out.println("b = " + b);
//        public static void main(String[] args) {
//            double s = 10.0;
//            double f1 = 5.0;
//            double l = 0.5;
//
//            double result = Math.log(s) + Math.log10(f1) - Math.asin(l);
//
//            System.out.println("Res = " + result);


    }
}