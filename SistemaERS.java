
package br.com.ers;

import java.util.ArrayList;
import java.util.List;

public class SistemaERS {

    private List<Colaborador> colaboradores;
    private List<Recurso> recursos;
    private List<Alocacao> alocacoes;

    public SistemaERS() {
        this.colaboradores = new ArrayList<>();
        this.recursos = new ArrayList<>();
        this.alocacoes = new ArrayList<>();
    }

    public void cadastrarColaborador(Colaborador c) {
        if (buscarColaboradorPorId(c.getId()) != null) {
            System.out.println("ERRO: Já existe colaborador com id " + c.getId());
            return;
        }
        colaboradores.add(c);
        System.out.println("OK: Colaborador cadastrado -> " + c.getNome());
    }

    public void cadastrarRecurso(Recurso r) {
        if (buscarRecursoPorId(r.getId()) != null) {
            System.out.println("ERRO: Já existe recurso com id " + r.getId());
            return;
        }
        recursos.add(r);
        System.out.println("OK: Recurso cadastrado -> " + r.getNomeDoRecurso());
    }

    public Colaborador buscarColaboradorPorId(int id) {
        for (Colaborador c : colaboradores) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public Recurso buscarRecursoPorId(int id) {
        for (Recurso r : recursos) {
            if (r.getId() == id) return r;
        }
        return null;
    }

    public Alocacao buscarAlocacaoAtivaPorRecursoId(int recursoId) {
        Alocacao ultima = null;
        for (Alocacao a : alocacoes) {
            if (a.getRecursoId() == recursoId) {
                ultima = a;
            }
        }
        return ultima;
    }

    public void listarColaboradores() {
        System.out.println("=== COLABORADORES ===");
        if (colaboradores.isEmpty()) System.out.println("(vazio)");
        for (Colaborador c : colaboradores) System.out.println(c);
    }

    public void listarRecursos() {
        System.out.println("=== RECURSOS ===");
        if (recursos.isEmpty()) System.out.println("(vazio)");
        for (Recurso r : recursos) System.out.println(r);
    }

    public void listarAlocacoes() {
        System.out.println("=== ALOCAÇÕES ===");
        if (alocacoes.isEmpty()) System.out.println("(vazio)");
        for (Alocacao a : alocacoes) System.out.println(a);
    }

    public void alocarRecurso(int colaboradorId, int recursoId) {
        Colaborador c = buscarColaboradorPorId(colaboradorId);
        if (c == null) {
            System.out.println("ERRO: Colaborador não encontrado.");
            return;
        }

        Recurso r = buscarRecursoPorId(recursoId);
        if (r == null) {
            System.out.println("ERRO: Recurso não encontrado.");
            return;
        }

        if (!r.isDisponivel()) {
            System.out.println("ERRO: Recurso já está alocado.");
            return;
        }

        if (r.getValorEstimado() > 5000) {
            System.out.println("BLOQUEADO: recurso exige autorização especial.");
            return;
        }

        Alocacao aloc = new Alocacao(colaboradorId, recursoId, "2026-03-03", "Alocação padrão");
        alocacoes.add(aloc);
        r.setDisponivel(false);
        r.registrarEvento("ALOCADO para colaboradorId=" + colaboradorId);

        System.out.println("OK: recurso alocado.");
    }

    public void devolverRecurso(int recursoId, String observacao) {
        Recurso r = buscarRecursoPorId(recursoId);
        if (r == null) {
            System.out.println("ERRO: Recurso não encontrado.");
            return;
        }

        r.setDisponivel(true);
        r.registrarEvento("DEVOLVIDO | " + observacao);
        System.out.println("OK: recurso devolvido.");
    }

    public double calcularCustoTotalPorColaborador(int colaboradorId) {
        double total = 0;
        for (Alocacao a : alocacoes) {
            if (a.getColaboradorId() == colaboradorId) {
                Recurso r = buscarRecursoPorId(a.getRecursoId());
                if (r != null) total += r.getValorEstimado();
            }
        }
        return total;
    }
}
