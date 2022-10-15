package br.edu.femass.model;

public class Professor extends Leitor
{
    private String disciplina;
    public Professor(String disciplina, String nome, String endereco, String telefone)
    {
        super(nome, endereco, telefone);
        this.disciplina = disciplina;
        setPrazoMaximoDevolucao(30);
        setNextCodigo(this.getCodigo()+1);
    }

    public String getDisciplina()
    {
        return disciplina;
    }

    public void setDisciplina(String disciplina)
    {
        this.disciplina = disciplina;
    }
}
