package br.edu.femass.dao;

import br.edu.femass.model.Emprestimo;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoDao extends Persistencia<Emprestimo> implements  Dao<Emprestimo> {

    private final static String ARQUIVO_EMPRESTIMO = "emprestimos.json";

    public void gravar(Emprestimo emprestimo) throws Exception{
        List<Emprestimo> emprestimos = getAll();
        emprestimos.add(emprestimo);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(emprestimos);
        FileOutputStream out = new FileOutputStream(ARQUIVO_EMPRESTIMO);
        out.write(json.getBytes());
        out.close();
    }

    public List<Emprestimo> getAll() throws Exception{
        try {
            FileInputStream in = new FileInputStream(ARQUIVO_EMPRESTIMO);
            String json = new String(in.readAllBytes());
            List<Emprestimo> emprestimos = getObjectmapper().readValue(json, new TypeReference<List<Emprestimo>>(){});
            return emprestimos;
        } catch (FileNotFoundException f) {
            return new ArrayList();
        }
    }
}
