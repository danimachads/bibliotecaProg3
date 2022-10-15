package br.edu.femass.model;

public class Livro
{
    private Long codigo;
    private String titulo;
    private Autor autor;

    public Livro(Long codigo, String titulo)
    {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
    }

    public Long getCodigo()
    {
        return codigo;
    }

    public void setCodigo(Long codigo)
    {
        this.codigo = codigo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
