package rodjer;

import java.util.Scanner;

public class Nextnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int x = scan.nextInt();
        System.out.printf("The next number for the number %d is %d\n", x, x+1);
        System.out.printf("The next previous for the number %d is %d", x, x-1);
    }
}
