package br.edu.figsplanas;
import java.util.Scanner;

public class Trapezio {


	    public double baseMaior;
	    public double baseMenor;
	    public double altura;
	    public double area;

	    public Trapezio() {

	    }

	    public void recebaBaseMaior() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor da base maior: ");
	        baseMaior = sc.nextDouble();
	    }

	    public void recebaBaseMaior(double b) {
	        baseMaior = b;
	    }

	    public void recebaBaseMenor() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor da base menor: ");
	        baseMenor = sc.nextDouble();
	    }

	    public void recebaBaseMenor(double b) {
	        baseMenor = b;
	    }

	    public void recebaAltura() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor da altura: ");
	        altura = sc.nextDouble();
	    }

	    public void recebaAltura(double h) {
	        altura = h;
	    }

	    public void calcArea() {
	        area = ((baseMaior + baseMenor) * altura) / 2;
	    }

	    public void retornarBaseMaior() {
	        System.out.println("A base maior do trapézio é: " + baseMaior);
	    }

	    public void retornarBaseMenor() {
	        System.out.println("A base menor do trapézio é: " + baseMenor);
	    }

	    public void retornarAltura() {
	        System.out.println("A altura do trapézio é: " + altura);
	    }

	    public void retornarArea() {
	        System.out.println("A área do trapézio é: " + area);
	    }

	    public void listaAtributos() {
	        System.out.println("A base maior do trapézio é: " + baseMaior);
	        System.out.println("A base menor do trapézio é: " + baseMenor);
	        System.out.println("A altura do trapézio é: " + altura);
	        System.out.println("A área do trapézio é: " + area);
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    }
	}

