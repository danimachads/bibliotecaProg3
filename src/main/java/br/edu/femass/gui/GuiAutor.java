package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAutor {
    private JTextField txtNome;
    private JTextField txtSobrenome;
    private JTextField txtNacionalidade;
    private JButton buttonSalvar;
    private JPanel jPanel;

    public GuiAutor() {
        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Autor gravado!");
            }
        });
    }

    public static void main(String [] args)
    {
        GuiAutor guiAutor = new GuiAutor();
        JFrame frame = new JFrame("Cadastro de Autor");
        frame.setContentPane(guiAutor.jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
