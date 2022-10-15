package br.edu.femass.model;
import java.time.LocalDate;

public class Emprestimo
{
    private LocalDate dataEmprestimo, dataPrevistaDevolucao, dataDevolucao;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao, LocalDate dataDevolucao)
    {
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataEmprestimo()
    {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo)
    {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao()
    {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao)
    {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao()
    {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao)
    {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString()
    {
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", dataPrevistaDevolucao=" + dataPrevistaDevolucao +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
