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

## 💻 Prática do Dia (com códigos)

### 🔸 1. Lendo e armazenando valores em um array

```java
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

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

---

## 📈 Evolução

Hoje consegui:

- Pensar melhor antes de programar
- Diminuir erros básicos de lógica
- Entender melhor como percorrer arrays
- Ganhar mais confiança com estruturas de repetição

---

## 🎯 Próximos Passos

- Praticar mais exercícios com arrays
- Aprender **matrizes (arrays bidimensionais)**
- Resolver problemas mais desafiadores
- Começar pequenos projetos usando esses conceitos

---

## ✍️ Conclusão

O estudo de hoje foi essencial para fortalecer a base da programação. Arrays e lógica são fundamentais para qualquer desenvolvedor, e dominar esses conceitos vai facilitar muito o aprendizado das próximas etapas.

---

💡 _"A lógica é o que transforma código em solução."_
