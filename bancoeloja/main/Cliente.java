package main;

public class Cliente extends Thread {
	Conta Conta;
	String Nome;
	Loja Loja;
	float Preco;
	
	public Cliente(String nome) 
	{
		Nome = nome;
		Conta = new Conta();
		Conta.Dinheiro = 1000;
		Loja = Main.loja2;
		Preco = 100;
	}
	
	@Override
	public void run() 
	{ 
		while (Conta.temDinheiro(Preco)) 
		{
			if (Conta.Dinheiro == 100) {
				Conta.Dinheiro = 100;
			} 
			else 
			{
				if(Preco == 100)
				{
					Preco = 200;
				}
				else if(Preco == 200)
				{
					Preco = 100;
				}	
			}
			
			if (Loja.equals(Main.loja1))
			{
				Loja = Main.loja2;
			}
			else if (Loja.equals(Main.loja2)) 
			{
				Loja = Main.loja1;
			}
			
			Main.banco.transacao(Conta, Loja.Conta, Preco);
			Loja.pagarFuncionarios();
			System.out.println(Nome + " gastou " + Preco + " na " + Loja.Nome);
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
