package edu.ug.view.Proforma;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ShowProforma extends JInternalFrame {
	private JTextField txtNuevoClienteRegistrado;
	private JTextField textField;
	private JTextField txtCasaEsmeralda;
	private JTextField textField_2;
	private JTextField txtPorcenalato;
	private JTextField txtItaliana;
	private JTextField txtMultiLock;
	private JTextField txtAmericana;
	private JTextField txtAdoquinado;
	private JTextField txtAmericano;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	

	/**
	 * Create the frame.
	 */
	public ShowProforma() {
		setBounds(100, 100, 471, 489);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Nueva Cotizaci\u00F3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Generar Orden de Compra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(33, 33, 135, 20);
		panel_1.add(lblNewLabel_1);
		
		txtNuevoClienteRegistrado = new JTextField();
		txtNuevoClienteRegistrado.setEditable(false);
		txtNuevoClienteRegistrado.setText("Nuevo Cliente Registrado");
		txtNuevoClienteRegistrado.setBounds(178, 33, 205, 20);
		panel_1.add(txtNuevoClienteRegistrado);
		txtNuevoClienteRegistrado.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de Cotizaci\u00F3n: ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(33, 64, 135, 20);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setText("24/01/2021");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(178, 64, 205, 20);
		panel_1.add(textField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tipo de Casa: ");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(33, 95, 135, 20);
		panel_1.add(lblNewLabel_1_1_1);
		
		txtCasaEsmeralda = new JTextField();
		txtCasaEsmeralda.setText("Casa Esmeralda");
		txtCasaEsmeralda.setEditable(false);
		txtCasaEsmeralda.setColumns(10);
		txtCasaEsmeralda.setBounds(178, 95, 205, 20);
		panel_1.add(txtCasaEsmeralda);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Precio Base");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_2.setBounds(33, 126, 135, 20);
		panel_1.add(lblNewLabel_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setText("$ 80.000");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(178, 126, 205, 20);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Tipo de Piso: ");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_3.setBounds(33, 157, 135, 20);
		panel_1.add(lblNewLabel_1_1_3);
		
		txtPorcenalato = new JTextField();
		txtPorcenalato.setText("Porcenalato");
		txtPorcenalato.setEditable(false);
		txtPorcenalato.setColumns(10);
		txtPorcenalato.setBounds(178, 157, 106, 20);
		panel_1.add(txtPorcenalato);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Tipo de Grifer\u00EDa: ");
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_4.setBounds(33, 188, 135, 20);
		panel_1.add(lblNewLabel_1_1_4);
		
		txtItaliana = new JTextField();
		txtItaliana.setText("Italiana");
		txtItaliana.setEditable(false);
		txtItaliana.setColumns(10);
		txtItaliana.setBounds(178, 188, 106, 20);
		panel_1.add(txtItaliana);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Seguridad de las Puertas");
		lblNewLabel_1_1_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_3_1.setBounds(33, 219, 135, 20);
		panel_1.add(lblNewLabel_1_1_3_1);
		
		txtMultiLock = new JTextField();
		txtMultiLock.setText("Multi Lock");
		txtMultiLock.setEditable(false);
		txtMultiLock.setColumns(10);
		txtMultiLock.setBounds(178, 219, 106, 20);
		panel_1.add(txtMultiLock);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel("Tipo de Cocina: ");
		lblNewLabel_1_1_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_4_1.setBounds(33, 250, 135, 20);
		panel_1.add(lblNewLabel_1_1_4_1);
		
		txtAmericana = new JTextField();
		txtAmericana.setText("Americana");
		txtAmericana.setEditable(false);
		txtAmericana.setColumns(10);
		txtAmericana.setBounds(178, 250, 106, 20);
		panel_1.add(txtAmericana);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Tipo de Patio: ");
		lblNewLabel_1_1_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_3_2.setBounds(33, 281, 135, 20);
		panel_1.add(lblNewLabel_1_1_3_2);
		
		txtAdoquinado = new JTextField();
		txtAdoquinado.setText("Adoquinado");
		txtAdoquinado.setEditable(false);
		txtAdoquinado.setColumns(10);
		txtAdoquinado.setBounds(178, 281, 106, 20);
		panel_1.add(txtAdoquinado);
		
		JLabel lblNewLabel_1_1_4_2 = new JLabel("Tipo de Closet: ");
		lblNewLabel_1_1_4_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_4_2.setBounds(33, 312, 135, 20);
		panel_1.add(lblNewLabel_1_1_4_2);
		
		txtAmericano = new JTextField();
		txtAmericano.setText("Americano");
		txtAmericano.setEditable(false);
		txtAmericano.setColumns(10);
		txtAmericano.setBounds(178, 312, 106, 20);
		panel_1.add(txtAmericano);
		
		textField_8 = new JTextField();
		textField_8.setText("$ 500");
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(294, 157, 87, 20);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("$ 1500");
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(294, 188, 87, 20);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("$ 800");
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(294, 219, 87, 20);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("$ 5000");
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(294, 250, 87, 20);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("$ 9000");
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(294, 281, 87, 20);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("$ 1800");
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(294, 312, 87, 20);
		panel_1.add(textField_13);

	}
}
