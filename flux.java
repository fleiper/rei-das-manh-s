package FORMATIVA;
import java.util.Scanner;
public class flux {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int	fah, cel;
		
		System.out.println("===========================================================================================");
		System.out.println("ESCREVA A TEMPERATURA EM ***FAHRENHEIT*** PARA SER CONVERTIDA EM GRAUS CELSIUS ");//entrada de dados
		fah = ler.nextInt();
		
		cel = ((fah -32)*5)/9; //execução / conversão
		
		
		System.out.println("===================================PROCESSANDO=================================");
		System.out.print("A CONVERSÃO DESSES VALORES É DE: "); //saida de dados
		System.out.print(cel);
		//como comigo semples quis deixar o mais visual possivel
	}

}
