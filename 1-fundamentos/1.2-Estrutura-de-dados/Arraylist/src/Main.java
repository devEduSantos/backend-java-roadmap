import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itemsShop = new  ArrayList<>();

        System.out.println("------------------CARRINHO DE COMPRAS_------------------------");

        int conditional = 0;
        while(conditional == 0){
            System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO: ");
            System.out.println("[1] - ADICIONAR ITEM(NÃO PODE ADICIONAR O MESMO ITEM 2 VEZES)");
            System.out.println("[2] - REMOVER ITEM");
            System.out.println("[3] - LISTAR ITENS");
            System.out.println("[4] - FECHAR PROGRAMA");

            int op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Nome do item a adicionar: ");
                    sc.nextLine();
                    String nameItem = sc.nextLine();
                    if(itemsShop.contains(nameItem)){
                        System.out.println("item ja adicionado, tente novamente com outro item.");
                    }else{
                        itemsShop.add(nameItem);
                    }

                    break;
                case 2:
                    System.out.println("Nome do item a remover: ");
                    sc.nextLine();
                    String item = sc.nextLine();
                    if(itemsShop.contains(item)){
                        itemsShop.remove(item);
                    }else{
                        System.out.println("Item não existe na lista, tente novamente.");
                    }
                    break;
                case 3:
                    System.out.println("Itens do carrinho: ");
                    for(int i = 0; i < itemsShop.size(); i++){
                        System.out.printf("[%d] - %s\n", i+1, itemsShop.get(i));
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