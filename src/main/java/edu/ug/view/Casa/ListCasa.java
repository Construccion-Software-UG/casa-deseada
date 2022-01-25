package edu.ug.view.Casa;

import edu.ug.resources.Functions.ResizeIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ListCasa extends JInternalFrame {

	private JDesktopPane oDesktopPane;
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ListCasa() {
		setResizable(true);
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 757, 385);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		try {
			setMaximum(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Lista de Propiedades");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1);
		
		JPanel panel_2 = new JPanel();
		scrollPane_1.setViewportView(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Casa Esmeralda");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowCasa oShowCasa = new ShowCasa();
				getDesktopPane().add(oShowCasa);
				oShowCasa.setDesktopPane(getDesktopPane());
				oShowCasa.show();
			}
		});
		//btnNewButton.setIcon(new ResizeIcon("/resources/Images/casa_esmeralda.jpg",200,200).execute());

		//String userPath = System.getProperty("user.dir").toString();
		String userPath ="";
		String imageDir = "src/main/resources/Images/";
		String imageCasaEsmeralda = "casa_esmeralda.jpg";
		String imageCasaEuropa = "casa_europa.jpg";
		String imageCasaPlatino = "casa_platino.jpg";
		String imageCasaPrimavera = "casa_primavera.jpg";


		btnNewButton.setIcon(new ResizeIcon(imageDir+imageCasaEsmeralda,200,200).execute());


		//btnNewButton.setIcon(new ImageIcon());


		panel_4.add(btnNewButton, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("Casa Platino");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(lblNewLabel_1_1, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setEnabled(false);
		
		btnNewButton_1.setIcon(new ResizeIcon(imageDir+imageCasaPlatino,200,200).execute());
		panel_3.add(btnNewButton_1, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Casa Europa");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_5.add(lblNewLabel_1_1_1, BorderLayout.NORTH);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.setIcon(new ResizeIcon(imageDir+imageCasaEuropa,200,200).execute());
		panel_5.add(btnNewButton_1_1, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Casa Primavera");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_6.add(lblNewLabel_1_1_2, BorderLayout.NORTH);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setEnabled(false);
		btnNewButton_1_2.setIcon(new ResizeIcon(imageDir+imageCasaPrimavera,200,200).execute());
		panel_6.add(btnNewButton_1_2, BorderLayout.CENTER);

	}
	
	
	
	public void setDesktopPane(JDesktopPane oDesktopPane){
		this.oDesktopPane = oDesktopPane;
	}
	
	public JDesktopPane getDesktopPane() {
		return this.oDesktopPane;
	}

}
