package behavioral.command;

public class CommandExample {
    public static void main(String[] args) {
        Task task = new Task(10, 20); // encapsulate requests
        Task task2 = new Task(20, 30);

        Thread thread = new Thread(task);
        thread.start(); // invoker

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
class Task implements Runnable {
    int num1;
    int num2;
    Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() { // execution
        System.out.println(num1*num2); // receiver
    }
}
