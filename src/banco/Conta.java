package banco;

public abstract class Conta {
	
	protected final static int AGENCIA_PADRAO = 1;
		
	protected String nome;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente c;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void sacar(double valor);
	
	public abstract void depositar(double valor);
	
	public abstract void transferir(double valor, Conta c);
	
}
