package FORMATIVA;
import java.util.Scanner;
public class quadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int dado,lado;
		
		System.out.println("qual o tamanho dos lados dessse QUADRADO");
		lado = ler.nextInt();
		
		dado = (lado*4);
		
		System.out.println("a area desse quadrado é: " +dado);
		
		
	}
		}
	

