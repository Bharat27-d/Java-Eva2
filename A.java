class A {
    final void show() {
        System.out.println("Final Method");
    }
}

class B extends A {
    // void show() {} // Error: Cannot override final method
    public static void main(String[] args) {
        new B().show();
    }
}