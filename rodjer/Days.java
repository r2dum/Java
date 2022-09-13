package rodjer;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Понеділок");
        }
        else if(a == 2){
            System.out.println("Вівторок");
        }
        else if(a == 3){
            System.out.println("Середа");
        }
        else if(a == 4){
            System.out.println("Четверг");
        }
        else if(a == 5){
            System.out.println("П'ятниця");
        }
        else if(a == 6){
            System.out.println("Субота");
        }
        else if(a == 7){
            System.out.println("Неділя");
        }
        else System.out.println("Нема такого дня неділі");
    }
}
