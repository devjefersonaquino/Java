package entidade;

public class ContaCorrente {

	private int nConta;
	private String nome;
	private double saldo;
	
	public ContaCorrente(int nConta, String nome) {
		this.nConta = nConta;
		this.nome = nome;
	}

	public ContaCorrente(int nConta, String nome, double inicialDeposito) {
		this.nConta = nConta;
		this.nome = nome;
		deposito(inicialDeposito);
	}

	public int getnConta() {
		return nConta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo -= valor + 5;
	}
	
	public String toString() {
		return " CC: " + getnConta()
						+ " \n Titular: "
						+ getNome()
						+ " \n Saldo:"
						+ getSaldo();
	}
		
}
