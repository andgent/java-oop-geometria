package org.generation.italy.geometria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci valore altezza: ");
		int altezza2 = scanner.nextInt();
		System.out.println("Inserisci valore base: ");
		int base2 = scanner.nextInt();
		scanner.close();
		
		Rettangolo rettangolo = new Rettangolo(base2, altezza2);
		
		System.out.println("Area: " + rettangolo.area() + ". Perimetro: " + rettangolo.perimetro());

}
}
