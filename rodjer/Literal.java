package rodjer;

import java.util.Scanner;

public class Literal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число: ");
        boolean a = scan.nextBoolean();
        System.out.println(a);
        System.out.print("Введіть число: ");
        String b = scan.next();
        System.out.println(b);
        System.out.print("Введіть число: ");
        String c = scan.next();
        System.out.println(c + '\u00F7');
        System.out.println("Числа: ");
        int a1 = 0b1101010110;
        int b2 = 012314;
        int c3 = 456;
        int d4 = 0x141D12;
        System.out.println("Число a в двоичной системе: " + a1);
        System.out.println("Число b в восьмеричной системе: " + b2);
        System.out.println("Число c в десятичной системе: " + c3);
        System.out.println("Число d в шестнадцатеричной системе: " + d4);
        float e = scan.nextFloat();
        System.out.print("Введіть число: ");
        double f = scan.nextDouble();
        System.out.print("Введіть число: ");
    }
}
