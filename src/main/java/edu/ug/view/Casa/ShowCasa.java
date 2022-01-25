package edu.ug.view.Casa;

import edu.ug.resources.Functions.ResizeIcon;
import edu.ug.view.Proforma.ShowProforma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowCasa extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	private JDesktopPane oDesktopPane;

	/**
	 * Create the frame.
	 */
	public ShowCasa() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(20, 20, 1200, 600);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Casa Esmeralda");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		String userPath = System.getProperty("user.dir").toString();
		String imageDir = "\\src\\main\\java\\edu\\ug\\resources\\Images\\";
		String imageCasaEsmeralda = "casa_esmeralda.jpg";


		JLabel lblNewLabel_1 = new JLabel("");
		//lblNewLabel_1.setIcon(new ResizeIcon("../../resources/Images/casa_esmeralda.jpg",300,300).execute());
		lblNewLabel_1.setIcon(new ResizeIcon(userPath+imageDir+imageCasaEsmeralda,200,200).execute());
		panel_3.add(lblNewLabel_1, BorderLayout.WEST);
		
		String textoCasaEsmeralda = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n";
		String metros2Casa = "Dimensiones: 85 metros cuadrados.\n";
		String cantHabitacionesCasa = "Cantidad de Habitaciones: 2 habitaciones.\n";
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textPane.setText(textoCasaEsmeralda + metros2Casa + cantHabitacionesCasa);
		textPane.setEditable(false);
		panel_3.add(textPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de Piso: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(92, 87, 207, 31);
		panel_2.add(lblNewLabel_2);
		
		
		
		String[] lstTipoPiso = { "Seleccione Uno","Porcelanato" };
		JComboBox comboBox = new JComboBox(lstTipoPiso);
		comboBox.setBounds(309, 90, 168, 31);
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tipo de Grifer\u00EDa: ");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_2_1.setBounds(92, 129, 207, 34);
		panel_2.add(lblNewLabel_2_1);
		
		String[] lstTipoGriferia = { "Seleccione Uno","Italiana" };
		JComboBox comboBox_1 = new JComboBox(lstTipoGriferia);
		comboBox_1.setBounds(309, 132, 168, 31);
		panel_2.add(comboBox_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Seguridad en las Puertas: ");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_2_1_1.setBounds(92, 174, 207, 34);
		panel_2.add(lblNewLabel_2_1_1);
		
		String[] lstTipoSeguridadPuerta = { "Seleccione Uno","Multi Lock" };
		JComboBox comboBox_1_1 = new JComboBox(lstTipoSeguridadPuerta);
		comboBox_1_1.setBounds(309, 177, 168, 31);
		panel_2.add(comboBox_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tipo de Cocina: ");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_2_2.setBounds(618, 87, 207, 31);
		panel_2.add(lblNewLabel_2_2);
		
		String[] lstTipoCocina = { "Seleccione Uno","Americana" };
		JComboBox comboBox_2 = new JComboBox(lstTipoCocina);
		comboBox_2.setBounds(835, 90, 168, 31);
		panel_2.add(comboBox_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Tipo de Patio: ");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2_1.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_2_2_1.setBounds(618, 129, 207, 31);
		panel_2.add(lblNewLabel_2_2_1);
		
		String[] lstTipoPatio = { "Seleccione Uno","Adoquinado" };
		JComboBox comboBox_2_1 = new JComboBox(lstTipoPatio);
		comboBox_2_1.setBounds(835, 132, 168, 31);
		panel_2.add(comboBox_2_1);
		
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Tipo de Closet: ");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2_1_1.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_2_2_1_1.setBounds(618, 174, 207, 31);
		panel_2.add(lblNewLabel_2_2_1_1);
		
		String[] lstTipoCloset = { "Seleccione Uno","Americano" };
		JComboBox comboBox_2_1_1 = new JComboBox(lstTipoCloset);
		comboBox_2_1_1.setBounds(835, 177, 168, 31);
		panel_2.add(comboBox_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Personaliza la Casa de tus Sue\u00F1os");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_3.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_2_3.setBounds(73, 31, 404, 31);
		panel_2.add(lblNewLabel_2_3);
		
		JButton btnNewButton = new JButton("Generar Cotizaci\u00F3n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowProforma oShowProforma = new ShowProforma();
				getDesktopPane().add(oShowProforma);
				oShowProforma.show();
			}
		});
		btnNewButton.setBounds(835, 35, 168, 31);
		panel_2.add(btnNewButton);

		
		
	}
	
	public void setDesktopPane(JDesktopPane oDesktopPane){
		this.oDesktopPane = oDesktopPane;
	}
	
	public JDesktopPane getDesktopPane() {
		return this.oDesktopPane;
	}
	
	
}
