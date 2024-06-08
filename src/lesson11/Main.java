package lesson11;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = {
                1, 2, 3, 4, 5
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + i);
        }

        System.out.println("G G :)");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
            System.out.println(arr[i] + " " + i);
        }

        System.out.println("G G :)");

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " " + i);
        }
    }
}
