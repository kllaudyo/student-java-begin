public class DivisaoPorZeroException extends Exception{

	public DivisaoPorZeroException(){
		super("Progama malvado! Tentou destruir o coitado do processador com uma divisão maluca por Zero!!! Lero lero, não conseguiu!.");
	}

	public DivisaoPorZeroException(String message){
		super(message);
	}
  
}
