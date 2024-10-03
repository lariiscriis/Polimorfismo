package br.edu.fatecpg.veiculo.model;

public abstract class Veiculo {
	private String marca;
	
	public Veiculo(String mrc) {
		this.setMarca(mrc);
	}
	
public void mover() {
	System.out.println("Esta se movendo");
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
};

}
