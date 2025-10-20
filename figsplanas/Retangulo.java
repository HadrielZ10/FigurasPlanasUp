package br.edu.figsplanas;

import java.util.Scanner;

public class Retangulo {
	
	public double lMenor;
	public double lMaior;
	public double area;
	
	public Retangulo() {
		
	}
	
	public void recebeLadoMaior() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite a altura do retangulo: ");
		lMaior = receba.nextDouble();
	}
	
	public void recebeLadoMaior(double L) {
		lMaior = L;
	}
	
	public void recebeLadoMenor() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite a base do retangulo: ");
		lMenor = receba.nextDouble();
	}
	
	public void recebeLadoMenor(double l) {
		lMenor = l;
	}
	
	public void retornaLadoMenor() {
		System.out.println("A lado menor do retangulo é:" + lMenor);
	}
	
	public void retornaLadoMaior() {
		System.out.println("A lado maior do retangulo é:" + lMaior);
	}
	
	public void retornaArea() {
		System.out.println("A area do retangulo é:" + area);
	}
	
	public void calcArea() {
		area = lMaior * lMenor;
	}
	
	public void listaAtributos() {
		System.out.println("O lado menor do retangulo é:" + lMenor);
		System.out.println("O lado maior do retangulo é:" + lMaior);
		System.out.println("A area do quadrado é:" + area);
		System.out.println("____________________________________");
	}

}
