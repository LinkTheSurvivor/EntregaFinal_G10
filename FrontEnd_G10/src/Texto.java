import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Daniel Pozo Marques

public class Texto extends JFrame {
    private JTextArea textArea1;
    private JPanel panel1;

    public Texto(String text){
        textArea1.setText(text);
        setContentPane(panel1);
        setBounds(470,410,1205,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
    }

}


