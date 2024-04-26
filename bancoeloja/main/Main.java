package main;

public class Main {
	static Banco banco;
	static Loja loja1;
	static Loja loja2;

	public static void main(String[] args) {
		banco = new Banco();
		loja1 = new Loja("L1");
		loja2 = new Loja("L2");

		try {
			Cliente cliente1 = new Cliente("Cliente 1");
			cliente1.start();
			Cliente cliente2 = new Cliente("Cliente 2");
			cliente2.start();
			Cliente cliente3 = new Cliente("Cliente 3");
			cliente3.start();
			Cliente cliente4 = new Cliente("Cliente 4");
			cliente4.start();
			Cliente cliente5 = new Cliente("Cliente 5");
			cliente5.start();
			cliente1.join();
			cliente2.join();
			cliente3.join();
			cliente4.join();
			cliente5.join();
		} catch (Exception e) {}

		System.out.println(loja1.Nome + ": R$" + loja1.Conta.Dinheiro);
		System.out.println(loja2.Nome + ": R$" + loja2.Conta.Dinheiro);
		System.out.println(loja1.Funcionario1.Nome + ": (conta de salario) R$" + loja1.Funcionario1.Salario.Dinheiro);
		System.out.println(loja1.Funcionario1.Nome + ": (conta de investimento) R$" + loja1.Funcionario1.Investimento.Dinheiro);
		System.out.println(loja1.Funcionario2.Nome + ": (conta de salario) R$" + loja1.Funcionario2.Salario.Dinheiro);
		System.out.println(loja1.Funcionario2.Nome + ": (conta de investimento) R$" + loja1.Funcionario2.Investimento.Dinheiro);
		System.out.println(loja2.Funcionario1.Nome + ": (conta de salario) R$" + loja2.Funcionario1.Salario.Dinheiro);
		System.out.println(loja2.Funcionario1.Nome + ": (conta de investimento) R$" + loja2.Funcionario1.Investimento.Dinheiro);
		System.out.println(loja2.Funcionario2.Nome + ": (conta de salario) R$" + loja2.Funcionario2.Salario.Dinheiro);
		System.out.println(loja2.Funcionario2.Nome + ": (conta de investimento) R$" + loja2.Funcionario2.Investimento.Dinheiro);
	}
}
