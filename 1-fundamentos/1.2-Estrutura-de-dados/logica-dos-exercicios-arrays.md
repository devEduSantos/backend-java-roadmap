# 📘 Estudos do Dia: Arrays e Lógica de Programação

## 🚀 Objetivo

Hoje foquei em fortalecer meus conhecimentos em **lógica de programação** e **arrays**, entendendo melhor como manipular dados e estruturar soluções de forma mais eficiente.

---

## 🧠 Conceitos Aprendidos

### 🔹 Lógica de Programação

- Reforcei a importância de pensar passo a passo na resolução de problemas.
- Pratiquei a construção de algoritmos simples.
- Trabalhei com estruturas condicionais (`if`, `else`) e repetições (`for`, `while`).
- Entendi melhor como organizar o raciocínio antes de codar.

---

### 🔹 Arrays (Vetores)

- Aprendi que um **array** é uma estrutura de dados que armazena vários valores do mesmo tipo.
- Entendi que os arrays são **indexados**, começando na posição `0`.
- Pratiquei:
  - Declaração e inicialização de arrays
  - Acesso a elementos
  - Percorrer arrays com laços de repetição

---

## 💻 Prática do Dia (com códigos + explicação)

### 🔸 1. Lendo e armazenando valores em um array

```java
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // quantidade de números
        int[] vetor = new int[n]; // criação do array

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
```

🧠 **Explicação:**

- Criação de array com tamanho dinâmico
- Uso de `for` para entrada e saída
- Base de qualquer programa com listas

---

### 🔸 2. Calculando a média dos valores

```java
import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / n;
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}
```

🧠 **Explicação:**

- Uso de variável acumuladora (`soma`)
- Padrão clássico de média

---

### 🔸 3. Encontrando o maior valor

```java
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];

        for (int i = 1; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("MAIOR VALOR = " + maior);

        sc.close();
    }
}
```

🧠 **Explicação:**

- Técnica de comparação progressiva
- Muito usada em algoritmos de busca

---

### 🔸 4. Encontrando o menor valor

```java
import java.util.Scanner;

public class MenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        int menor = vetor[0];

        for (int i = 1; i < n; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("MENOR VALOR = " + menor);

        sc.close();
    }
}
```

🧠 **Explicação:**

- Mesma lógica do maior valor
- Mudando apenas o operador de comparação

---

## 📈 Evolução

Hoje consegui:

- Melhorar meu raciocínio lógico
- Entender padrões de repetição
- Trabalhar com arrays com mais confiança

---

## 🎯 Próximos Passos

- Estudar matrizes
- Resolver desafios mais difíceis
- Criar pequenos projetos

---

## ✍️ Conclusão

Hoje foi um passo importante na minha jornada como desenvolvedor. Dominar arrays e lógica é essencial para evoluir na programação.

---

💡 _"A lógica é o que transforma código em solução."_
