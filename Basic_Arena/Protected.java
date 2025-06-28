package Basic_Arena;

class Person {
    protected int age;

    public void setAge(int a) {
        age = a;
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }
}

public class Protected {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(22);
        p.printAge();
    }
}
