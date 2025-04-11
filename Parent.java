class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void print() {
        System.out.println("Parent x: " + super.x);
        System.out.println("Child x: " + x);
    }

    public static void main(String[] args) {
        new Child().print();
    }
}