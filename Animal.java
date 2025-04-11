class Animal {
    void sound() {
        System.out.println("Generic Animal Sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}