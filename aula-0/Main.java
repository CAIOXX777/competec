import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    char nome='C';
	    int idade=15;
	    boolean tomouCafeDaManha=true;
	    int valorDaLaranja=7;
	    int valorDaUva=10;
	    int soma=valorDaUva+valorDaLaranja;
	    
	    System.out.print("Digite o valor da laranja:");
	    int laranja=entrada.nextInt();
	    
	     System.out.print("Digite o valor da uva:");
	    int uva=entrada.nextInt();
	    
		System.out.print("Resultado da soma ="+ (uva+ laranja) );
		
		
		
	}
}
