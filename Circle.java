interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}