package br.edu.femass.gui;

import br.edu.femass.dao.AlunoDao;
import br.edu.femass.model.Aluno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiAluno {
    private JTextField txtMatricula;
    private JButton buttonSalvar;
    private JPanel jPanel;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JTextField txtEndereco;
    private JTextPane txtCodigoPane;

    public GuiAluno() {
        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aluno aluno = new Aluno(txtMatricula.getText(), txtNome.getText(), txtTelefone.getText(), txtEndereco.getText());
                try {
                    new AlunoDao().gravar(aluno);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Aluno gravado com sucesso!");
            }
        });
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public static void main(String [] args)
    {
        GuiAluno guiAluno = new GuiAluno();
        JFrame frameAluno = new JFrame("Cadastro de Aluno");
        frameAluno.setContentPane(guiAluno.jPanel);
        frameAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameAluno.pack();
        frameAluno.setVisible(true);
    }
}
