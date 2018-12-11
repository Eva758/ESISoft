package esisoft;
import java.awt.EventQueue;
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
public class App {
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//mesas = leerMesas("C:\\Users\\Propietario\\Desktop\\www\\esisoft\\src\\esisoft\\Mesas.txt");
					//visualizarMesas(mesas);
					//VentanaJefeSala frame = new VentanaJefeSala(mesas);
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
			
}
 