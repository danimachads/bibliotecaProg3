package br.edu.femass.dao;
import java.util.List;

public interface Dao<T>
{
    public void gravar(T object) throws Exception;
    public List<T> getAll() throws Exception;
}