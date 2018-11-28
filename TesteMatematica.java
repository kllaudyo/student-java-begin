public class TesteMatematica{

	public static void main(String args[]){
		try{
			//Matematica.dividir(0,0);
			Matematica.dividir(0.0f, 0.0f);
		}catch(Exception ex){
			System.out.println("Erro no programa");
			ex.printStackTrace();
		}
	}
  
}
