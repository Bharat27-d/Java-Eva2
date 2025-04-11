interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A1 implements Printable, Showable {
    public void print() {
        System.out.println("Printing");
    }
    public void show() {
        System.out.println("Showing");
    }

    public static void main(String[] args) {
        A1 obj = new A1();
        obj.print();
        obj.show();
    }
}