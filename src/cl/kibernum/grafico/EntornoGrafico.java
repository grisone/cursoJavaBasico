package cl.kibernum.grafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kibernum on 31/05/2016.
 */
public class EntornoGrafico extends JFrame {

    private static final String TITULO = "Cuenta Corriente";

    public EntornoGrafico(){
        super(EntornoGrafico.TITULO);

//        panel.add(label);
//        panel.add(button);
        JPanel miPanel = this.mipanel();

        JButton button = new JButton();
        button.setText("Press me");

        JLabel label = new JLabel("This is a label!");

        miPanel.add(label);
        miPanel.add(button);

        JButton boton = new JButton("MI boton po compadre");
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Es un mensaje Simple de Información");
            }
        });

        miPanel.add(boton);

        /*
        JOptionPane.showMessageDialog(null,"Es un mensaje Simple de Información");

        JOptionPane.showMessageDialog(null, "Este es un mensaje de Advertencia",
                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

        Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
                "COLORES", JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");
         */


        this.add( miPanel);
        this.add( ingresoPersona() );

        this.setSize(200, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //this.pack();
        this.setVisible(true);
    }

    private JPanel mipanel(){
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        return  panel;
    }

    private JPanel ingresoPersona(){
        JPanel persona = new JPanel(new GridBagLayout());

        JLabel label = new JLabel("Nombre : ");
        JTextField nombre = new JTextField(20);
        nombre.setMinimumSize(new Dimension(200, 10));

        persona.add(label);
        persona.add(nombre);

        JLabel label2 = new JLabel("Rut   : ");
        JTextField rut = new JTextField(12);
        rut.setMinimumSize(new Dimension(200, 10));
        persona.add(label2);
        persona.add(rut);

        JLabel label3 = new JLabel("Edad   : ");
        JSpinner edad = new JSpinner( new SpinnerNumberModel(1,1,99,1) );
        persona.add(label3);
        persona.add(edad);


        return  persona;
    }

/*
    public static void main(String s[]) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("This is a label!");

        JButton button = new JButton();
        button.setText("Press me");

        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    */
}
