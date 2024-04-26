package main;

public class Funcionario extends Thread {
	String Nome;
	Conta Investimento;
	Conta Salario;

	public Funcionario(String nome) 
	{		
		Nome = nome;
		Salario = new Conta();
		Investimento = new Conta();
	}

	
	void investirSalario(float salario) 
	{
		float valor = (20 * salario) / 100;
		Main.banco.transacao(Salario, Investimento, valor);
		
		System.out.println(Nome + " investiu " + valor);
	}
}
