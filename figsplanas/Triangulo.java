package br.edu.figsplanas;

import java.util.Scanner;

public class Triangulo {
	
	public double base;
	public double altura;
	public double area;
	
	public Triangulo() {
		
	}
	
	public void recebeAltura() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite a altura do triangulo: ");
		altura = receba.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite a base do triangulo: ");
		base = receba.nextDouble();
	}
	
	public void recebaBase(double b) {
		base = b;
	}
	
	public void retornaBase() {
		System.out.println("A base do triangulo é:" + base);
	}
	
	public void retornaAltura() {
		System.out.println("A altura do triangulo é:" + altura);
	}
	
	public void retornaArea() {
		System.out.println("A area do triangulo é:" + area);
	}
	
	public void calcArea() {
		area = (base*altura)/2;
	}
	
	public void listaAtributos() {
		System.out.println("A base do triangulo é:" + base);
		System.out.println("A altura do triangulo é:" + altura);
		System.out.println("A area do triangulo é:" + area);
		System.out.println("____________________________________");
	}

}
