public class Matematica{

	public static Float dividir(Float numerador, Float divisor) throws DivisaoPorZeroException{
		if(divisor == 0)
			throw new DivisaoPorZeroException();

		return numerador/divisor;
	}

	public static Integer dividir(Integer numerador, Integer divisor) throws Exception{
		if(divisor == 0)
			throw new Exception("A divisão por zero é proibida");

		return numerador/divisor;			
	}

	public static Double dividir(Double numerador, Double divisor) throws Exception{
		if(divisor == 0)
			throw new Exception("Tanto faz por a mensagem ou não");

		return numerador/divisor;			
	}
  
}
