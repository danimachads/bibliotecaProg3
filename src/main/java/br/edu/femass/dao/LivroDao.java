package br.edu.femass.dao;

import br.edu.femass.model.Livro;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class LivroDao extends Persistencia<Livro> implements Dao<Livro> {

    private final static String ARQUIVO_LIVRO = "livros.json";

    public void gravar(Livro livro) throws Exception{
        List<Livro> livros = getAll();
        livros.add(livro);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(livros);
        FileOutputStream out = new FileOutputStream(ARQUIVO_LIVRO);
        out.write(json.getBytes());
        out.close();
    }

    public List<Livro> getAll() throws Exception{
        try {
            FileInputStream in = new FileInputStream(ARQUIVO_LIVRO);
            String json = new String(in.readAllBytes());
            List<Livro> livros = getObjectmapper().readValue(json, new TypeReference<List<Livro>>(){});
            return livros;
        } catch (FileNotFoundException f) {
            return new ArrayList();
        }
    }
}
