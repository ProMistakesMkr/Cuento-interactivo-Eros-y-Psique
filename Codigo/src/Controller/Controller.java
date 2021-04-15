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

}