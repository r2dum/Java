package rodjer;

import java.util.Scanner;

public class Neparne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = scan.nextInt();
        if(a % 2 != 0){
            System.out.println(a);
        }
    }
}
