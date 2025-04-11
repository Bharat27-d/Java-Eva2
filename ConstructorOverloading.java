class Person {
    String name;
    int age;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        new Person("Kaisen").show();
        new Person("Kaisen", 20).show();
    }
}