class Demo {
    Demo() {
        System.out.println("This is a constructor");
    }

    void show() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}