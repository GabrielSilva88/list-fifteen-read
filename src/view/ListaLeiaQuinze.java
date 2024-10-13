package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaLeiaQuinze {
	/*
	 * 8) Escreva um programa que leia 15 números e guarde-os em uma lista. No
	 * final, mostre toda a lista na tela e em seguida mostre em que posições foram
	 * digitados valores que são múltiplos de 10.
	 */

	public static void main(String[] args) {
		List<Integer> listaNu = new ArrayList<Integer>(15);
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 15; i++) {

			System.out.println("Digite o Número: ");
			int n = scan.nextInt();
			listaNu.add(n);

		}
		System.out.println("Lista: " + listaNu);

		System.out.println("\nPosições dos multiplos, na lista");
		for (int i = 0; i < listaNu.size(); i++) {
			if (listaNu.get(i) % 10 != 0) {
				System.out.println("Posição" + i);
			}
		}

	}
}
