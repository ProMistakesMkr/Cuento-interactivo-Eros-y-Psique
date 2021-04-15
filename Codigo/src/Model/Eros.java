package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Eros extends Object {

	PApplet app;
	PImage eros;
	PImage erosZoom;
	
	public Eros(int posx, int posy, PApplet app) {
		super(posx, posy, app);
		this.app = app;
		eros = app.loadImage("../resources/DemonSurrender.png");
		erosZoom = app.loadImage("../resources/DemonSurrenderZoom.png");
	}
	
	protected void paintObject() {

		app.image(eros, posX, posY);
	}

	protected void paintInteraction() {
		
		app.image(erosZoom, posX, posY);
	}

}
