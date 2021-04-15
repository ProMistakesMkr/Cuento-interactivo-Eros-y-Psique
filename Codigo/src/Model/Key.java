package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Key extends Object {

	PApplet app;
	PImage key;
	

	
	public Key(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		
		this.app = app;
		key = app.loadImage("../resources/Friends.png");

	}
	
	protected void paintObject() {
		
		app.image(key, posX, posY);

	}

	protected void paintInteraction() {
		
		posX=700;
		posY=700;
		app.image(key, posX, posY);
        
	}

}
