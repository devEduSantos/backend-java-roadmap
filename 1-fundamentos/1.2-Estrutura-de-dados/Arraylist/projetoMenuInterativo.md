# 🍽️ Projeto: Menu Interativo (Carrinho de Compras) em Java

## 📌 Descrição

Este projeto implementa um **menu interativo em Java via console** que simula um **carrinho de compras**, permitindo ao usuário **adicionar, remover e listar itens** dinamicamente.

O foco principal é consolidar conceitos de **lógica de programação**, **controle de fluxo**, **listas dinâmicas (ArrayList)** e **interação com o usuário via terminal**.

---

## 🎯 Objetivos do Projeto

* Construir um menu interativo com múltiplas opções
* Manipular coleções dinâmicas com `ArrayList`
* Controlar fluxo com `while` e `switch`
* Validar operações (evitar duplicados, remover itens inexistentes)
* Praticar entrada de dados com `Scanner`

---

## 🧠 Lógica do Sistema

### 🔁 1. Loop principal (execução contínua)

O sistema permanece ativo até o usuário escolher encerrar:

```java
int conditional = 0;
while (conditional == 0) {
    // exibe menu
    // lê opção
    // executa ação
}
```

💡 **Ideia-chave:** manter o programa rodando continuamente (padrão comum em sistemas interativos).

---

### 📋 2. Estrutura do Menu

A cada iteração, o menu é exibido com opções claras:

```java
System.out.println("[1] - ADICIONAR ITEM");
System.out.println("[2] - REMOVER ITEM");
System.out.println("[3] - LISTAR ITENS");
System.out.println("[4] - FECHAR PROGRAMA");
```

---

### 🧺 3. Estrutura de dados (ArrayList)

O carrinho utiliza uma lista dinâmica para armazenar itens:

```java
ArrayList<String> itemsShop = new ArrayList<>();
```

💡 **Por que `ArrayList`?**

* Tamanho dinâmico
* Fácil inserção e remoção
* Ideal para listas que mudam durante a execução

---

### ➕ 4. Adicionar item (com validação de duplicidade)

```java
System.out.println("Nome do item a adicionar: ");
sc.nextLine();
String nameItem = sc.nextLine();

if (itemsShop.contains(nameItem)) {
    System.out.println("item ja adicionado, tente novamente com outro item.");
} else {
    itemsShop.add(nameItem);
}
```

🧠 **Explicação:**

* `contains()` verifica se o item já existe
* Evita duplicidade (regra de negócio)
* `add()` insere o novo item

---

### ➖ 5. Remover item (com validação)

```java
System.out.println("Nome do item a remover: ");
sc.nextLine();
String item = sc.nextLine();

if (itemsShop.contains(item)) {
    itemsShop.remove(item);
} else {
    System.out.println("Item não existe na lista, tente novamente.");
}
```

🧠 **Explicação:**

* Garante que só remove itens existentes
* Evita erros e melhora a experiência do usuário

---

### 📄 6. Listar itens do carrinho

```java
System.out.println("Itens do carrinho: ");
for (int i = 0; i < itemsShop.size(); i++) {
    System.out.printf("[%d] - %s\n", i + 1, itemsShop.get(i));
}
```

🧠 **Explicação:**

* `size()` retorna o total de itens
* `get(i)` acessa cada elemento
* Exibição numerada melhora a leitura

---

### 🔀 7. Controle com switch-case

```java
int op = sc.nextInt();

switch (op) {
    case 1:
        // adicionar item
        break;
    case 2:
        // remover item
        break;
    case 3:
        // listar itens
        break;
    case 4:
        conditional = 1;
        break;
}
```

💡 **Boa prática:** usar `switch` para múltiplas opções melhora a organização do código.

---

## 💻 Código Completo

```java
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itemsShop = new ArrayList<>();

        System.out.println("------------------CARRINHO DE COMPRAS_------------------------");

        int conditional = 0;
        while (conditional == 0) {
            System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO: ");
            System.out.println("[1] - ADICIONAR ITEM(NÃO PODE ADICIONAR O MESMO ITEM 2 VEZES)");
            System.out.println("[2] - REMOVER ITEM");
            System.out.println("[3] - LISTAR ITENS");
            System.out.println("[4] - FECHAR PROGRAMA");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Nome do item a adicionar: ");
                    sc.nextLine();
                    String nameItem = sc.nextLine();
                    if (itemsShop.contains(nameItem)) {
                        System.out.println("item ja adicionado, tente novamente com outro item.");
                    } else {
                        itemsShop.add(nameItem);
                    }
                    break;
                case 2:
                    System.out.println("Nome do item a remover: ");
                    sc.nextLine();
                    String item = sc.nextLine();
                    if (itemsShop.contains(item)) {
                        itemsShop.remove(item);
                    } else {
                        System.out.println("Item não existe na lista, tente novamente.");
                    }
                    break;
                case 3:
                    System.out.println("Itens do carrinho: ");
                    for (int i = 0; i < itemsShop.size(); i++) {
                        System.out.printf("[%d] - %s\n", i + 1, itemsShop.get(i));
                    }
                    break;
                case 4:
                    conditional = 1;
                    break;
            }
        }

        sc.close();
    }
}
```

---

## 🧩 Conceitos Aplicados

* ✔️ `ArrayList` (estrutura dinâmica)
* ✔️ `while` (loop contínuo)
* ✔️ `switch-case` (controle de fluxo)
* ✔️ `Scanner` (entrada de dados)
* ✔️ Validação de dados (`contains`)
* ✔️ Iteração com `for`

---

## 🚀 Possíveis Melhorias

* 🔹 Separar lógica em métodos (clean code)
* 🔹 Criar classe `Item` (POO)
* 🔹 Persistência em arquivo ou banco
* 🔹 Tratamento de exceções (`try-catch`)
* 🔹 Interface gráfica (JavaFX)

---

## 📈 Aprendizados

Este projeto reforça um conceito essencial:

> **Controlar o fluxo do sistema com base nas ações do usuário e manter dados organizados dinamicamente.**

---

## ✍️ Conclusão

A construção deste carrinho de compras foi fundamental para evoluir na lógica de programação e no uso de estruturas dinâmicas. Mesmo sendo um projeto simples, ele representa um padrão utilizado em sistemas reais.

---

💡 *"Programar é transformar lógica em comportamento real."*
