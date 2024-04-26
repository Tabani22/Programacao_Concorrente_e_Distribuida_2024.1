package main;

public class Conta {
	float Dinheiro;
	
	public Conta () {
		Dinheiro = 0f;
	}

	public boolean temDinheiro(float dinheiro) {
		boolean tem = Dinheiro >= dinheiro;
		return tem;
	}
}
