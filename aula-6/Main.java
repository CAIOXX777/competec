import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[3];
        double[] precos = new double[3];
        int[] quantidades = new int[3];
        double[] valoresTotais = new double[3];
        

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Produto " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = entrada.nextLine();
            System.out.print("Preço: ");
            precos[i] = entrada.nextDouble();
            System.out.print("Quantidade: ");
            quantidades[i] = entrada.nextInt();
            entrada.nextLine(); 

            valoresTotais[i] = precos[i] * quantidades[i];
            System.out.println();
        }

        
        System.out.println("Valores totais em estoque:");
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + ": R$ " + valoresTotais[i]);
        }

       
        double maiorValor = valoresTotais[0];
        int indiceMaior = 0;

        for (int i = 1; i < 3; i++) {
            if (valoresTotais[i] > maiorValor) {
                maiorValor = valoresTotais[i];
                indiceMaior = i;
            }
        }

        System.out.println("\nProduto com maior valor em estoque:");
        System.out.println(nomes[indiceMaior] + " com R$ " + maiorValor);

        
    }
}
