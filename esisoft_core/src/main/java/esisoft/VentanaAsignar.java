import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Choice;

public class VentanaAsignar extends JFrame {

	private JPanel contentPane;

	public void cambiarTurno(int indice,int numMesa) {
		switch(indice) {
		case 0:
			
			VentanaJefeSala.mesas.get(numMesa).setTurno1Comida("OCUPADO");
			break;
		case 1:
			VentanaJefeSala.mesas.get(numMesa).setTurno1Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno2Comida("OCUPADO");
			break;
		case 2:
			VentanaJefeSala.mesas.get(numMesa).setTurno1Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno2Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno3Comida("OCUPADO");
			break;
		case 3:
			VentanaJefeSala.mesas.get(numMesa).setTurno1Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno2Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno3Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno1Cena("OCUPADO");
			break;
		case 4:
			VentanaJefeSala.mesas.get(numMesa).setTurno1Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno2Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno3Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno1Cena("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno2Cena("OCUPADO");
			break;
		case 5:
			VentanaJefeSala.mesas.get(numMesa).setTurno1Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno2Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno3Comida("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno1Cena("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno2Cena("FINALIZADO");
			VentanaJefeSala.mesas.get(numMesa).setTurno3Cena("OCUPADO");
			break;
		}
	}
	
	public void Reservar(int indice,int numMesa,String Opcion) {
		switch(indice) {
		case 0: 
			if(Opcion.equals("RESERVAR")){
				if(VentanaJefeSala.mesas.get(numMesa).getTurno1Comida().equals("LIBRE")) {
					VentanaJefeSala.mesas.get(numMesa).setTurno1Comida("RESERVADO");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no está disponible.");
				}
				
			} else if(Opcion.equals("CANCELAR")) {
				if(VentanaJefeSala.mesas.get(numMesa).getTurno1Comida().equals("RESERVADO")){
					VentanaJefeSala.mesas.get(numMesa).setTurno1Comida("LIBRE");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no es válido.");
				}
			}
			
			break;
		case 1:
			if(Opcion.equals("RESERVAR")){
				if(VentanaJefeSala.mesas.get(numMesa).getTurno2Comida().equals("LIBRE")) {
					VentanaJefeSala.mesas.get(numMesa).setTurno2Comida("RESERVADO");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no está disponible.");
				}
				
			} else if(Opcion.equals("CANCELAR")) {
				if(VentanaJefeSala.mesas.get(numMesa).getTurno2Comida().equals("RESERVADO")){
					VentanaJefeSala.mesas.get(numMesa).setTurno2Comida("LIBRE");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no es válido.");
				}
			}
			
			break;
		case 2:
			if(Opcion.equals("RESERVAR")){
				if(VentanaJefeSala.mesas.get(numMesa).getTurno3Comida().equals("LIBRE")) {
					VentanaJefeSala.mesas.get(numMesa).setTurno3Comida("RESERVADO");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no está disponible.");
				}
				
			} else if(Opcion.equals("CANCELAR")) {
				if(VentanaJefeSala.mesas.get(numMesa).getTurno3Comida().equals("RESERVADO")){
					VentanaJefeSala.mesas.get(numMesa).setTurno3Comida("LIBRE");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no es válido.");
				}
			}
			
			break;
		case 3:
			if(Opcion.equals("RESERVAR")){
				if(VentanaJefeSala.mesas.get(numMesa).getTurno1Cena().equals("LIBRE")) {
					VentanaJefeSala.mesas.get(numMesa).setTurno1Cena("RESERVADO");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no está disponible.");
				}
				
			} else if(Opcion.equals("CANCELAR")) {
				if(VentanaJefeSala.mesas.get(numMesa).getTurno1Cena().equals("RESERVADO")){
					VentanaJefeSala.mesas.get(numMesa).setTurno1Cena("LIBRE");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no es válido.");
				}
			}
			
			break;
		case 4:
			if(Opcion.equals("RESERVAR")){
				if(VentanaJefeSala.mesas.get(numMesa).getTurno2Cena().equals("LIBRE")) {
					VentanaJefeSala.mesas.get(numMesa).setTurno2Cena("RESERVADO");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no está disponible.");
				}
				
			} else if(Opcion.equals("CANCELAR")) {
				if(VentanaJefeSala.mesas.get(numMesa).getTurno2Cena().equals("RESERVADO")){
					VentanaJefeSala.mesas.get(numMesa).setTurno2Cena("LIBRE");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no es válido.");
				}
			}
			
			break;	
		case 5:
			if(Opcion.equals("RESERVAR")){
				if(VentanaJefeSala.mesas.get(numMesa).getTurno3Cena().equals("LIBRE")) {
					VentanaJefeSala.mesas.get(numMesa).setTurno3Cena("RESERVADO");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no está disponible.");
				}
				
			} else if(Opcion.equals("CANCELAR")) {
				if(VentanaJefeSala.mesas.get(numMesa).getTurno3Cena().equals("RESERVADO")){
					VentanaJefeSala.mesas.get(numMesa).setTurno3Cena("LIBRE");
				} else {
					JOptionPane.showMessageDialog(null, "Este turno no es válido.");
				}
			}
			
			break;
		}
	}
	
	public VentanaAsignar() {
		
	}
	
	public VentanaAsignar(int numMesa, String Opcion) {
		setTitle("Selecci\u00F3n de Turno");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 134);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Choice choice = new Choice();
		choice.setBounds(10, 10, 414, 20);
		contentPane.add(choice);
		choice.add("Turno 1 Comida");
		choice.add("Turno 2 Comida");
		choice.add("Turno 3 Comida");
		choice.add("Turno 1 Cena");
		choice.add("Turno 2 Cena");
		choice.add("Turno 3 Cena");
		
		Button btnAcptSC = new Button("Aceptar");
		btnAcptSC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//CAMBIAR ESTADOS Y CONTAR LOS CAMBIOS DE ESTADOS ETC...
				
				if(Opcion.equals("RESERVAR")) {
					int num = choice.getSelectedIndex();
					Reservar(num, numMesa-1,Opcion);
				} else if (Opcion.equals("CANCELAR")) {
					int num = choice.getSelectedIndex();
					Reservar(num, numMesa-1,Opcion);
				}
				dispose();
			}
		});
		
		btnAcptSC.setBounds(354, 64, 70, 22);
		contentPane.add(btnAcptSC);
		Button btnCancSC = new Button("Cancelar");
		btnCancSC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}	
		});
		btnCancSC.setBounds(278, 64, 70, 22);
		contentPane.add(btnCancSC);
	}
	
	
	public VentanaAsignar(int numMesa) {

		setTitle("Selecci\u00F3n de Turno");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 134);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Choice choice = new Choice();
		choice.setBounds(10, 10, 414, 20);
		contentPane.add(choice);
		choice.add("Turno 1 Comida");
		choice.add("Turno 2 Comida");
		choice.add("Turno 3 Comida");
		choice.add("Turno 1 Cena");
		choice.add("Turno 2 Cena");
		choice.add("Turno 3 Cena");
		
		
		Button btnAcptSC = new Button("Aceptar");
		btnAcptSC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//CAMBIAR ESTADOS Y CONTAR LOS CAMBIOS DE ESTADOS ETC...
				int num = choice.getSelectedIndex();
				System.out.println(num);
				cambiarTurno(num, numMesa-1);
				VentanaCamarero vc = new VentanaCamarero(numMesa);
				vc.show();
				disable();
			}
			
		});
		btnAcptSC.setBounds(354, 64, 70, 22);
		contentPane.add(btnAcptSC);
		
		Button btnCancSC = new Button("Cancelar");
		btnCancSC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
			
			
		});
		btnCancSC.setBounds(278, 64, 70, 22);
		contentPane.add(btnCancSC);
	}
}

