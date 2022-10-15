package br.edu.femass.model;

import java.time.LocalDate;

public class Exemplar extends Livro
{
    private Long codigoExemplar;
    private LocalDate dataAquisicao;

    public Exemplar(Long codigoExemplar, LocalDate dataAquisicao, Long codigo, String titulo)
    {
        super(codigo, titulo);
        this.codigoExemplar = codigoExemplar;
        this.dataAquisicao = dataAquisicao;
    }

    public Long getCodigoExemplar()
    {
        return codigoExemplar;
    }

    public void setCodigoExemplar(Long codigoExemplar)
    {
        this.codigoExemplar = codigoExemplar;
    }

    public LocalDate getDataAquisicao()
    {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao)
    {
        this.dataAquisicao = dataAquisicao;
    }
}
