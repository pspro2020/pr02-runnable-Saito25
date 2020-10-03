package clasees;

public class Potencias implements Runnable {

    final int number;

    public Potencias(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s: %d ^ %d = %.0f\n",
                    Thread.currentThread().getName(),
                    number,
                    i,
                    Math.pow(number, i));
        }
    }
}
