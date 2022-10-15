package br.edu.femass.model;

public class Aluno extends Leitor {

    private String matricula;

    public Aluno(String matricula, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        setPrazoMaximoDevolucao(15);
        this.matricula = matricula;
        setNextCodigo(this.getCodigo()+1);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
