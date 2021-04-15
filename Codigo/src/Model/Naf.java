package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Naf extends Object {

	PApplet app;
	PImage na;
	PImage naZoom;
	
	public Naf(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		na = app.loadImage("../resources/DemonFight.png");
		naZoom = app.loadImage("../resources/DemonFightZoom.png");
	}

	protected void paintObject() {
		
		app.image(na, posX, posY);
	}

	protected void paintInteraction() {
		
		app.image(naZoom, posX, posY);
	}

}
