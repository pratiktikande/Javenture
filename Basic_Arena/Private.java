package Basic_Arena;

class Person {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
}

public class Private {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Pratik");
        p.printName();
    }
}
