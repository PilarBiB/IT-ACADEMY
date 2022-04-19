package n1Exercici1;

import java.util.Scanner;

public class Menu {
	public Menu() {
		
	}
	public static byte menu() {
		Scanner sc = new Scanner (System.in);
		byte opcio=0;
		final byte MINIM = 0;
		final byte MAXIM = 3;
	
			
				System.out.println("\nMENU FLORISTERIA ZZZZZ"
						+ "\nIntroduexi una opció:\n\n"
					    + " 0. SORTIR\n"
						+ " 1. Control de Stocks\n"
						+ " 2. Control de Vendes\n"
						+ " 3. Control Econòmic\n"
						);
			try {
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
					System.out.println("Opció no vàlida");
					sc.close();
				}						
			}
			catch(Exception e) {
				System.out.println("ERROR....");
			}
			
			return opcio;	
	
	}
	public static byte menu1() {
		Scanner sc = new Scanner (System.in);
		byte opcio=5;
		final byte MINIM = 0;
		final byte MAXIM = 4;
		
		
			System.out.println("\nMENU CONTROL DE STOCKS"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Sortir menu Control de Stocks\n"
						+ " 1. Llistar Stocks\n"
						+ " 2. Afegir producte\n"
						+ " 3. Modificar producte\n"
						+ " 4. Eliminar producte\n"
						);
			   
				opcio = sc.nextByte();
			
				
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
				
		
		
			return opcio;	
	}
	public static byte menu11() {
		Scanner sc = new Scanner (System.in);
		byte opcio=4;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println("\nMENU LLISTAR STOKS"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Sortir menu Llistar Stoks\n"
						+ " 1. Llistar Stock Arbres\n"
						+ " 2. Llistar Stock Flors\n"
						+ " 3. Llistar Stock Decoracions\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;	
	}
	
	public static byte menu12() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println("\nMENU AFEGIR PRODUCTE"
					    + "\nIntroduexi una opció:\n\n"
						+ " 0. Sortir menu Afegir producte\n"
						+ " 1. Afegir producte tipus Arbre\n"
						+ " 2. Afegir producte tipus Flor\n"
						+ " 3. Afegir producte tipus Decoració\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;	
	}
	
	public static byte menu13() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println("\nMENU MODIFICAR PRODUCTE"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Sortir menu Modificar producte\n"
						+ " 1. Modificar producte tipus Arbre\n"
						+ " 2. Modificar producte tipus Flor\n"
						+ " 3. Modificaar producte tipus Decoració\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
		}while(opcio < MINIM || opcio > MAXIM);
		
			return opcio;
	}
	
	public static byte menu14() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println("\nMENU ELIMINAR PRODUCTE"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Sortir menu Eliminar producte\n"
						+ " 1. Eliminar producte tipus Arbre\n"
						+ " 2. Eliminar producte tipus Flor\n"
						+ " 3. Eliminar producte tipus Decoració\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;
	}
	
	public static byte menu2() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 2;
		
		do {
			System.out.println("\nMENU CONTROL DE VENDES"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Sortir menu Control de Vendes\n"
						+ " 1. Gestió Cistella de productes\n"
						+ " 2. Validar Cistella i generar ticket\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;	
	}
	
	public static byte menu21() {
		Scanner sc = new Scanner (System.in);
		byte opcio=4;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println("\nQUE PRODUCTO QUIERES VENDER"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Sortir menu Llistar Ventas\n"
						+ " 1. Vender Arbres\n"
						+ " 2. Vender Flors\n"
						+ " 3. Vender Decoracions\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;	
	}
	
	public static byte menu3() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println("\nMENU CONTROL ECONOMIC"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Sortir menu Control Econòmic\n"
						+ " 1. Llistar les vendes acumulades\n"
						+ " 2. Mostrar valor total de la floristeria\n"
						+ " 3. Mostrar diners gunyants amb les vendes\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
						
				}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;	
	}
	

}
