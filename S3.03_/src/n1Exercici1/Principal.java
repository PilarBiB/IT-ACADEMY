package n1Exercici1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		
		Arbre a1 = new Arbre("A1", "Pino", 1, 5, 100);
		Arbre a2 = new Arbre("A2", "Abet", 3, 15, 20);
		Arbre a3 = new Arbre("A3", "Abedul", 0.25, 2, 250);
		
		ArrayList<Arbre> listaArboles = new ArrayList<Arbre>();
		listaArboles.add(a1);
		listaArboles.add(a2);
		listaArboles.add(a3);
		
		Flor f1 = new Flor("F1", "Margarida", "Blanc", 10.75, 100);
		Flor f2 = new Flor("F2", "Rosa", "Roja", 7.75, 120);
		Flor f3 = new Flor("F3", "Tulipen", "Blau", 5.75, 1000);
		
		ArrayList<Flor> listaFlor = new ArrayList<Flor>();
		listaFlor.add(f1);
		listaFlor.add(f2);
		listaFlor.add(f3);
		
		Decoracio d1 = new Decoracio("D1", "Decoracio_1,", "Fusta", 55.50, 150);
		Decoracio d2 = new Decoracio("D2", "Decoracio_2,", "Plastic", 155.50, 125);
		Decoracio d3 = new Decoracio("D3", "Decoracio_3,", "Plastic", 5.50, 25);
		
		ArrayList<Decoracio> listaDecoracio = new ArrayList<Decoracio>();
		listaDecoracio.add(d1);
		listaDecoracio.add(d2);
		listaDecoracio.add(d3);
		
		EntradaTicket e = new EntradaTicket("A1","Pino",5,10);
		EntradaTicket e1 = new EntradaTicket("A2","Abet",15,1);
		EntradaTicket e2 = new EntradaTicket("A2","Abet",5,2);
		EntradaTicket e3 = new EntradaTicket("A3","Abedul",2,7);
		EntradaTicket e4 = new EntradaTicket("A1","Pino",5,3);
		ArrayList<EntradaTicket> Ticket = new ArrayList<EntradaTicket>();
		Ticket.add(e);
		Ticket.add(e1);
		ArrayList<EntradaTicket> Ticket1 = new ArrayList<EntradaTicket>();
		Ticket1.add(e2);
		Ticket1.add(e3);
		Ticket1.add(e4);
		ArrayList<ArrayList<EntradaTicket>> historialTicket = new ArrayList<ArrayList<EntradaTicket>>();
		historialTicket.add(Ticket);
		historialTicket.add(Ticket1);
					
		Ticket = new ArrayList<EntradaTicket>();
		
		
		/*-------------MENU-------------*/
		
		Scanner neme = new Scanner(System.in);
		boolean sortir = false;
		Arbre a = new Arbre();
		Flor f = new Flor();
		Decoracio d = new Decoracio();
		Producte p = new Producte();
		Menu m = new Menu();
		
		a.EscribirFicheroArbol(listaArboles);
		f.EscribirFicheroFlor(listaFlor);
		d.EscribirFicheroDecoracio(listaDecoracio);
		e.EscribirFicheroTicket(historialTicket);
		listaArboles=a.LecturaFicheroArboles();
		listaFlor= f.LecturaFicheroFlor();
		listaDecoracio= d.LecturaFicheroDecoracio();
		historialTicket= e.LecturaFicheroTicket();
		
		
		A:do {	
			switch (m.menu()) {
			case 0:
				System.out.println("Has sortit de l'aplicació");
				sortir = true;
				break ;
			case 1:
				B:do {	
					switch (m.menu1()) {
					case 0:					
						break B;
					case 1:
						C:do {	
							switch (m.menu11()) {
							case 0:	
								break C;
							case 1:
								a.llistarArbres(listaArboles);
								break;
							case 2:
								f.llistarFlors(listaFlor);
								break;
							case 3:
								d.llistarDecoracio(listaDecoracio);
								break;
							}
							neme.nextLine();
						} while (!sortir);
						
						break ;						
						
					case 2:
						D:do {	
							switch (m.menu12()) {
							case 0:
								break D;
							case 1:
								a.afegirArbre(listaArboles);
								break;
							case 2:
								f.afegirFlor(listaFlor);
								break;
							case 3:
								d.afegirDecoracio(listaDecoracio);
								break;
							}
							neme.nextLine();							
						} while (!sortir);
						break ;				
					
					case 3:
						E:do {	
							switch (m.menu13()) {
							case 0:
								break E;
							case 1:
								a.modificarArbre(listaArboles);
								break;
							case 2:
								f.modificarFlor(listaFlor);
								break;
							case 3:
								d.modificarDecoracio(listaDecoracio);
								break;
							}	
							neme.nextLine();
						} while (!sortir);
						break;			
						
					case 4:
						F:do {	
							switch (m.menu14()) {
							case 0:
								break F;
							case 1:
								a.eliminarArbre(listaArboles);
								break;
							case 2:
								f.eliminarFlor(listaFlor);
								break;
							case 3:
								d.eliminarDecoracio(listaDecoracio);
								break;
							}
							neme.nextLine();
						} while (!sortir);
						break;			
					}			
				} while (!sortir);
				break;
			
			case 2:
				G:do {	
					switch (m.menu2()) {
					case 0:
						break G;
					case 1:
						G1:do {
								switch(m.menu21()) {
									case 0:
										break G1;
									case 1:
										e=a.vendreArbre(listaArboles);
										if(!Objects.isNull(e.getId())) {
											Ticket.add(e);
											e=new EntradaTicket();
										}
										break;	
									case 2:
										//vender flor
										e=f.vendreFlor(listaFlor);
										if(!Objects.isNull(e.getId())) {
											Ticket.add(e);
											e=new EntradaTicket();
										}
										break;
										
									case 3:
										//vender decoracion
										e=d.vendreDecoracio(listaDecoracio);
										if(!Objects.isNull(e.getId())) {
											Ticket.add(e);
											e=new EntradaTicket();
										}
										break;										
								}
							}while (!sortir);
							break;
						
					case 2:
						System.out.println("TICKET DE VENTA");
						double total_ticket = 0;
						for(int i=0; i<Ticket.size();i++) {
							System.out.println(Ticket.get(i).toString());
							total_ticket = total_ticket + (Ticket.get(i).getPreu()*Ticket.get(i).getQuantitat());
						}	
						System.out.println("T.O.T.A.L:    "+ total_ticket+ " €");
						neme.nextLine();
						historialTicket.add(Ticket);
						Ticket = new ArrayList<EntradaTicket>();
						break;
					}			
				} while (!sortir);
				break;						
				
			case 3:
				H:do {	
					switch (m.menu3()) {
					case 0:
						break H;
					case 1:
						//Mostrar todas las ventas acumuladas
						for(int i=0; i<historialTicket.size(); i++) {
							for(int j=0; j<historialTicket.get(i).size();j++) {
								System.out.println(historialTicket.get(i).get(j).toString());
							}							
						}
						neme.nextLine();
						break;
					case 2:
						//Valor total de la floristeria.
						System.out.println("VALOR DE LA FLORISTERIA");
						System.out.println(p.valorFloristeria(listaArboles,listaFlor,listaDecoracio) + " €");
						neme.nextLine();
						break;						
					case 3:
						//Mostrar diners gunyants amb les vendes
						System.out.println("BENEFICIOS OBTENIDOS POR LAS VENTAS: " + p.beneficios(historialTicket)+ " €");
						neme.nextLine();
						break;
					}			
				} while (!sortir);
				break;						
			}			
		} while (!sortir);
		
		a.EscribirFicheroArbol(listaArboles);
		f.EscribirFicheroFlor(listaFlor);
		d.EscribirFicheroDecoracio(listaDecoracio);
		e.EscribirFicheroTicket(historialTicket);
		/*Descomentar si queremos comprobar que hemos escrito correctamente en los ficheros.
		//Comprobamos lo guardado en los ficheros es correcto.
		historialTicket= e.LecturaFicheroTicket();
		for(int i=0; i<historialTicket.size(); i++) {
			System.out.println(historialTicket.get(i).toString());
		}
		
		listaArboles=a.LecturaFicheroArboles();
		for(int i=0; i<listaArboles.size(); i++) {
			System.out.println(listaArboles.get(i).toString());
		}
		listaFlor=f.LecturaFicheroFlor();
		for(int i=0; i<listaFlor.size(); i++) {
			System.out.println(listaFlor.get(i).toString());
		}
		listaDecoracio=d.LecturaFicheroDecoracio();
		for(int i=0; i<listaDecoracio.size(); i++) {
			System.out.println(listaDecoracio.get(i).toString());
		}	
		*/	
	}
}
	