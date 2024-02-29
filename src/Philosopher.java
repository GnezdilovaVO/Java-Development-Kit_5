import java.util.Random;

public class Philosopher extends Thread{
    private int capasity = 3;
    private Fork leftFork, rightFork;
    private String name;

    public Philosopher(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        int count = 0;
        while(count < capasity) {
            try {
                think();
                if (leftFork.isFreeFork() && rightFork.isFreeFork()){
                    leftFork.setFreeFork(false);
                    rightFork.setFreeFork(false);
                    System.out.println(name + " взял вилки " + leftFork.getIdFork() + " " + rightFork.getIdFork());
                    eat();
                    count++;
                    leftFork.setFreeFork(true);
                    rightFork.setFreeFork(true);
                    System.out.println(name + " положил вилки " + leftFork.getIdFork() + " " + rightFork.getIdFork());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(name + " наелся=)");
    }

    private void eat() throws InterruptedException {
        System.out.println(name + " eст");
        Thread.sleep(new Random().nextInt(1000, 3000));
    }

    private void think() throws InterruptedException {
        System.out.println(name + " думает");
        Thread.sleep(new Random().nextInt(1000, 3000));
    }
}
