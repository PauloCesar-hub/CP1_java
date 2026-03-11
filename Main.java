
package br.com.ers;

public class Main {
    public static void main(String[] args) {

        SistemaERS ers = new SistemaERS();

        ers.cadastrarColaborador(new Colaborador(1, "Ana Souza", "Analista", 5500, "2026-02-10"));
        ers.cadastrarColaborador(new Colaborador(2, "Bruno Lima", "Dev Jr", 4500, "2026-03-01"));
        ers.cadastrarColaborador(new Colaborador(3, "Gustavo Panham", "Estagiario", 2800, "2026-02-14"));
        ers.cadastrarColaborador(new Colaborador(4, "Cristian Schunk", "Dev Jr", 4000, "2026-03-12"));


        ers.cadastrarRecurso(new Recurso(10, "MacBook Pro", "Notebook", 12000));
        ers.cadastrarRecurso(new Recurso(11, "Dell Latitude", "Notebook", 4200));
        ers.cadastrarRecurso(new Recurso(12, "Cadeira Ergonômica", "Cadeira", 1800));
        ers.cadastrarRecurso(new Recurso(13, "Fones de Ouvido", "Acessorio", 500));


        ers.listarColaboradores();
        ers.listarRecursos();

        ers.alocarRecurso(1, 11);
        ers.alocarRecurso(2, 12);
        ers.alocarRecurso(3, 13);

        ers.listarAlocacoes();

        double custo = ers.calcularCustoTotalPorColaborador(1);
        System.out.println("Custo total recursos colaborador 1: " + custo);

        ers.devolverRecurso(11, "Troca de equipamento");
        ers.devolverRecurso(13, "Quebrou o equipamento , cobrar multa do valor do produto");
    }
}
