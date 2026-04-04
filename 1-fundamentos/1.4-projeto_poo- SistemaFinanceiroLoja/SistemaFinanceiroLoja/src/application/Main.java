package application;

import entities.Produto;
import entities.contaBancaria;
import entities.loginUser;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------SISTEMA DA LOJA MACACO LOUCO------------------------");
        System.out.println("VAMOS FAZER O SEU CADASTRO NA LOJA COM AS INFORMAÇÕES ABAIXO: ");
        loginUser userDefault;

        while (true) {
            System.out.print("Login(Máximo 12 caracteres): ");
            String nome = sc.nextLine();
            if (nome.length() > 12) {
                System.out.println("Login invalido, tente Novamente");
            } else {
                System.out.println("Senha(Maximo 8 caracteres): ");
                String senha = sc.nextLine();
                if (senha.length() > 8) {
                    System.out.println("Senha invalida, tente novamente.");
                } else {
                    System.out.println("Cadastro realizado com sucesso!");
                    userDefault = new loginUser(nome, senha);
                    break;
                }

            }
        }


        while (true) {
            System.out.println("------------------------MENU DE LOGIN--------------------");
            System.out.println("1.Login: ");
            String loginUser = sc.nextLine();
            if (!userDefault.getUsername().equals(loginUser)) {
                System.out.println("Login incorreto, tente novamente!");
            } else {
                System.out.println("2.Senha: ");
                String senha = sc.nextLine();
                if (!userDefault.getPassword().equals(senha)) {
                    System.out.println("Senha Incorreta, tente novamente!");
                } else {
                    System.out.println("Login Realizado com Sucesso!.");
                    break;
                }
            }
        }

        System.out.println("----------MENU DO BANCO-----------");
        System.out.println("Titular da conta: ");
        String name = sc.nextLine();
        System.out.println("Saldo inicial da conta: ");
        double saldoInicial = sc.nextDouble();

        contaBancaria userRoot = new contaBancaria(name, saldoInicial);

        while(true){
            System.out.printf("1 - Depositar\n2 - Sacar\n3 - Ver saldo\n4 - Sair\n");
            int option = sc.nextInt();
            if(option == 1){
                System.out.println("Valor a depositar: ");
                double depositValue = sc.nextDouble();
                userRoot.depositar(depositValue);
            }else if(option == 2){
                System.out.println("Valor a sacar: ");
                double withdrowValue = sc.nextDouble();
                userRoot.sacar(withdrowValue);
            }else if(option == 3){
                System.out.println("-----INFORMAÇÕES DA CONTA-----");
                userRoot.mostrarInformacoes();
            }else if(option == 4){
                break;
            }else{
                System.out.println("Informação Invalida");
            }
        }

        System.out.println("------------MENU DA LOJA-PRODUTOS-----------------");
        sc.nextLine();
        System.out.println("É Obrigatorio adicionar ao menos um item antes de prosseguir para adicionar outros.");
        System.out.println("Nome do produto: ");
        String nameProduct = sc.nextLine();
        System.out.println("Preço do produto: ");
        double productPrice = sc.nextDouble();
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(nameProduct, productPrice));

        while(true){
            System.out.printf("1 - Adicionar Produto\n2 - Remover produto\n3 - Listar produtos\n4 - Sair\n");
            int option = sc.nextInt();
            if(option == 1 ){
                System.out.println("Nome do produto: ");
                sc.nextLine();
                String localName = sc.nextLine();
                System.out.println("Preço do produto: ");
                double localPrice = sc.nextDouble();

                produtos.add(new Produto(localName, localPrice));
            }else if(option == 2){
                System.out.println("Informe o indice do produto, lembrando que os itens são organizados começando pela posição [0]");
                System.out.println("Indice do produto a ser removido: ");
                int localIndex = sc.nextInt();
                if(localIndex <= (produtos.size() - 1)){
                    produtos.remove(localIndex);
                }else{
                    System.out.println("Indice invalido, tente novamente!");
                }
            }else if(option == 3){
                System.out.println("Produtos: ");
                for(int x = 0; x <= produtos.size()-1; x++){
                    System.out.println("Item["+x+"]");
                    System.out.println("Nome:["+produtos.get(x).getName()+"]");
                    System.out.println("Preço:["+produtos.get(x).getPrice()+"]");
                }
            }else if(option == 4){
                break;
            }else{
                System.out.println("Opção invalida");
            }
        }

        sc.close();
    }
}

