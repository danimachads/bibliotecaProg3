package br.edu.femass.gui;

import br.edu.femass.dao.LivroDao;
import br.edu.femass.model.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLivro {
    private JTextField txtTitulo;
    private JTextField txtCodigo;
    private JButton buttonSalvar;
    private JPanel jPanel;
    private JTextField txtAutor;

    public GuiLivro() {
        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*Livro livro = new Livro(txtCodigo.getText(), txtAutor.getText());
                try {
                    new LivroDao().gravar(livro);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }*/
                JOptionPane.showMessageDialog(null, "Livro gravado com sucesso!");
            }
        });
    }

    public JPanel getjPanel() {
        return jPanel;
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
