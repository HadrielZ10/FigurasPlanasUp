package br.edu.figsplanas;

import java.util.Scanner;

public class Paralelogramo {

	public double base;
    public double altura;
    public double area;

    public Paralelogramo() {

    }

    public void recebaBase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        base = sc.nextDouble();
    }

    public void recebaBase(double b) {
        base = b;
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
        area = base * altura;
    }

    public void retornarBase() {
        System.out.println("A base do paralelogramo é: " + base);
    }

    public void retornarAltura() {
        System.out.println("A altura do paralelogramo é: " + altura);
    }

    public void retornarArea() {
        System.out.println("A área do paralelogramo é: " + area);
    }

    public void listaAtributos() {
        System.out.println("A base do paralelogramo é: " + base);
        System.out.println("A altura do paralelogramo é: " + altura);
        System.out.println("A área do paralelogramo é: " + area);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}