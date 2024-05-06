package org.lessons.java.geometria;


public class Rettangolo {
	//attributi della classe (generici)
	public int base;
	public int altezza;
	
	//costruttore
	public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
	
	//creare metodi per calcolare area e perimetro
	public int calcolaArea() {
		return base * altezza;
	}
	
	public int calcolaPerimetro() {
		return (base + altezza) * 2;
	}
	
	public void stampaPerimetro() {
		System.out.println("Questo metodo stampa il perimetro");
		int perimetro = calcolaPerimetro();
		
		for (int i = 0; i < base; i++) {
			System.out.print(0);
		} 
		for (int i = 0; i < altezza - 1; i++) {
			System.out.println(0 + " " + 0);
		}
		for (int i = 0; i < base; i++) {
			System.out.print(0);
		} 
    }
}

