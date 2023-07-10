package JavaDi;
import java.util.Scanner;

public class JavaDigitos {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		String numeroDois = Integer.toString(numero);
		if (numeroDois.length() >= 5)
			System.out.println("Este numero passa ou tem 5 digitos ");
		else
			System.out.println("Esse numero tem "+numeroDois.length()+" Digitos");
	}

}
