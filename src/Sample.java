import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing ウィンドウ");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JLabel("Swing が使えるよ！"));
        frame.setVisible(true);
        //aiueo
    }
}
