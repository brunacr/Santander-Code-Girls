package br.com.dio;

import java.util.Scanner;

/*Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inv�lido e 
 * continue pedindo at� que o usu�rio infomre um valor v�lido.*/

public class Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
		System.out.println("Nota inv�lida! Digite novamente: ");
		nota = scan.nextInt();
		}
		
		System.out.println("Nota v�lida!");
		
		scan.close();
	}

}
