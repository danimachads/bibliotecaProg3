package br.edu.femass.dao;

import br.edu.femass.model.Aluno;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao extends Persistencia<Aluno> implements Dao<Aluno> {
    private static final String ARQUIVO_ALUNOS = "alunos.json";

    public void gravar(Aluno aluno) throws Exception{
        List<Aluno> alunos = getAll();
        alunos.add(aluno);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(alunos);
        FileOutputStream out = new FileOutputStream(ARQUIVO_ALUNOS);
        out.write(json.getBytes());
        out.close();
    }

    public List<Aluno> getAll() throws Exception{
        try {
            FileInputStream in = new FileInputStream(ARQUIVO_ALUNOS);
            String json = new String(in.readAllBytes());
            List<Aluno> alunos = getObjectmapper().readValue(json, new TypeReference<List<Aluno>>(){});
            return alunos;
        } catch (FileNotFoundException f) {
            return new ArrayList();
        }
    }

}