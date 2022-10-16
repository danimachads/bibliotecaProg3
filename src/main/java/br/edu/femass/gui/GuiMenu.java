package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMenu {
    private JPanel jPanel;
    private JButton buttonCadastrarLivro;
    private JButton buttonConsultarListas;
    private JButton buttonCadastrarAutor;
    private JButton buttonCadastrarLeitor;

    public GuiMenu() {
        buttonCadastrarLeitor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiLeitor guiLeitor = new GuiLeitor();
                JFrame frame = new JFrame("Cadastrar leitor");
                frame.setContentPane(guiLeitor.getjPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        buttonCadastrarAutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAutor guiAutor = new GuiAutor();
                JFrame frame = new JFrame("Cadastrar autor");
                frame.setContentPane(guiAutor.getjPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        buttonCadastrarLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiLivro guiLivro = new GuiLivro();
                JFrame frame = new JFrame("Cadastrar livro");
                frame.setContentPane(guiLivro.getjPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public static void main(String [] args) {
        GuiMenu guiMenu = new GuiMenu();
        JFrame frameMenu = new JFrame("Biblioteca");
        frameMenu.setContentPane(guiMenu.jPanel);
        frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMenu.pack();
        frameMenu.setVisible(true);
    }
}
