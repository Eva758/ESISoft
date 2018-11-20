package esisoft;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigestSpi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner sc;
	private static Calendar calendario;

	public static void main(String[] args) throws IOException {
			
	ArrayList<Mesa> mesas = leerMesas("Mesas.txt");
	ArrayList<Camarero> camareros = leerCamareros("Camareros.txt");
	ArrayList<Estado> estados = leerEstados("Estados.txt");
	calendario = new GregorianCalendar();
	
	Scanner sc = new Scanner(System.in);
	int numMenu = 0;
	
	do {
		
		System.out.println("      PANTALLA JEFE DE SALA:");
		System.out.println("1 - Visualizar Estado de las Mesas.");
		System.out.println("2 - Reservar Mesa.");
		System.out.println("3 - Asignar Camarero.");
		System.out.println("4 - Cancelar Reserva.");
		System.out.println("5 - Salir.");
		numMenu = sc.nextInt();
		switch(numMenu) {
		case 1:
			visualizarMesas(mesas);
			break;
		case 2:
			mesas = realizarReserva(mesas);
			break;
		case 3:
			mesas = asignarCamarero(mesas,camareros);
			break;
		case 4:
			mesas = cancelarReserva(mesas);
			break;
		case 5:
			System.out.println("PROGRAMA FINALIZADO.");
			break;
		}
		
		
	}while(numMenu!=5);
		
	}
	
	public static void visualizarMesas(ArrayList<Mesa> mesas) throws IOException {
		for(Mesa mesa:mesas) {
			mesa.toString();
		}
	}
	
	public static ArrayList<Estado> leerEstados(String fichero_estados){
		
		ArrayList<Estado> estados = new ArrayList<Estado>();
		Estado estado;
		try {
			File m = new File(fichero_estados);
			sc = new Scanner(m);
			while(sc.hasNext()) {
				String nombre = sc.next();
				int time = sc.nextInt();
				estado = new Estado(nombre,time);
				estados.add(estado);
			}
			sc.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return estados;
		
	}
	
	
	public static ArrayList<Mesa> asignarCamarero(ArrayList<Mesa> mesas, ArrayList<Camarero> camareros){
		
		sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Indique el número de mesa:");
		int numMesa = sc.nextInt();
		Mesa mesa = mesas.get(numMesa);
		System.out.println("Indique el camarero:");
		for(Camarero camarero:camareros) {
			System.out.println((++num)+"-"+camarero.toString());
		}
		int numCamarero = sc.nextInt();
		System.out.println("Seleccione 1 para Comida, 2 para Cena:");
		int res = sc.nextInt();
		System.out.println("Seleccione Turno (1,2,3):");
		int turno = sc.nextInt();
		switch(res) {
		case 1:
			switch(turno){
			case 1:
				mesa.setTurno1Comida("OCUPADA");
			case 2:
				mesa.setTurno2Comida("OCUPADA");
			case 3:
				mesa.setTurno3Comida("OCUPADA");
			}
			break;
		case 2:
			switch(turno){
			case 1:
				mesa.setTurno1Cena("OCUPADA");
			case 2:
				mesa.setTurno2Cena("OCUPADA");
			case 3:
				mesa.setTurno3Cena("OCUPADA");
			}
		}
		Camarero camarero = camareros.get(numCamarero);
		mesa.setCamarero(camarero.getNombre());
		mesas.set(numMesa, mesa);
		return mesas;
	}
	
	public static ArrayList<Mesa> cancelarReserva(ArrayList<Mesa> mesas) throws IOException {
		
		sc = new Scanner(System.in);
		System.out.println("Indique el número de mesa:");
		int numMesa = sc.nextInt();
		System.out.println("Estado actual de la mesa:");
		Mesa mesa = mesas.get(numMesa);
		System.out.println(mesa.toString());
		System.out.println("Seleccione 1 para Comida, 2 para Cena:");
		int res = sc.nextInt();
		System.out.println("Seleccione Turno (1,2,3):");
		int turno = sc.nextInt();
		switch(res) {
		case 1:
			switch(turno){
			case 1:
				mesa.setTurno1Comida("LIBRE");
			case 2:
				mesa.setTurno2Comida("LIBRE");
			case 3:
				mesa.setTurno3Comida("LIBRE");
			}
			break;
		case 2:
			switch(turno){
			case 1:
				mesa.setTurno1Cena("LIBRE");
			case 2:
				mesa.setTurno2Cena("LIBRE");
			case 3:
				mesa.setTurno3Cena("LIBRE");
			}
		}
		mesas.set(numMesa, mesa);
		
		return mesas;
	}

	public static ArrayList<Mesa> realizarReserva(ArrayList<Mesa> mesas) throws IOException {
		
		sc = new Scanner(System.in);
		System.out.println("Indique el número de mesa:");
		int numMesa = sc.nextInt();
		System.out.println("Estado actual de la mesa:");
		Mesa mesa = mesas.get(numMesa);
		System.out.println(mesa.toString());
		System.out.println("Seleccione 1 para Comida, 2 para Cena:");
		int res = sc.nextInt();
		System.out.println("Seleccione Turno (1,2,3):");
		int turno = sc.nextInt();
		switch(res) {
		case 1:
			switch(turno){
			case 1:
				mesa.setTurno1Comida("RESERVADA");
			case 2:
				mesa.setTurno2Comida("RESERVADA");
			case 3:
				mesa.setTurno3Comida("RESERVADA");
			}
			break;
		case 2:
			switch(turno){
			case 1:
				mesa.setTurno1Cena("RESERVADA");
			case 2:
				mesa.setTurno2Cena("RESERVADA");
			case 3:
				mesa.setTurno3Cena("RESERVADA");
			}
		}
		mesas.set(numMesa, mesa);
		
		return mesas;
	}
	
	
	public static ArrayList<Camarero> leerCamareros(String fichero_camareros){
		ArrayList<Camarero> camareros = new ArrayList<Camarero>();
		Camarero camarero;
		try {
			File m = new File(fichero_camareros);
			sc = new Scanner(m);
			while(sc.hasNext()) {
				String nombre = sc.next();
				camarero = new Camarero(nombre);
				camareros.add(camarero);
				System.out.println(camarero.toString());
			}
			sc.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return camareros;
		
	}
	
	public static ArrayList<Mesa> leerMesas(String fichero_mesas) throws IOException {
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		Mesa mesa;
		try {
			File m = new File(fichero_mesas);
			sc = new Scanner(m);
			while (sc.hasNext()) {
				String titulo = sc.next();
				String numComensales = sc.next();
				String turno1Comida = sc.next();
				String turno2Comida = sc.next();
				String turno3Comida = sc.next();
				String turno1Cena = sc.next();
				String turno2Cena = sc.next();
				String turno3Cena = sc.next();
				
				mesa = new Mesa(titulo,numComensales,turno1Comida,turno2Comida,turno3Comida,turno1Cena,turno2Cena,turno3Cena);
				mesas.add(mesa);
				System.out.println(mesa.toString());
			}
			
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mesas;
	}	
}
