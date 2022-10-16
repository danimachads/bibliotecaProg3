package br.edu.femass.gui;

import br.edu.femass.dao.AlunoDao;
import br.edu.femass.gui.GuiAluno;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLeitor {
    private JButton buttonCadastrarProf;
    private JButton buttonCadastrarAluno;
    private JPanel jPanel;

    public JPanel getjPanel() {
        return jPanel;
    }

    public GuiLeitor() {
        buttonCadastrarAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAluno guiAluno = new GuiAluno();
                JFrame frame = new JFrame("Cadastrar aluno");
                frame.setContentPane(guiAluno.getjPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        buttonCadastrarProf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiProfessor guiProfessor = new GuiProfessor();
                JFrame frame = new JFrame("Cadastrar professor");
                frame.setContentPane(guiProfessor.getjPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
        public static void main(String [] args) {
            GuiLeitor guiLeitor = new GuiLeitor();
            JFrame frameLeitor = new JFrame("Cadastro de Leitor");
            frameLeitor.setContentPane(guiLeitor.jPanel);
            frameLeitor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameLeitor.pack();
            frameLeitor.setVisible(true);
        }
    }
