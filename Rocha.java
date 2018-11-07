import java.util.Random;

public class Rocha{

	private static int tentativas = 0;

	public static void main(String []args){

		Random r = new Random();		
		int numero = r.nextInt(100);
		int resposta;
		do resposta = registraTentativa(numero); while(numero != resposta);

	}

	private static int registraTentativa(int numero){

		if(tentativas == 0)
			System.out.println("Tente advinhar o numero que estou pensando de 1 a 100");	
		else
			System.out.println("Tente novamente, boa sorte:");	

		int resposta = Integer.parseInt(System.console().readLine());

		tentativas++;				
		
		if(numero == resposta)
			System.out.println("Parabens voce acertou em " + tentativas + " tentativas");
		else if(numero > resposta)
			System.out.println("Opa voce errou! Dica: E mais do que voce pensou");
		else if(numero < resposta)
			System.out.println("Opa voce errou! Dica: E menos do que voce pensou");

		return resposta;

	}
}
