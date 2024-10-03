package br.edu.fatecpg.conversao.model;

public class Conversor {
	
	public double converter(double c) {
		return (c*1.8)+32;
	}
	
	public double converter(double c, String s) {
		return c * 0.62137;
	}
	
    public String converter(String texto) {
        return texto.toUpperCase();
    }

}
