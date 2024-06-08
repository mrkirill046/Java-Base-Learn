package lesson13;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 5, 3},
                {3, 9, 7}
        };
        String[][] str = new String[1][2];

        System.out.println(numbers[1][2]);
        System.out.println("G G :)");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }
    }
}
