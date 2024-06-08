package lesson12;

public class Main {
    public static void main(String[] args) {
        String[] str = new String[5];
        String[] str2 = new String[5];
        byte myByte = 0;

        for (int i = 0; i < str.length; i++) {
            str[i] = "Hello World " + i;
            System.out.println(str[i]);
        }

        System.out.println("G G :)");

        for (String strings : str2) {
            myByte += 1;
            strings = "H" + myByte;
            System.out.println(strings);
        }
    }
}
