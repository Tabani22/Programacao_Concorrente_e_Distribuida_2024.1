package main;

public class Loja {
	String Nome;
	Conta Conta;
	Funcionario Funcionario1;
	Funcionario Funcionario2;
	boolean vezDe = true;

	public Loja(String nome) {
		Nome = nome;
		Conta = new Conta();
		Funcionario1 = new Funcionario(nome + "F1");
		Funcionario2 = new Funcionario(nome + "F2");
	}

	public void pagarFuncionarios() {
		if (Conta.temDinheiro(1400)) {
			if (vezDe) { 
				Main.banco.transacao(Conta, Funcionario1.Salario, 1400);
				System.out.println(Funcionario1.Nome + " recebeu 1400!");
				Funcionario1.investirSalario(1400);
				vezDe = false; 
			}
			else {
				Main.banco.transacao(Conta, Funcionario2.Salario, 1400);
				System.out.println(Funcionario2.Nome + " recebeu 1400!");
				Funcionario2.investirSalario(1400);
				vezDe = true; 
			}
		}
	}
}
