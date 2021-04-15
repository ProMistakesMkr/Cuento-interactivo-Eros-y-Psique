package Model;

import processing.core.PApplet;

public class Interaction extends PApplet{

	PApplet app;
	public Psique psique;
	public Object key;
	public Object naf;
	public Object eros;
	public OilDrop oildrop;

	
	public Interaction(PApplet app) {
		
		this.app=app;
		psique = new Psique(250, 500, app);
		key = new Key(450, 680, app);
		naf = new Naf(820, 105, app);
		eros = new Eros(1025, 525, app);
		oildrop = new OilDrop(1140, 360, app);
	
		
	}
	
	public void paintPsique() {
	
		psique.paintObject();
	}
	
	public void dragPsique() {
		
		psique.dragInteraction();
	}
	
	
	public void paintKey() {
		
		key.paintObject();
	}
	
	public void keyInteraction() {
		key.paintInteraction();
	}
	
	public void paintNAF() {
		
		naf.paintObject();
	}
	
	public void nafInteraction() {
		naf.paintInteraction();
	}
	
	public void paintEros() {
	
		eros.paintObject();
	}
	
	public void erosInteraction() {
		eros.paintInteraction();
	}
	
	public void paintOilDrop() {
	
		oildrop.paintObject();
	}
	
	public void dragOilDrop() {
		
		oildrop.dragInteraction();
	}

}
