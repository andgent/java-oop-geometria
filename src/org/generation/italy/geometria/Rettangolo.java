package org.generation.italy.geometria;

public class Rettangolo {
	int base;
	int altezza;

	Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	int perimetro() {
		int perimetro = (base*2) + (altezza*2);
		return perimetro;
	}
	
	int area() {
		int area = (base * altezza);
		return area;
	}
	
	void printBaseAltezza() {
		System.out.println("Base =: " + base + ". Altezza: " + altezza);
	}
		
	void printPerimetro() {
		
	}

	}