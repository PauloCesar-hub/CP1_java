
package br.com.ers;

public class Colaborador {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;
    private String dataDeAdmissao;

    public Colaborador(int id, String nome, String cargo, double salario, String dataDeAdmissao) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
        this.ativo = true;
    }

    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public boolean isAtivo() { return ativo; }
    public String getDataDeAdmissao() { return dataDeAdmissao; }

    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    @Override
    public String toString() {
        return "Colaborador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", ativo=" + ativo +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }
}
