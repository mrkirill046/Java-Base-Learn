package lesson14_15_16_17_18;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        person.name = "Kirill";
        person.age = 20;
        person1.name = "Roman";
        person1.age = 18;

        person.setM((byte) 12);
        person.print();
        person1.print();
        person.setUsername("");
        person1.setUsername("Kirill");

        System.out.println(person.calculateSomething(12));
        System.out.println(person1.calculateSomething(14));
        System.out.println(person.getM());
        System.out.println(person1.getUsername());
        System.out.println(person.getUsername());
    }
}

class Person {
    String name;
    int age;
    private byte m;
    private String username;

    public void setUsername(String _username) {
        if (_username.isEmpty()) {
            username = "error";
        } else {
            username = _username;
        }
    }

    public String getUsername() {
        return username;
    }


    public void setM(byte _m) {
        m = _m;
    }

    public byte getM() {
        return m;
    }

    int calculateSomething(int number) {
        return age - number;
    }

    void print() {
        System.out.println(name + " " + age + " " + m);
    }
}
