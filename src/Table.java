import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Fork> forks = new ArrayList<>(5);
    private List<Philosopher> philosophers = new ArrayList<>(5);
    public Table() {
        Fork fork1 = new Fork(0);
        Fork fork2 = new Fork(1);
        Fork fork3 = new Fork(2);
        Fork fork4 = new Fork(3);
        Fork fork5 = new Fork(4);

        Thread philosopher1 = new Thread(new Philosopher("Филосов 1", fork1, fork2));
        Thread philosopher2 = new Thread(new Philosopher("Филосов 2", fork2, fork3));
        Thread philosopher3 = new Thread(new Philosopher("Филосов 3", fork3, fork4));
        Thread philosopher4 = new Thread(new Philosopher("Филосов 4", fork4, fork5));
        Thread philosopher5 = new Thread(new Philosopher("Филосов 5", fork5, fork1));
        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();




    }

    public List<Philosopher> getPhilosophers() {
        return philosophers;
    }
}
