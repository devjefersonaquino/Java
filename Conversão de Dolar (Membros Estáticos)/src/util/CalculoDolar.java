package util;

public class CalculoDolar {
	
	public static final double IOF = 0.06;
	
	public static double conversao(double dolar, double comprar) {
		return (comprar * dolar * IOF) + (comprar * dolar);
	}

}
