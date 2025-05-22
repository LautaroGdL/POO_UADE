import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSwing extends JFrame {
    private JLabel jsFirstName;
    private JTextField textField1;
    private JButton clickMeButton;
    private JPanel MainPanel;

    public MainSwing() {
        setContentPane(MainPanel);
        setTitle("Simple GUI App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                JOptionPane.showMessageDialog(MainSwing.this, "Welcome " + firstName);
            }
        });
    }

    public static void main(String[] args) {
        new MainSwing();
    }
}
