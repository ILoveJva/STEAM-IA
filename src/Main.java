import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setSize(500,300);
        JPanel painel = new JPanel();
        painel.setSize(300,200);
        painel.setLayout(new GridLayout());
        JLabel label = new JLabel();
        label.setText("Autoformação\nSTEAM + IA");
        painel.add(label);
        frame.add(painel);
        frame.setVisible(true);
    }
}