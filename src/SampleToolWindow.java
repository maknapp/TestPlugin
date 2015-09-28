import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by makma_000 on 9/27/2015.
 */
public class SampleToolWindow {
    private JButton button1;
    private JPanel sampleJPanel;
    private JLabel myLabel;

    private LabelCounter labelCounter;

    public SampleToolWindow() {

        labelCounter = new LabelCounter(myLabel);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCounter.reset();
            }
        });

        labelCounter.start();
    }

    public JPanel getPanel() {
        return sampleJPanel;
    }
}
