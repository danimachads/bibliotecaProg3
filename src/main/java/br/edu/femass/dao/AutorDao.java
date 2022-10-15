package br.edu.femass.dao;

import br.edu.femass.model.Autor;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AutorDao extends Persistencia<Autor> implements Dao<Autor> {

    private static final String ARQUIVO_AUTORES = "autores.json";

    public void gravar(Autor autor) throws Exception{
        List<Autor> autores = getAll();
        autores.add(autor);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(autores);
        FileOutputStream out = new FileOutputStream(ARQUIVO_AUTORES);
        out.write(json.getBytes());
        out.close();
    }

    public List<Autor> getAll() throws Exception{
        try {
            FileInputStream in = new FileInputStream(ARQUIVO_AUTORES);
            String json = new String(in.readAllBytes());
            List<Autor> autores = getObjectmapper().readValue(json, new TypeReference<List<Autor>>(){});
            return autores;
        } catch (FileNotFoundException f) {
            return new ArrayList();
        }
    }

}