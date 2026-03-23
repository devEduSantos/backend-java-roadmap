import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.println("----------------------NOTAS BIMESTRAIS DOS ALUNOS---------------------------------");
        for(int x = 1; x <= notas.length; x++){
            System.out.println("Nota do " + x + "ºBimestre");
            notas[x-1] = sc.nextDouble();
        }

        double somaNotas = 0;
        for(int y = 0; y < notas.length; y++){
            somaNotas += notas[y];
        }

        double media = somaNotas/notas.length;

        if(media>=7){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
