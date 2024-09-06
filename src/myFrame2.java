import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class myFrame2 extends JFrame implements ActionListener {

    Button button1, button2, button3;
    Container con;

    public myFrame2(){
        // Initialize the buttons
        button1 = new Button("Cyan");
        button2 = new Button("Black");
        button3 = new Button("Blue");

        // JFrame setup
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setBounds(500, 50, 200, 500);

        // Get the content pane
        con = getContentPane();
        con.setForeground(gray);

        // Set button bounds
        button1.setBounds(10, 10, 60, 60);
        button2.setBounds(10, 80, 60, 60);  // Updated y-coordinate to avoid overlap
        button3.setBounds(10, 150, 60, 60); // Updated y-coordinate to avoid overlap

        // Add buttons to the frame
        add(button1);
        add(button2);
        add(button3);

        // Add action listeners
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            con.setBackground(CYAN);
        }
        if(e.getSource() == button2){
            con.setBackground(BLACK);
        }
        if(e.getSource() == button3){  // Corrected from button1 to button3
            con.setBackground(BLUE);
        }
    }
}
