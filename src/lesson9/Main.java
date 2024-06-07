package lesson9;

public class Main {
    public static void main(String[] args) {
//        double gg = 3.7534348735464643634343;
        int i = 0;

        while (true) {
            if (i == 234578) {
                System.out.println("Hello World");
                break;
            }

            System.out.println(i);
            i++;
        }

        for (int j = 0; j <= 15; j++) {
            System.out.println("GG!");

            if (j % 2 == 0) {
                continue;
            }

            System.out.println("Hello World " + j);
        }

//        while (true) {
//            gg += 16.6343565665656678576675521344657543687684345 + 688768.46787389;
//            gg+= 870.27483681404;
//            System.out.println(gg);
//        }
    }
}
