package br.edu.fatecpg.veiculo.model;

public class Bicicleta extends Veiculo{
	private String cor;
	
	public Bicicleta(String mrc, String cor) {
		super(mrc);
		this.setCor(cor);
	}
	
	@Override
	public void mover() {
	System.out.println("A bicicleta esta pedalando");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}

