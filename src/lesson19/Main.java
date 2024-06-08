package lesson19;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        human.setName("Human");
        human.setAge(2);

        System.out.println(human.getAge() + " " + human.getName());
    }
}

class Human {
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
