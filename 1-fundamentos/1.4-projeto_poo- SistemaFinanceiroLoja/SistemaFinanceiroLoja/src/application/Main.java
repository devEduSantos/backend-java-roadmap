package application;

import entities.loginUser;

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

        sc.close();
    }
}

