import processing.core.PApplet;

public class Burbuja {
	public int x, y;
	public int tam;
	public int r,g,b,h;

	public Burbuja(PApplet app, int x, int y) {
		this.x = x;
		this.y = y;
		tam= (int) (Math.random() );

	}

	public void pintar(PApplet app) {
		
		app.ellipse(x, y, tam, tam);
	}

	

	public void mover() {

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

}
