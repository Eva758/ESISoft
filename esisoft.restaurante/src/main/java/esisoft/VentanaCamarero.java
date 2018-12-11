package esisoft;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Choice;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class VentanaCamarero extends JFrame {

	private JPanel contentPane;

	
	public static ArrayList<Camarero> leerCamareros(String fichero_camareros){
		Scanner sc;
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
	
	public void visualizarCamareros(ArrayList<Camarero> camareros) {
		for(Camarero camarero:camareros){
			camarero.toString();
		}
	}
	
	public VentanaCamarero(final int numMesa) {
		ArrayList<Camarero> camareros = leerCamareros("C:\\Users\\Propietario\\Desktop\\www\\esisoft\\src\\esisoft\\Camareros.txt");
		visualizarCamareros(camareros);	
		setTitle("Selecci\u00F3n de Camarero");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 134);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final Choice choice = new Choice();
		choice.setBounds(10, 10, 414, 20);
		contentPane.add(choice);
		for(Camarero camarero:camareros) {
			choice.add(camarero.toString());
		}
		
		Button btnAcptSC = new Button("Aceptar");
		btnAcptSC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//CAMBIAR ESTADOS Y CONTAR LOS CAMBIOS DE ESTADOS ETC...
				VentanaJefeSala.mesas.get(numMesa-1).setCamarero(choice.getSelectedItem().toString());
				dispose();
			}
			
		});
		btnAcptSC.setBounds(354, 64, 70, 22);
		contentPane.add(btnAcptSC);
		
		Button btnCancSC = new Button("Cancelar");
		btnCancSC.setBounds(278, 64, 70, 22);
		contentPane.add(btnCancSC);
	}
}
