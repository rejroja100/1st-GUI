import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class myFrame extends JFrame {

    JLabel l = new JLabel("My GUI");
    JLabel l2 = new JLabel("I love you.");
    Button button;
    ImageIcon ii;


    public myFrame(){
        super("Rejwoan Parvej");
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setBounds(500, 50, 200, 500);
        setLocationRelativeTo(null);
        //setSize(300, 400);
        l.setText("Rejwoan");
        Font font = new Font("Monaco", Font.ITALIC, 40);
        l.setFont(font);
        ii = new ImageIcon("C:\\Users\\Rejwoan Parvej\\Desktop\\imon.jpg");
        setResizable(false);

        button = new Button("Click");

        l = new JLabel(ii);
        button.setForeground(Color.gray);

        add(button);
        add(l);
        add(l2);
        pack();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello world, Rejwoan !!!");
                setTitle("Rejwoan !!");
            }
        });

    }
}
