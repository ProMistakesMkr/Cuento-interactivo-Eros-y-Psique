package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Psique extends Object {

	PApplet app;
	PImage psique;
	
	public Psique(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		psique = app.loadImage("../resources/Sailboat.png");
	}

	protected void paintObject() {
		
		app.image(psique, posX, posY);
		
	}


	protected void paintInteraction() {
		
	}

	//This method is used in mouseDragged.
	//The object will take the position of the mouse each time the mouse is clicked in a sensitive zone.
	public void dragInteraction() {
		setPosX(app.mouseX);
		setPosY(app.mouseY);
	}

}
