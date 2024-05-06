package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//chiedere all'utente base e altezza
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il valore della base come numero intero.");
		int base = input.nextInt();
		
		System.out.println("Inserisci il valore dell'altezza come numero intero.");
		int altezza = input.nextInt();
		
		//System.out.println(base + " " + altezza);
		
		//creare variabile di tipo della classe dichiarata (rettangolo)
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		int area = rettangolo.calcolaArea();
		int perimetro = rettangolo.calcolaPerimetro();
		System.out.println("L'area del rettangolo è " + area + " e il perimetro è " + perimetro);
		
		//inventati un modo di printare il perimetro (for?)
		rettangolo.stampaPerimetro();
	}

}
