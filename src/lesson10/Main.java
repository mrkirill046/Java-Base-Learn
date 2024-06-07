package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");

        int age = sc.nextInt();

        switch (age) {
            case 1:
                System.out.println("You are vary old");
                break;
            case 2:
                System.out.println("You are old");
                break;
            case 3:
                System.out.println("You are little");
                break;
            default:
                System.out.println("!!!");
        }
    }
}
