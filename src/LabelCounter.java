import javax.swing.*;

/**
 * Created by makma_000 on 9/27/2015.
 */
public class LabelCounter implements Runnable {

    private JLabel display;

    private long baseTime = 0;

    public LabelCounter(JLabel display) {
        this.display = display;
        baseTime = System.nanoTime();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long diff = (System.nanoTime() - baseTime) / 1_000_000_000;

            SwingUtilities.invokeLater(() -> {
                display.setText("diff is " + diff);
            });
        }
    }

    public void reset() {
        baseTime = System.nanoTime();
        display.setText("diff is 0");
    }

    public void start() {
        (new Thread(this)).start();
    }
}
