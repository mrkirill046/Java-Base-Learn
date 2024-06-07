package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter 5");
            value = scanner.nextInt();
        } while (value != 5);

        System.out.println("You entered 5");
    }
}
