package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double valorPago(double cotacao, double quantidade) {
		
		double valor = quantidade * cotacao;
		
		return valor += valor * IOF;
		
	}
	
}
