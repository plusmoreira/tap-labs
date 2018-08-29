import java.util.ArrayList;

class Programa {
	public static void main(String[] args) {
		Cliente c = new Cliente("Pedro","564654654");
		c.setConta(new ContaCorrente(2200.5));
		c.setConta(new ContaPoupanca(1110.0));
		c.setConta(new ContaPoupanca(3300.0));
		c.atualizaContas();	
	}
}

class Conta {
	protected double saldo;
	protected double taxaMult;

	public Conta(double saldo){
		this.saldo = saldo;
	}



	public void deposita(double valor){
		this.saldo += valor;
		System.out.println("Valor depositado: R$" + valor);
	}

	public void retira(double valor){
		this.saldo -= valor;	
		System.out.println("Saldo retirado: R$" + valor);
	}	

	public double getSaldo(){
		System.out.println("Saldo atual: R$" + saldo);
		return saldo;	
	}

	public void atualiza(double taxa){
		this.saldo *= (taxa*taxaMult);
		System.out.println("Saldo atualizado com sucesso! \n Novo saldo: R$ " + saldo);
	}
}

class ContaCorrente extends Conta {
	public ContaCorrente(double saldo){
		super(saldo);
		taxaMult = 1.1;
	}
	
}

class ContaPoupanca extends Conta {
	public ContaPoupanca(double saldo){
		super(saldo);
		taxaMult = 1.2;
	}
}

class Cliente{

	private ArrayList<Conta> contas;
	public String nome, cpf;

	public Cliente(String nome, String cpf){
		nome = nome;
		cpf = cpf;
		contas = new ArrayList<Conta>();
	}

	public void setConta(Conta conta){
		if (conta == null){
			System.out.println("Objeto contas ainda não instânciado");
			return;
		}
		contas.add(conta);
		System.out.println("Nova conta adicionada com sucesso!\n Saldo:"+conta.getSaldo());
	}

	public void atualizaContas(){
		for (Conta conta : contas ) {
			conta.atualiza(1.4);
		}
	}

}