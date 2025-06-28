package Basic_Arena;

class Person {
    public String country = "India";

    public void printCountry() {
        System.out.println("Country: " + country);
    }
}

public class Public {
    public static void main(String[] args) {
        Person p = new Person();
        p.printCountry();
    }
}
