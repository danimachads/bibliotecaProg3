package br.edu.femass;

import br.edu.femass.dao.AlunoDao;
import br.edu.femass.model.Aluno;

public class App {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("1801230013", "Danielle", "RUa 43", "22998418932");
        AlunoDao dao = new AlunoDao();
        try {
            dao.gravar(aluno1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
