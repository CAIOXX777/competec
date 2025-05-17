import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	double hamburguer = 19.99;
	double batata = 7.99;
	double coca = 5.00;
	double milkshake = 11.00;
	
	
	
	double carrinho = 40.00;
	double carteira = 40.00;
	

	
	if(carrinho < carteira){
	    System.out.println("Compra bem sucedida!");
	    System.out.println("Sobrou Dinheiro!");
	} else if(carrinho == carteira){
	    System.out.println("Compra bem sucedida");
	    System.out.println("zerei!");}
	    else{
	        System.out.println("naum vai cumer");
	    }
}
}	

