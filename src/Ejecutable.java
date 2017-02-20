import java.util.ArrayList;

import processing.core.PApplet;

public class Ejecutable extends PApplet {
	ArrayList<Burbuja> burbujas;

	public static void main(String[] args) {
		PApplet.main("Ejecutable");

	}
	

	public void settings() {
		size(1200, 700);
	}

	public void setup() {
		burbujas=new ArrayList();

	}

	public void draw() {
		background(0);
		ellipse(50, 50, 50, 50);

	}

}
