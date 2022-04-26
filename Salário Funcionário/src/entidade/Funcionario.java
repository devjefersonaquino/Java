package entidade;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double impostos;
	
	public double salarioLiquido() {
		return  salario - impostos;
	}
	
	public void aumentoSalario(double porcentagem) {
		salario = (salario / porcentagem) + salarioLiquido();
	}
	
	public String toString() {
		return nome
			   + " R$ "
			   + String.format("%.2f", salario);
	}

}
