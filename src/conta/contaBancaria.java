package conta;

public class contaBancaria {
	private String numeroConta;
	private String nomeTitular;
	private Double saldo;
	
	public contaBancaria(String numero, String nome, Double saldo) {
		this.numeroConta = numero;
		this.nomeTitular = nome;
		this.saldo = saldo;
	}
	
	public contaBancaria(String numero, String nome) {
		this.numeroConta = numero;
		this.nomeTitular = nome;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
		this.imprimeDados();
	}

	public void saque(double valor) {
		this.saldo = this.saldo - (valor + 5);
		this.imprimeDados();
	}
	
	public void imprimeDados() {
		System.out.println("Conta número: " + this.numeroConta);
		System.out.println("Titular: " + this.nomeTitular);
		System.out.printf("%s%.2f%n", "Saldo: ", this.saldo);
		
	}
}
