package br.edu.femass.dao;

import br.edu.femass.model.Exemplar;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExemplarDao extends Persistencia<Exemplar> implements Dao<Exemplar> {

    private final static String ARQUIVO_EXEMPLAR = "exemplares.json";

    public void gravar(Exemplar exemplar) throws Exception{
        List<Exemplar> exemplares = getAll();
        exemplares.add(exemplar);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(exemplares);
        FileOutputStream out = new FileOutputStream(ARQUIVO_EXEMPLAR);
        out.write(json.getBytes());
        out.close();
    }

    public List<Exemplar> getAll() throws Exception{
        try {
            FileInputStream in = new FileInputStream(ARQUIVO_EXEMPLAR);
            String json = new String(in.readAllBytes());
            List<Exemplar> exemplares = getObjectmapper().readValue(json, new TypeReference<List<Exemplar>>(){});
            return exemplares;
        } catch (FileNotFoundException f) {
            return new ArrayList();
        }
    }
}
