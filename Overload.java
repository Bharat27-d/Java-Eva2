class Overload {
    void display(int a) {
        System.out.println("int: " + a);
    }
    void display(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.display(10);
        obj.display("Kaisen");
    }
}