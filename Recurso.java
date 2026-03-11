
package br.com.ers;

import java.util.ArrayList;
import java.util.List;

public class Recurso {
    private int id;
    private String nomeDoRecurso;
    private String categoria;
    private boolean disponivel;
    private double valorEstimado;
    private List<String> historico;

    public Recurso(int id, String nomeDoRecurso, String categoria, double valorEstimado) {
        this.id = id;
        this.nomeDoRecurso = nomeDoRecurso;
        this.categoria = categoria;
        this.valorEstimado = valorEstimado;
        this.disponivel = true;
        this.historico = new ArrayList<>();
        registrarEvento("Recurso cadastrado e marcado como disponível.");
    }

    public boolean podeSerAlocado() {
        return disponivel && valorEstimado <= 5000;
    }

    public void registrarEvento(String evento) {
        historico.add(evento);
    }

    public int getId() { return id; }
    public String getNomeDoRecurso() { return nomeDoRecurso; }
    public String getCategoria() { return categoria; }
    public boolean isDisponivel() { return disponivel; }
    public double getValorEstimado() { return valorEstimado; }
    public List<String> getHistorico() { return historico; }

    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", nomeDoRecurso='" + nomeDoRecurso + '\'' +
                ", categoria='" + categoria + '\'' +
                ", disponivel=" + disponivel +
                ", valorEstimado=" + valorEstimado +
                '}';
    }
}
