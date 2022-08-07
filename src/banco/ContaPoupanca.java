package banco;


public class ContaPoupanca extends Conta{

	
private static int SEQUENCIAL = 1;
	
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		if(this.getSaldo() - valor < 0) {
			this.setSaldo(0);
		}else {
			this.setSaldo(this.getSaldo() - valor);
		}
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		if(valor <= 10000 && valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
		}else {
			System.out.println("Valor invalido!");
		}
	}

	@Override
	public void transferir(double valor, Conta c) {
		// TODO Auto-generated method stub
		c.depositar(valor);
	}

}
