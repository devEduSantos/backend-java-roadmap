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
