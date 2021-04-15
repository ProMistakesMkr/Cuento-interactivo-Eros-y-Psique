package View;

import Controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class CompScreen {
	
	PApplet app;
	PImage composition;
	public Controller control;
	
	public CompScreen (PApplet app) {
		
		this.app = app;
		control = new Controller(app);
		composition = app.loadImage("../resources/CompositionFix.png");
	}
	
	public void paintComposition() {
		app.image(composition,639.5f,359.5f);
	}
	
	
	public void paintPsique() {
		control.paintPsique();	
	}
	
	public void dragPsique() {
		
		control.dragPsique();
	}
	
	public void paintKey() {
		control.paintKey();
	}
	
	public void keyInteraction() {
		control.keyInteraction();
	}
	
	public void paintNAF() {
		control.paintNAF();
	}
	
	public void nafInteraction() {
		control.nafInteraction();
	}
	
	public void paintEros() {
		control.paintEros();
	}
	
	public void erosInteraction() {
		control.erosInteraction();
	}
	
	public void paintOilDrop() {
		control.paintOilDrop();
	}
	
	public void dragOilDrop() {
		control.dragOilDrop();
	}
	

	
}
