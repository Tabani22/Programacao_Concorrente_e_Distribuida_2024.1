package main;

public class Banco {
	
	void transacao(Conta origen, Conta destino, float dinheiro) {
		destino.Dinheiro = destino.Dinheiro + dinheiro;
		origen.Dinheiro = origen.Dinheiro - dinheiro;
	}
}
