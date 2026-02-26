import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Gui extends JFrame {

    public Gui() {
        setTitle("Példa GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Fő panel, GridBagLayout-tal
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // 1. JTable
        String[] columns = {"Név", "Kor", "Város"};
        Object[][] data = {
                {"Anna", 25, "Budapest"},
                {"Béla", 30, "Debrecen"},
                {"Csaba", 28, "Szeged"}
        };
        JTable table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane tableScroll = new JScrollPane(table);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(tableScroll, gbc);

        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // 2. JButton
        JButton button1 = new JButton("Gomb 1");
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(button1, gbc);

        // 3. JButton
        JButton button2 = new JButton("Gomb 2");
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(button2, gbc);

        // 4. JTextField
        JTextField textField = new JTextField("Írj valamit");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(textField, gbc);

        // 5. JPasswordField
        JPasswordField passwordField = new JPasswordField();
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(passwordField, gbc);

        // 6. JCheckBox
        JCheckBox checkBox = new JCheckBox("Ellenőrző négyzet");
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(checkBox, gbc);

        // 7. JRadioButton
        JRadioButton radio1 = new JRadioButton("Opció 1");
        JRadioButton radio2 = new JRadioButton("Opció 2");
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(radio1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(radio2, gbc);

        // 8. JLabel
        JLabel label = new JLabel("Ez egy címke");
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(label, gbc);

        // 9. JComboBox
        String[] items = {"Elem 1", "Elem 2", "Elem 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(comboBox, gbc);

        // 10. JSlider
        JSlider slider = new JSlider(0, 100, 50);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(slider, gbc);

        // 11. JSpinner
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        gbc.gridx = 2;
        gbc.gridy = 4;
        panel.add(spinner, gbc);

        add(panel);
    }
}
