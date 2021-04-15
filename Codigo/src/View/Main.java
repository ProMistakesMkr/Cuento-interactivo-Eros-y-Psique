package View;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet {

	PApplet app;
	public CompScreen compScreen;
	public FinalScreen finalScreen;
	String [] tale;
	ArrayList<String> finalTale;
	ArrayList<String> taleWords;
	int clickInteraction;
	int compSwitch;
	int interactionCounter;
	int activateKey;

	boolean keyInteraction;
	boolean nafInteraction;
	boolean erosInteraction;

	boolean firstInteraction;
	boolean secondInteraction;
	boolean thirdInteraction;
	boolean fourthInteraction;
	boolean fifthInteraction;

	public static void main(String[] args) {

		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size (1280, 720);
	}

}