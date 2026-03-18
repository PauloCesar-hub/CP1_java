# 🚀 ERS — Employee Resource System

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/POO-Object%20Oriented-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Build-Manual-lightgrey?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/License-Academic-green?style=for-the-badge"/>
</p>

---

## 📌 Visão Geral

O **ERS (Employee Resource System)** é um sistema desenvolvido em **Java** que simula o núcleo de um módulo corporativo responsável pela **gestão de colaboradores e recursos internos**.

Projetos como este são utilizados em empresas reais por áreas como:

- Recursos Humanos (RH)  
- Financeiro  
- Facilities  
- Segurança  
- Compras  
- Operações  

O foco do projeto é a **modelagem de domínio** utilizando apenas **Java puro (sem frameworks ou banco de dados)**.

---

## 🎯 Objetivos do Projeto

O sistema permite:

- ✅ Cadastro de colaboradores  
- ✅ Cadastro de recursos corporativos  
- ✅ Alocação de equipamentos  
- ✅ Devolução de recursos  
- ✅ Consulta de dados  
- ✅ Controle de custo por colaborador  

---

## 🧩 Funcionalidades

### 👤 Colaboradores
- Cadastro e gerenciamento  
- Promoção (cargo e salário)  
- Controle de status  

### 💻 Recursos
- Cadastro de ativos  
- Controle de disponibilidade  
- Validação de alto valor  

### 🔄 Alocações
- Associação colaborador ↔ recurso  
- Devolução de recursos  
- Histórico de uso  

### ⚙️ Sistema Interativo
- Menu via console  
- Adição e remoção de dados  
- Busca por índice  
- Listagem completa  

---

## ⚠️ Tratamento de Erros

O sistema implementa tratamento robusto de exceções:

- `InputMismatchException` → entrada inválida  
- `IndexOutOfBoundsException` → índice inválido  
- `IllegalArgumentException` → dados incorretos  
- `IllegalStateException` → operações inválidas  

💡 Simula comportamento real de sistemas corporativos.

---

## 🏗 Estrutura do Sistema

### 👤 Colaborador
```java
String nome;
String cargo;
double salario;
boolean ativo;

Recurso
String nomeDoRecurso;
String categoria;
boolean disponivel;
double valorEstimado;

Recurso
String nomeDoRecurso;
String categoria;
boolean disponivel;
double valorEstimado;

🏢 SistemaERS

Gerencia listas (ArrayList)

Aplica regras de negócio

Controla operações do sistema

📊 Regras de Negócio

✔️ Colaborador inicia ativo

✔️ Recursos devem estar disponíveis

✔️ Recursos acima de R$5000 exigem autorização

✔️ Validação de dados

✔️ Proteção contra listas vazias

💡 Diferenciais

✔️ Arquitetura orientada a domínio

✔️ Uso de listas como persistência

✔️ Tratamento completo de exceções

✔️ Simulação de sistema corporativo real

✔️ Menu interativo no console

🧪 Como Executar
# Compile
javac Main.java

# Execute
java Main

Ou execute diretamente pelo IntelliJ IDEA.

🛠 Tecnologias

Java

IntelliJ IDEA

Programação Orientada a Objetos

🚫 Sem frameworks ou banco de dados

📚 Conceitos Aplicados

POO (Programação Orientada a Objetos)

Encapsulamento

Regras de negócio

Estruturas de dados (ArrayList)

Tratamento de exceções (try/catch)

📈 Próximos Passos

API REST com Spring Boot

Banco de dados (PostgreSQL)

Interface Web

Sistema de autenticação

Relatórios

👨‍💻 Autores
Nome	RM
Paulo Cesar de Govea Junior	RM566034
Guilherme Vilela Perez	RM564422
Gustavo Panham Dourado	RM563904
Christian Schunck de Almeida	RM563850
Thomas Jeferson Santana Wang	RM565104
