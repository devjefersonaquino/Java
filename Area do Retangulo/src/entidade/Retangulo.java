package entidade;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double Area() {
		return largura * altura;
	}
	
	public double Perimetro() {
		return 2 * (largura + altura);
	}
	
	public double Diagonal() {
		double diagonal = Math.pow(largura, 2) + Math.pow(altura, 2);
		return Math.sqrt(diagonal);
	}
	
	public String toString() {
		return  "AREA: " + String.format("%.2f\n", Area())
				+ "PERIMETRO: " + String.format("%.2f\n", Perimetro())
				+ "DIAGONAL: " + String.format("%.2f\n", Diagonal());
		}

}
