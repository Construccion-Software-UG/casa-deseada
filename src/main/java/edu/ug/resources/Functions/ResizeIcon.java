package edu.ug.resources.Functions;

import edu.ug.view.Casa.ListCasa;

import java.awt.Image;

import javax.swing.ImageIcon;


public class ResizeIcon implements Function<ImageIcon>{

	private String imagePath;
	private int height;
	private int width;
	private ImageIcon finalIcon;
	
	public ResizeIcon(String imagePath,int height,int width) {
		// TODO Auto-generated constructor stub
		this.imagePath = imagePath;
		this.height = height;
		this.width = width;
			
		ImageIcon imageIcon = new ImageIcon(imagePath); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(this.height, this.width,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		this.finalIcon = new ImageIcon(newimg);  // transform it back
	}

	@Override
	public ImageIcon execute() {
		// TODO Auto-generated method stub
		return this.finalIcon;
	}

}
