package br.edu.fatecpg.veiculo.model;

public class Carro extends Veiculo{
	private String modelo;
	public Carro(String mrc, String mdl) {
		super(mrc);
		this.setModelo(mdl);
	}
	
	@Override
	public void mover() {
	System.out.println("O carro esta dirigindo");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
