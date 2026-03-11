
package br.com.ers;

public class Alocacao {
    private int colaboradorId;
    private int recursoId;
    private String data;
    private String observacao;

    public Alocacao(int colaboradorId, int recursoId, String data, String observacao) {
        this.colaboradorId = colaboradorId;
        this.recursoId = recursoId;
        this.data = data;
        this.observacao = observacao;
    }

    public int getColaboradorId() { return colaboradorId; }
    public int getRecursoId() { return recursoId; }
    public String getData() { return data; }
    public String getObservacao() { return observacao; }

    @Override
    public String toString() {
        return "Alocacao{" +
                "colaboradorId=" + colaboradorId +
                ", recursoId=" + recursoId +
                ", data='" + data + '\'' +
                (observacao != null && !observacao.isBlank() ? ", observacao='" + observacao + '\'' : "") +
                '}';
    }
}
