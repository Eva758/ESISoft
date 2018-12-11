package esisoft;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class VentanaJefeSala extends JFrame {

	private JPanel contentPane;
	public static ArrayList<Mesa> mesas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mesas = leerMesas("C:\\Users\\Propietario\\Desktop\\www\\esisoft\\src\\esisoft\\Mesas.txt");
					visualizarMesas(mesas);
					VentanaJefeSala frame = new VentanaJefeSala(mesas);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public static ArrayList<Mesa> leerMesas(String fichero_mesas) throws IOException {
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		Mesa mesa;
		try {
			Scanner sc;
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
	
	public static void visualizarMesas(ArrayList<Mesa> mesas) throws IOException {
		for(Mesa mesa:mesas) {
			mesa.toString();
		}
	}
	
	public VentanaJefeSala(final ArrayList<Mesa> mesas) {
		setResizable(false);
		setTitle("Reserva de Mesas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 563);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(417, 106, 401, 276);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTurnoComida = new JLabel("TURNO COMIDA:");
		lblTurnoComida.setBounds(159, 5, 186, 14);
		panel.add(lblTurnoComida);
		
		JLabel lblTurno = new JLabel("TURNO 1:");
		lblTurno.setBounds(36, 49, 83, 14);
		panel.add(lblTurno);
		
		JLabel lblTurno_1 = new JLabel("TURNO 2:");
		lblTurno_1.setBounds(36, 74, 83, 14);
		panel.add(lblTurno_1);
		
		JLabel lblTurno_2 = new JLabel("TURNO 3:");
		lblTurno_2.setBounds(36, 99, 83, 14);
		panel.add(lblTurno_2);
		
		JLabel lblTurnoCena = new JLabel("TURNO CENA:");
		lblTurnoCena.setBounds(166, 130, 93, 14);
		panel.add(lblTurnoCena);
		
		JLabel label = new JLabel("TURNO 3:");
		label.setBounds(36, 217, 83, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("TURNO 2:");
		label_1.setBounds(36, 192, 83, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("TURNO 1:");
		label_2.setBounds(36, 167, 83, 14);
		panel.add(label_2);
		
		final JLabel lblturno1com = new JLabel("");
		lblturno1com.setBounds(99, 49, 160, 14);
		panel.add(lblturno1com);
		
		final JLabel lblturno2com = new JLabel("");
		lblturno2com.setBounds(99, 74, 160, 14);
		panel.add(lblturno2com);
		
		final JLabel lblturno3com = new JLabel("");
		lblturno3com.setBounds(99, 99, 160, 14);
		panel.add(lblturno3com);
		
		final JLabel lblturno1cen = new JLabel("");
		lblturno1cen.setBounds(99, 167, 160, 14);
		panel.add(lblturno1cen);
		
		final JLabel lblturno2cen = new JLabel("");
		lblturno2cen.setBounds(99, 192, 160, 14);
		panel.add(lblturno2cen);
		
		final JLabel lblturno3cen = new JLabel("");
		lblturno3cen.setBounds(99, 217, 160, 14);
		panel.add(lblturno3cen);
		
		final JLabel lblCamarero = new JLabel("CAMARERO:");
		lblCamarero.setBounds(124, 251, 69, 14);
		panel.add(lblCamarero);
		
		final JLabel lblNombreCamarero = new JLabel("");
		lblNombreCamarero.setBounds(196, 251, 195, 14);
		panel.add(lblNombreCamarero);
		
		final JLabel lblTituloMesa = new JLabel("");
		lblTituloMesa.setForeground(new Color(0, 0, 0));
		lblTituloMesa.setBounds(10, 5, 139, 14);
		panel.add(lblTituloMesa);
		
		JButton btnMesa1 = new JButton("Mesa 1 (2)");
		btnMesa1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			lblTituloMesa.setText(mesas.get(0).getTitulo());
			lblturno1com.setText(mesas.get(0).getTurno1Comida());
			lblturno2com.setText(mesas.get(0).getTurno2Comida());
			lblturno3com.setText(mesas.get(0).getTurno3Comida());
			lblturno1cen.setText(mesas.get(0).getTurno1Cena());
			lblturno2cen.setText(mesas.get(0).getTurno2Cena());
			lblturno3cen.setText(mesas.get(0).getTurno3Cena());
			lblNombreCamarero.setText(mesas.get(0).getCamarero());
			}
		});
		btnMesa1.setToolTipText("");
		btnMesa1.setBounds(38, 106, 103, 83);
		contentPane.add(btnMesa1);
		
		JButton btnMesa2 = new JButton("Mesa 2 (2)");
		btnMesa2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText(mesas.get(1).getTitulo());
				lblturno1com.setText(mesas.get(1).getTurno1Comida());
				lblturno2com.setText(mesas.get(1).getTurno2Comida());
				lblturno3com.setText(mesas.get(1).getTurno3Comida());
				lblturno1cen.setText(mesas.get(1).getTurno1Cena());
				lblturno2cen.setText(mesas.get(1).getTurno2Cena());
				lblturno3cen.setText(mesas.get(1).getTurno3Cena());
				lblNombreCamarero.setText(mesas.get(1).getCamarero());
			}
		});
		btnMesa2.setToolTipText("");
		btnMesa2.setBounds(153, 106, 103, 83);
		contentPane.add(btnMesa2);
		
		JButton btnMesa3 = new JButton("Mesa 3 (2)");
		btnMesa3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText(mesas.get(2).getTitulo());
				lblturno1com.setText(mesas.get(2).getTurno1Comida());
				lblturno2com.setText(mesas.get(2).getTurno2Comida());
				lblturno3com.setText(mesas.get(2).getTurno3Comida());
				lblturno1cen.setText(mesas.get(2).getTurno1Cena());
				lblturno2cen.setText(mesas.get(2).getTurno2Cena());
				lblturno3cen.setText(mesas.get(2).getTurno3Cena());
				lblNombreCamarero.setText(mesas.get(2).getCamarero());
			}
		});
		btnMesa3.setToolTipText("");
		btnMesa3.setBounds(268, 106, 103, 83);
		contentPane.add(btnMesa3);
		
		JButton btnMesa4 = new JButton("Mesa 4 (4)");
		btnMesa4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText(mesas.get(3).getTitulo());
				lblturno1com.setText(mesas.get(3).getTurno1Comida());
				lblturno2com.setText(mesas.get(3).getTurno2Comida());
				lblturno3com.setText(mesas.get(3).getTurno3Comida());
				lblturno1cen.setText(mesas.get(3).getTurno1Cena());
				lblturno2cen.setText(mesas.get(3).getTurno2Cena());
				lblturno3cen.setText(mesas.get(3).getTurno3Cena());
				lblNombreCamarero.setText(mesas.get(3).getCamarero());
			}
		});
		btnMesa4.setToolTipText("");
		btnMesa4.setBounds(38, 205, 103, 83);
		contentPane.add(btnMesa4);
		
		JButton btnMesa5 = new JButton("Mesa 5 (4)");
		btnMesa5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText(mesas.get(4).getTitulo());
				lblturno1com.setText(mesas.get(4).getTurno1Comida());
				lblturno2com.setText(mesas.get(4).getTurno2Comida());
				lblturno3com.setText(mesas.get(4).getTurno3Comida());
				lblturno1cen.setText(mesas.get(4).getTurno1Cena());
				lblturno2cen.setText(mesas.get(4).getTurno2Cena());
				lblturno3cen.setText(mesas.get(4).getTurno3Cena());
				lblNombreCamarero.setText(mesas.get(4).getCamarero());
			}
		});
		btnMesa5.setToolTipText("");
		btnMesa5.setBounds(153, 205, 103, 83);
		contentPane.add(btnMesa5);
		
		JButton btnMesa6 = new JButton("Mesa 6 (4)");
		btnMesa6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText(mesas.get(5).getTitulo());
				lblturno1com.setText(mesas.get(5).getTurno1Comida());
				lblturno2com.setText(mesas.get(5).getTurno2Comida());
				lblturno3com.setText(mesas.get(5).getTurno3Comida());
				lblturno1cen.setText(mesas.get(5).getTurno1Cena());
				lblturno2cen.setText(mesas.get(5).getTurno2Cena());
				lblturno3cen.setText(mesas.get(5).getTurno3Cena());
				lblNombreCamarero.setText(mesas.get(5).getCamarero());
			}
		});
		btnMesa6.setToolTipText("");
		btnMesa6.setBounds(268, 205, 103, 83);
		contentPane.add(btnMesa6);
		
		JButton btnMesa7 = new JButton("Mesa 7 (6)");
		btnMesa7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText(mesas.get(6).getTitulo());
				lblturno1com.setText(mesas.get(6).getTurno1Comida());
				lblturno2com.setText(mesas.get(6).getTurno2Comida());
				lblturno3com.setText(mesas.get(6).getTurno3Comida());
				lblturno1cen.setText(mesas.get(6).getTurno1Cena());
				lblturno2cen.setText(mesas.get(6).getTurno2Cena());
				lblturno3cen.setText(mesas.get(6).getTurno3Cena());
				lblNombreCamarero.setText(mesas.get(6).getCamarero());
			}
		});
		btnMesa7.setToolTipText("");
		btnMesa7.setBounds(38, 299, 103, 83);
		contentPane.add(btnMesa7);
		
		JButton btnMesa8 = new JButton("Mesa 8 (6)");
		btnMesa8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText(mesas.get(7).getTitulo());
				lblturno1com.setText(mesas.get(7).getTurno1Comida());
				lblturno2com.setText(mesas.get(7).getTurno2Comida());
				lblturno3com.setText(mesas.get(7).getTurno3Comida());
				lblturno1cen.setText(mesas.get(7).getTurno1Cena());
				lblturno2cen.setText(mesas.get(7).getTurno2Cena());
				lblturno3cen.setText(mesas.get(7).getTurno3Cena());
				lblNombreCamarero.setText(mesas.get(7).getCamarero());
			}
		});
		btnMesa8.setToolTipText("");
		btnMesa8.setBounds(153, 299, 103, 83);
		contentPane.add(btnMesa8);
		
		JButton btnMesa9 = new JButton("Mesa 9 (6)");
		btnMesa9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText(mesas.get(8).getTitulo());
				lblturno1com.setText(mesas.get(8).getTurno1Comida());
				lblturno2com.setText(mesas.get(8).getTurno2Comida());
				lblturno3com.setText(mesas.get(8).getTurno3Comida());
				lblturno1cen.setText(mesas.get(8).getTurno1Cena());
				lblturno2cen.setText(mesas.get(8).getTurno2Cena());
				lblturno3cen.setText(mesas.get(8).getTurno3Cena());
				lblNombreCamarero.setText(mesas.get(8).getCamarero());
			}
		});
		btnMesa9.setToolTipText("");
		btnMesa9.setBounds(268, 299, 103, 83);
		contentPane.add(btnMesa9);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					int numMesa = Integer.parseInt(lblTituloMesa.getText().substring(5,6));
					VentanaAsignar va = new VentanaAsignar(numMesa,"RESERVAR");
					va.show();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Seleccione una mesa.");
				}
				
			}
		});
		btnReservar.setBounds(715, 393, 103, 23);
		contentPane.add(btnReservar);
		
		
		
		
		
		JButton btnCancelarReserva = new JButton("Cancelar Reserva");
		btnCancelarReserva.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numMesa = Integer.parseInt(lblTituloMesa.getText().substring(5,6));
				VentanaAsignar va = new VentanaAsignar(numMesa,"CANCELAR");
				va.show();
			}
		});
		btnCancelarReserva.setBounds(588, 393, 117, 23);
		contentPane.add(btnCancelarReserva);
		
		JButton btnAsignarCamarero = new JButton("Asignar Camarero");
		btnAsignarCamarero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int numMesa = Integer.parseInt(lblTituloMesa.getText().substring(5,6));
					VentanaAsignar va = new VentanaAsignar(numMesa);
					va.show();
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Seleccione una mesa.");
				}
				
			}
		});
		btnAsignarCamarero.setBounds(417, 393, 161, 23);
		contentPane.add(btnAsignarCamarero);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTituloMesa.setText("");
				lblturno1com.setText("");
				lblturno2com.setText("");
				lblturno3com.setText("");
				lblturno1cen.setText("");
				lblturno2cen.setText("");
				lblturno3cen.setText("");
				lblNombreCamarero.setText("");
			}
		});
		btnLimpiar.setBounds(729, 71, 89, 23);
		contentPane.add(btnLimpiar);
		
		JLabel lblNewLabel = new JLabel("*(2): 2 Personas - (4): 4 Personas - (6): 6 Personas");
		lblNewLabel.setBounds(38, 397, 333, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnQuitarCamarero = new JButton("Quitar Camarero");
		btnQuitarCamarero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int numMesa = Integer.parseInt(lblTituloMesa.getText().substring(5,6));
				mesas.get(numMesa-1).setCamarero("NINGUNO");
			}
		});
		btnQuitarCamarero.setBounds(417, 427, 161, 23);
		contentPane.add(btnQuitarCamarero);
	}
}
