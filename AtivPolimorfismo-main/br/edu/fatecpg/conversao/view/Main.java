package br.edu.fatecpg.conversao.view;

import br.edu.fatecpg.conversao.model.Conversor;

public class Main {

	public static void main(String[] args) {
	Conversor conv = new Conversor();
	
	System.out.println(conv.converter(40));
	System.out.println(conv.converter(20, "km"));
	System.out.println(conv.converter("hello world!"));

	}

}
