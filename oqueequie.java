package FORMATIVA;
import java.util.Scanner;
public class oqueequie {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int v1, v2, soma, sub, mult, div; //troquei para int para melhor leitura pelo resultado (double fica 0.0)
		String form; //v1 e v2 são valores e o restante são os metodos de reallizar a conta

		//entrada de dados
		System.out.println("Qual o primeiro valor da conta?: ");
		v1 = ler.nextInt();

		System.out.println("Qual o segundo valor da conta?: ");
		v2 = ler.nextInt();

		System.out.println("Será um conta de + ou - ou * ou / (escolha digitando o sinal referente a conta)");
		form = ler.next();

		//execução dos dados ( que pode alternar pelo uso de if) e saida dos dados
		if (form.equals("+")) {
			soma = (v1+v2);
			System.out.println("A SOMA DE "+v1+ " COM "+v2+ " É DE " +soma);
			System.out.println(v1+"+"+v2+"="+soma);
		}
		else if (form.equals("-")) {
			sub = (v1-v2);
			System.out.println("A SUBTRAÇÃO DE "+v1+ " COM "+v2+" É DE "+sub);
			System.out.println(v1+"-"+v2+"="+sub);
		}

		else if (form.equals("*")) {
			mult = (v1*v2);
			System.out.println("A MULTIPLICAÇÃO DE "+v1+ " COM "+v2+" É DE "+mult);
			System.out.println(v1+"*"+v2+"="+mult);
		}

		else if (form.equals("/")) {
			div = (v1/v2);
			System.out.println("A DIVISÃO DE "+v1+ " COM "+v2+" É DE "+div);
			System.out.println(v1+"/"+v2+"="+div); //Divisão só por ter mesmo (sei que não pediu)
		}
		else {
			System.out.println("LAMENTO, MAS ESSE DADO ESTÁ INCOMPATIVEL COM NOSSO SISTEMA, REINICIE E TENTE NOVAMENTE");
		}
	}

}