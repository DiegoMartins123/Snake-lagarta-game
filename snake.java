import javax.swing.*;

public class snake extends JFrame {
    public snake(){
        this.add(new Graphics());
        this.setTitle("Snake game");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}