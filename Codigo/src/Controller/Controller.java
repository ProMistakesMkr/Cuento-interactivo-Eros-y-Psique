package Controller;

import Model.Interaction;
import processing.core.PApplet;



public class Controller {
	
	PApplet app;
	public Interaction interaction;
	
	public Controller(PApplet app) {
		this.app = app;
		interaction = new Interaction(app);
		
		
	}

	public void paintPsique() {
		interaction.paintPsique();	
	}
	
	public void dragPsique() {
		
		interaction.dragPsique();
	}
	
	public void paintKey() {
		interaction.paintKey();
	}
	
	public void keyInteraction() {
		interaction.keyInteraction();
	}
	
	public void paintNAF() {
		interaction.paintNAF();
	}
	
	public void nafInteraction() {
		interaction.nafInteraction();
	}
	
	public void paintEros() {
		interaction.paintEros();
	}
	
	public void erosInteraction() {
		interaction.erosInteraction();
	}
	
	public void paintOilDrop() {
		interaction.paintOilDrop();
	}
	
	public void dragOilDrop() {
		
		interaction.dragOilDrop();
	}
	
}
