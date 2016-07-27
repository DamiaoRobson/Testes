package jogo;

public class Item {

	private String nome;
	private double peso;
	private int efeito;
	private String tipo; // so pode ser Arma ou Pocao

//	 construtor
	public Item(String nome1, double peso1, int dano1, String tipo1) {
		nome = nome1;
		peso = peso1;
		efeito = dano1;
		tipo = tipo1;
	}

	
	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public String getTipo() {
		return tipo;
	}

	public int getEfeito() {
		return efeito;
	}

}
