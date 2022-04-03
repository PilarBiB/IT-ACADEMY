package s303N1;
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
/*
		Arbre arbre1 = new Arbre("A1", "Pi", 2.00, 52.00, 40);
		Flor flor1 = new Flor("F1", "Rosa", "Vermell", 4.00, 100 );
		Decoracio decoracio1 = new Decoracio("D3", "Jerro", "Plàstic",15.00, 30);
		
		ArrayList<Producte> productes = new ArrayList<Producte>();
		
		productes.add(arbre1);
		productes.add(flor1);
		productes.add(decoracio1);
		*/
		boolean sortir = false;
	
		A:do {	
			switch (menu()) {
			case 0:
				System.out.println("Has sortit de l'aplicació");
				sortir = true;
				break ;
			case 1:
				B:do {	
					switch (menu1()) {
					case 0:
					
						break B;
					case 1:
						C:do {	
							switch (menu11()) {
							case 0:	
								break C;
							case 1:
								
								break;
							case 2:
								
								break;
							case 3:
								
								break;
							}			
						} while (!sortir);
						
						break ;						
						
					case 2:
						D:do {	
							switch (menu12()) {
							case 0:
								break D;
							case 1:
								
								break;
							case 2:
								
								break;
							case 3:
								
								break;
							}			
						} while (!sortir);
						break ;				
					
					case 3:
						E:do {	
							switch (menu13()) {
							case 0:
								break E;
							case 1:
								
								break;
							case 2:
								
								break;
							case 3:
								
								break;
							}			
						} while (!sortir);
						break;			
						
					case 4:
						F:do {	
							switch (menu14()) {
							case 0:
								break F;
							case 1:
								
								break;
							case 2:
								
								break;
							case 3:
								
								break;
							}			
						} while (!sortir);
						break;			
					}			
				} while (!sortir);
				break;
			
			case 2:
				G:do {	
					switch (menu2()) {
					case 0:
						break G;
					case 1:
						break;
					case 2:
						break;
					}			
				} while (!sortir);
				break;						
				
			case 3:
				H:do {	
					switch (menu3()) {
					case 0:
						break H;
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					}			
				} while (!sortir);
				break;						
			}			
		} while (!sortir);
	}
	public static byte menu() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println("\nMENU FLORISTERIA ZZZZZ"
						+ "\nIntroduexi una opció:\n\n"
					    + " 0. SORTIR\n"
						+ " 1. Control de Stocks\n"
						+ " 2. Control de Vendes\n"
						+ " 3. Control Econòmic\n"
						);
				
			opcio = sc.nextByte();
			if(opcio < MINIM || opcio > MAXIM) {
				System.out.println("Opció no vàlida");
			}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;	
	}
	public static byte menu1() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 4;
		
		do {
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));
			System.out.println("\nMENU CONTROL DE STOCKS"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Tornar al menu anterior\n"
						+ " 1. Llistar Stocks\n"
						+ " 2. Afegir producte\n"
						+ " 3. Modificar producte\n"
						+ " 4. Eliminar producte\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;	
	}
	public static byte menu11() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));
			System.out.println("\nMENU LLISTAR STOCKS"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Tornar al menu anterior\n"
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
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));
			System.out.println("\nMENU AFEGIR PRODUCTE"
					    + "\nIntroduexi una opció:\n\n"
						+ " 0. Tornar al menu anterior\n"
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
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));
			System.out.println("\nMENU MODIFICAR PRODUCTE"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Tornar al menu anterior\n"
						+ " 1. Modificar producte tipus Arbre\n"
						+ " 2. Modificar producte tipus Flor\n"
						+ " 3. Modificar producte tipus Decoració\n"
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
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));
			System.out.println("\nMENU ELIMINAR PRODUCTE"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Tornar al menu anterior\n"
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
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));
			System.out.println("\nMENU CONTROL DE VENDES"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Tornar al menu anterior\n"
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
	public static byte menu3() {
		Scanner sc = new Scanner (System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 3;
		
		do {
			System.out.println(new String(new char[20]).replace("\0", "\r\n"));
			System.out.println("\nMENU CONTROL ECONOMIC"
						+ "\nIntroduexi una opció:\n\n"
						+ " 0. Tornar al menu anterior\n"
						+ " 1. Llistar les vendes acumulades\n"
						+ " 2. Mostrar valor total de la floristeria\n"
						+ " 3. Mostrar diners guanyants amb les vendes\n"
						);
				
				opcio = sc.nextByte();
				if(opcio < MINIM || opcio > MAXIM) {
						System.out.println("Opció no vàlida");
				}
		}while(opcio < MINIM || opcio > MAXIM);
			return opcio;	
	}
	
}