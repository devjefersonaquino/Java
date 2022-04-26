package entidade;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;	

	public void aprovacao() {
		double soma = 0, menor = 0;
		soma = (this.nota1 + this.nota2 + this.nota3);
		menor = 60 - (this.nota1 + this.nota2 + this.nota3);
		if (soma > 60) {
			System.out.println("FINAL GRADE: = " + soma);
			System.out.println("PASS");
		} else {
			System.out.println("FINAL GRADE: = " + soma);
			System.out.println("FAILED");
			System.out.println("FALTARAM " + menor + " PONTOS");	
		}
	}

}