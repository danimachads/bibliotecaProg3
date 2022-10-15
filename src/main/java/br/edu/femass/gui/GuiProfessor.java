package br.edu.femass.gui;

import br.edu.femass.dao.ProfessorDao;
import br.edu.femass.model.Professor;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiProfessor {
    private JTextField txtDisciplina;
    private JButton buttonSalvar;
    private JPanel jPanel;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JTextField txtEndereco;

    public GuiProfessor() {
        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Professor professor = new Professor(txtDisciplina.getText(), txtNome.getText(), txtTelefone.getText(), txtEndereco.getText());
                try {
                    new ProfessorDao().gravar(professor);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Professor gravado com sucesso!");
                }
        });
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public static void main(String [] args)
    {
        GuiProfessor guiProfessor = new GuiProfessor();
        JFrame frameProfessor = new JFrame("Cadastro de Professor");
        frameProfessor.setContentPane(guiProfessor.jPanel);
        frameProfessor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameProfessor.pack();
        frameProfessor.setVisible(true);
    }
}
