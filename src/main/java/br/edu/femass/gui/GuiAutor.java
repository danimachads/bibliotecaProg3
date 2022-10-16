package br.edu.femass.gui;

import br.edu.femass.dao.AutorDao;
import br.edu.femass.model.Autor;
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
                Autor autor = new Autor(txtNome.getText(), txtSobrenome.getText(), txtNacionalidade.getText());
                try {
                    new AutorDao().gravar(autor);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Autor gravado com sucesso!");
            }
        });
    }

    public JPanel getjPanel() {
        return jPanel;
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
