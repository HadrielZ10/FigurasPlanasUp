package br.edu.figsplanas;

import java.util.Scanner;

public class Losango {
	public double dMaior;
	public double dMenor;
	public double area;
	
	public Losango() {
		
	}
	
	public void recebedMaior() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite a diagonal maior do losango: ");
		dMaior = receba.nextDouble();
	}
	
	public void recebadMaior(double D) {
		dMaior = D;
	}
	
	public void recebedMenor() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite a diagonal menor do losango: ");
		dMenor = receba.nextDouble();
	}
	
	public void recebadMenor(double d) {
		dMenor = d;
	}
	
	public void retornadMaior() {
		System.out.println("A diagonal maior do losango é:" + dMaior);
	}
	
	public void retornadMenor() {
		System.out.println("A diagonal menor do losango é:" + dMenor);
	}
	
	public void retornaArea() {
		System.out.println("A area do losango é:" + area);
	}
	
	public void calcArea() {
		area = (dMaior * dMenor)/2;
	}
	
	public void listarAtributos() {
		System.out.println("A diagonal maior do losango é:" + dMaior);
		System.out.println("A diagonal menor do losango é:" + dMenor);
		System.out.println("A area do losango é:" + area);
		System.out.println("____________________________________");
	}
}
