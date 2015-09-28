import org.apache.sanselan.util.Debug;

/**
 * Created by makma_000 on 9/27/2015.
 */
public class BackgroundAction implements Runnable {

    long time = 0;
    String msg = "";

    public BackgroundAction(String msg) {
        time = System.nanoTime();
        this.msg = msg;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Debug.debug("Interrupted");
            }

            long diff = System.nanoTime() - time;

            if (diff > 30_000_000_000.0) {
                time = System.nanoTime();
                AlertWindow dialog = new AlertWindow(msg);
                dialog.pack();
                dialog.setVisible(true);
            }

        }
    }

    public void start() {
        (new Thread(this)).start();
    }
}
