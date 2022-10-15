package br.edu.femass.dao;

import br.edu.femass.model.Professor;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDao extends Persistencia<Professor> implements Dao<Professor> {

    private final static String ARQUIVO_PROFESSOR = "professores.json";

    public void gravar(Professor professor) throws Exception {

        List<Professor> professores = getAll();
        professores.add(professor);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(professores);

        FileOutputStream out = new FileOutputStream(ARQUIVO_PROFESSOR);
        out.write(json.getBytes());
        out.close();
    }

    public List<Professor> getAll() throws Exception{
        try{
            FileInputStream in = new FileInputStream(ARQUIVO_PROFESSOR);
            String json = new String(in.readAllBytes());
            List<Professor> professores = getObjectmapper().readValue(json, new TypeReference<List<Professor>>(){});
            return professores;
        } catch (FileNotFoundException f){
            return new ArrayList();
        }
    }
}
