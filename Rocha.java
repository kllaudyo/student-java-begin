//Importa classe necessária para gerar número randomico
import java.util.Random;

//Toda classe publica deve ter o mesmo nome do arquivo ".java", essa classe obrigatoriamente deve se chamar Rocha.java
public class Rocha{

	//
	private static int tentativas = 0;

	//Método chamado pelo comando java Rocha apos compilação
	//Método main é o método principal de qualquer classe java sendo o mesmo o ponto de partida da rotina
	public static void main(String []args){

		//Instancia classe que gerará o número randômico 
		Random r = new Random();
		
		//Método que retorna um interio de 0 a 100( o parametro define o número máximo )
		int numero = r.nextInt(100);

		//variavel que irá guardar a resposta do usuário
		int resposta;

		//Escolha do loop pois o programa ira funcionar até o usuário acertar a resposta
		//A escolha do loop "do" é porque ele sempre irá realizar a rotina ao menos uma vez
		do{

			if(tentativas == 0){
				System.out.println("Tente advinhar o numero que estou pensando de 1 a 100");	
			}else{
				System.out.println("Tente novamente, boa sorte:");	
			}

			//Lê a resposta do usuário via linha de comando
			resposta = Integer.parseInt(System.console().readLine());

			//ATENÇÃO aqui esta o pulo do gado do exercício, a variavel de classe tentativas
			//só pode ser atribuída desta forma por conta de ser uma variável estatíca
			//aqui poderia ser armazenado em uma variavel local, porém a orientação a objeto não seria utilizada
			//IMPORTANTÍSSIMO entender o conceito de "variáveis de classe"
			tentativas++;				
			
			if(numero == resposta){
				System.out.println("Parabéns você acertou em " + tentativas + " tentativas");
			}else if(numero > resposta){
				System.out.println("Opa você errou! Dica: É mais do que você pensou");
			}else if(numero < resposta){
				System.out.println("Opa você errou! Dica: É menos do que você pensou");
			}			
			
		//Finaliza loop quando usuário acertar a resposta			
		}while(numero != resposta);
	}
}
