class Worker extends Thread {
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Worker().start();
        new Worker().start();
    }
}