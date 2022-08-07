package banco;

public class Cliente {
	private int id;
	private String nome;
	private Conta conta;
	
	public Cliente(String nome, Conta conta) {
		this.nome = nome;
		this.conta = conta;
	}
}
