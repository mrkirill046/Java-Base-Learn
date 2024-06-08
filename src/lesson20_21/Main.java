package lesson20_21;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Kirill", 20);
        Human newHuman = new Human();

        System.out.println(human.name + " " + human.age);
    }
}

class Human {
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
        System.out.println("GG");
    }

    String name;
    int age;
}

// доделать
