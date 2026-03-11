# ERS — Employee Resource System

## 📌 Visão Geral

O **ERS (Employee Resource System)** é um sistema desenvolvido em **Java** que simula o núcleo de um módulo corporativo responsável pela **gestão de colaboradores e recursos internos** de uma empresa.

Em empresas reais, sistemas desse tipo são utilizados por diversos departamentos, como:

- Recursos Humanos (RH)
- Financeiro
- Facilities
- Segurança
- Compras
- Operações

O objetivo deste projeto é implementar o **núcleo de domínio** desse sistema, permitindo controlar:

- cadastro de colaboradores
- cadastro de recursos corporativos
- alocação de equipamentos para colaboradores
- devolução de recursos
- rastreamento de histórico de uso

O sistema foi desenvolvido utilizando **apenas conceitos fundamentais da linguagem Java**, **sem uso de frameworks ou banco de dados**.

---

## 🎯 Objetivos do Projeto

Este projeto implementa as funcionalidades iniciais do **ERS**, permitindo:

- registrar colaboradores da empresa
- registrar recursos corporativos
- alocar recursos para colaboradores
- devolver recursos
- consultar dados do sistema

A implementação utiliza apenas:

- Classes
- Objetos
- Atributos
- Métodos
- Tipos primitivos
- Estruturas básicas da linguagem Java

---

## 🧩 Estrutura do Sistema

O sistema é composto pelas seguintes classes principais:

### 👤 Colaborador

Representa um funcionário da empresa.

**Atributos:**

- `id` — identificador único
- `nome` — nome do colaborador
- `cargo` — cargo ocupado
- `salario` — salário atual
- `ativo` — indica se o colaborador está ativo
- `dataDeAdmissao` — data de entrada na empresa

**Regra de negócio:**

Todo colaborador recém-admitido inicia automaticamente com:

```java
ativo = true;

Método de negócio:

public void promover(String novoCargo, double novoSalario)

Permite atualizar o cargo e o salário de um colaborador quando ocorre uma promoção.

💻 Recurso

Representa um recurso interno da empresa.

Exemplos de recursos:

notebooks

celulares

cadeiras

monitores

licenças de software

crachás

Atributos:

id

nomeDoRecurso

categoria

disponivel

valorEstimado

Regra de negócio:

Recursos com valor estimado superior a 5000 não podem ser alocados automaticamente, pois exigem autorização especial.

Método de verificação:

public boolean podeSerAlocado() {
    return disponivel && valorEstimado <= 5000;
}

Esse método garante que apenas recursos disponíveis e dentro do limite permitido possam ser alocados automaticamente.

📦 Alocacao

Representa a relação entre um colaborador e um recurso alocado.

Atributos:

colaboradorId

recursoId

data

observacao

Essa classe registra quando um recurso foi associado a um colaborador.

🏢 SistemaERS

Classe responsável por controlar o funcionamento geral do sistema.

Ela mantém três coleções principais:

lista de colaboradores

lista de recursos

lista de alocações

Principais funcionalidades:

cadastrar colaboradores

cadastrar recursos

listar colaboradores

listar recursos

buscar colaboradores

buscar recursos

alocar recursos

devolver recursos

calcular custos

⚙️ Regras de Negócio Implementadas

O sistema aplica algumas regras comuns em ambientes corporativos.

1. Colaborador inicia ativo

Quando um colaborador é criado, ele automaticamente começa como ativo no sistema.

Isso representa o processo de onboarding corporativo.

2. Recursos só podem ser alocados se estiverem disponíveis

Antes de realizar uma alocação, o sistema verifica:

recurso.disponivel == true

Caso contrário, a alocação é bloqueada.

3. Recursos de alto valor precisam de autorização

Equipamentos corporativos com valor acima de 5000 são considerados ativos de alto valor.

Nesse caso, o sistema exibe uma mensagem informando que o recurso exige autorização especial.

Essa regra simula políticas reais de governança de ativos.

🔍 Contexto Empresarial

Empresas reais possuem processos rigorosos para controle de ativos corporativos.

Este projeto se inspirou em práticas comuns utilizadas em organizações.

Inventário de ativos

Empresas utilizam sistemas de Asset Management para controlar:

notebooks

celulares

monitores

licenças de software

equipamentos de escritório

Esses sistemas permitem rastrear:

quem está usando o equipamento

quando foi entregue

quando foi devolvido

estado do recurso

Controle de equipamentos

Departamentos de Facilities e TI mantêm controle de equipamentos para evitar:

perda de ativos

uso indevido

alocação duplicada

problemas de auditoria

Por isso, sistemas corporativos sempre verificam:

disponibilidade do recurso

valor do ativo

histórico de uso

Governança de recursos

Em empresas grandes, equipamentos caros geralmente exigem:

aprovação de gestor

autorização financeira

registro formal de entrega

A regra de bloqueio de alocação acima de 5000 simula esse tipo de política corporativa.

Ciclo de vida do colaborador

Empresas tratam o colaborador em diferentes etapas:

onboarding (entrada na empresa)

movimentações internas

promoções

desligamento

O método promover() representa uma dessas etapas do ciclo de vida.

🚀 Inovação Implementada

Como funcionalidade adicional, foi implementado um recurso de análise de custo de equipamentos por colaborador.

Cálculo de custo total de recursos

O sistema permite calcular o valor total dos equipamentos associados a um colaborador.

Exemplo:

Notebook: 4000
Monitor: 1200
Licença de software: 800

Total: 6000

Esse tipo de análise é comum em empresas para:

gestão de custos de TI

controle de orçamento

auditoria de ativos

planejamento de compras

Histórico de movimentação de recursos

Outra inovação foi a criação de um histórico de eventos dentro da classe Recurso, permitindo registrar eventos como:

criação do recurso

alocação

devolução

manutenção

Esse tipo de histórico é utilizado em sistemas reais para auditoria e rastreabilidade.

🧪 Execução do Projeto

Para executar o sistema:

Abra o projeto no IntelliJ IDEA

Compile o projeto

Execute a classe:

Main.java

A execução demonstrará:

cadastro de colaboradores

cadastro de recursos

alocação de recursos

devolução

exibição de dados do sistema

🛠 Tecnologias Utilizadas

Java

IntelliJ IDEA

Programação Orientada a Objetos (POO)

Sem uso de:

frameworks

banco de dados

bibliotecas externas

📚 Conceitos de Programação Utilizados

Durante o desenvolvimento foram aplicados conceitos fundamentais de Java:

Classes e objetos

Encapsulamento

Métodos de negócio

Listas (ArrayList)

Manipulação de objetos

Estruturação de domínio

Regras de negócio

📈 Possíveis Evoluções do Sistema

Este sistema pode evoluir para incluir:

banco de dados

autenticação de usuários

autorização para alocação de recursos caros

relatórios de inventário

API REST

interface web

👨‍💻 Autores
Nome	RM
Paulo Cesar de Govea Junior	RM566034
Guilherme Vilela Perez	RM564422
Gustavo Panham Dourado	RM563904
Christian Schunck de Almeida	RM563850
Thomas Jeferson Santana Wang	RM565104
