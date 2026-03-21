# 🚀 Estudos Backend Java — Dia 1

## 📅 Sobre o estudo

Neste primeiro dia, iniciei minha jornada em desenvolvimento Backend com Java, focando nos fundamentos da programação e aplicando o conhecimento em um pequeno projeto prático.

---

## 🧠 Perguntas e Respostas (Fundamentos)

### 1. O que é um algoritmo?

Algoritmo é uma sequência de passos finitas, lógicas e bem definidas de instruções para se chegar à conclusão de um problema.

---

### 2. O que é uma variável?

Variável em programação é um espaço alocado na memória para armazenar um valor de diferentes tipos. Funciona como uma "caixa" que guarda um valor que pode ser alterado durante a execução do programa.

---

### 3. Diferença entre int e String

Em Java, `int` é um tipo primitivo que armazena diretamente um valor numérico. Já `String` é um objeto (tipo referência), que possui métodos e armazena uma referência para um valor textual na memória.

---

### 4. Para que serve o if?

O `if` é uma estrutura condicional que verifica se uma condição é verdadeira ou falsa para executar determinado bloco de código.

---

### 5. Quando usar um for?

O `for` é utilizado quando sabemos previamente quantas vezes uma repetição deve acontecer.

---

## 🚧 Projeto — Cadastro de Trabalhador

### 📌 Descrição

Desenvolvi um sistema simples no terminal que realiza o cadastro de um trabalhador, aplicando validações básicas de dados.

---

### ⚙️ Funcionalidades

- Entrada de dados via usuário:

  - Nome
  - Idade
  - Salário
  - CPF

- Validações implementadas:

  - Idade mínima (18 anos)
  - Salário mínimo
  - CPF com 11 dígitos

- Exibição formatada das informações

---

### 💻 Trecho do código

import java.util.Locale;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRO DE PESSOA TRABALHISTA(MAIORES DE IDADE): ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        if(idade < 18){
            System.out.println("Você é menor de idade, tente novamente quando você possuir 18 anos ou mais");
            return;
        }
        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        if(salario < 1548){
            System.out.println("Salario invalido, está abaixo do salario minimo estabelecido pela lei, tente novamente com um salário justo.");
            return;
        }
        System.out.println("CPF(Digite sem pontuações ou traços apenas digitos): ");
        sc.nextLine();
        String cpf = sc.nextLine();
        if(cpf.length() != 11){
            System.out.println("CPF invalido");
            return;
        }

        System.out.println("------------INFORMAÇÔES DO TRABALHADOR--------------");
        System.out.printf("Nome: %s\nIdade: %d\nSalario: R$ %.2f\nCPF: %s",nome,idade,salario,cpf);

        sc.close();
        }
    }
