package br.edu.figsplanas;

import java.util.Scanner;

public class Hexagono {

	private double lado;
    private double area;

    public Hexagono() {

    }

    public void recebaLado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado: ");
        lado = sc.nextDouble();
    }

    public void recebaLado(double l) {
        lado = l;
    }

    public void calcArea() {
        area = (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    public void retornarLado() {
        System.out.println("O lado do hexágono é: " + lado);
    }

    public void retornarArea() {
        System.out.println("A área do hexágono é: " + area);
    }

    public void listaAtributos() {
        System.out.println("O lado do hexágono é: " + lado);
        System.out.println("A área do hexágono é: " + area);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}
