package br.edu.figsplanas;

import java.util.Scanner;

public class Circulo {
	public double raio;
	public double area;
	
	public Circulo() {
		
	}
	
	public void recebaRaio() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite o raio do circulo: ");
		raio = receba.nextDouble();
	}
	
	public void recebaRaio(double r) {
		raio = r;
	}
	
	public void retornaRaio() {
		System.out.println("O raio do circulo é:" + raio);
	}
	
	public void retornaArea() {
		System.out.println("A area do circulo é:" + area);
	}
	
	public void calcArea() {
		area  = Math.PI * Math.pow(raio, 2);
	}
	
	public void listarAtributos() {
		System.out.println("O area do circulo é:" + area);
		System.out.println("O raio do circulo é:" + raio);
		System.out.println("____________________________________");
	}
}
