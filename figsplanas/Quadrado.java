package br.edu.figsplanas;

public class Quadrado {

		public double lado;
		public double area;
		
		public void recebeLado(double l) {
			lado = l;
		}
		
		public void retornaLado() {
			System.out.println("A lado do quadrado é: "+ lado);
		}
		
		public void retornaArea() {
			System.out.println("A area do quadrado é: "+ area);
		}
		
		public void calcArea() {
			area = lado*lado;
		}
		
		public void listaAtributos() {
			System.out.println("A lado do quadrado é: "+ lado);
			System.out.println("A lado do quadrado é: "+ area);
			System.out.println("____________________________________");
		}

	}
