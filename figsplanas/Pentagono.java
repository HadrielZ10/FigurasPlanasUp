package br.edu.figsplanas;

import java.util.Scanner;

public class Pentagono {
	public double dMaior;
	public double dMenor;
	public double area;
	
	public Pentagono() {
		
	}
	
	public void recebeLado() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite o lado do pentagono: ");
		dMaior = receba.nextDouble();
	}
	
	public void recebadLado(double D) {
		dMaior = D;
	}
	
	public void recebedApotema() {
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite a apótema do pentagono: ");
		dMenor = receba.nextDouble();
	}
	
	public void recebadApotema(double d) {
		dMenor = d;
	}
	
	public void retornadMaior() {
		System.out.println("O lado do pentagono é:" + dMaior);
	}
	
	public void retornadMenor() {
		System.out.println("A apótema losango é:" + dMenor);
	}
	
	public void retornaArea() {
		System.out.println("A area do pentagono é:" + area);
	}
	
	public void calcArea() {
		area = (5 * dMaior * dMenor)/2;
	}
	
	public void listarAtributos() {
		System.out.println("O lado do pentagono é::" + dMaior);
		System.out.println("A apótema do pentagono é:" + dMenor);
		System.out.println("A area do pentagono é:" + area);
		System.out.println("____________________________________");
	}
}