package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLivro {
    private JTextField txtTitulo;
    private JTextField txtCodigo;
    private JButton buttonSalvar;
    private JPanel jPanel;

    public GuiLivro() {
        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Livro gravado!");
            }
        });
    }

    public static void main(String [] args)
    {
        GuiLivro guiLivro = new GuiLivro();
        JFrame frame = new JFrame("Cadastro de Livro");
        frame.setContentPane(guiLivro.jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
