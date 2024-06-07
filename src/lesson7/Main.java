package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = new String("hello");
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something...");
        String s = sc.nextLine();
        System.out.println(s);

        System.out.println("Enetr number...");
        int x = sc.nextInt();
        System.out.println(x);
    }
}
