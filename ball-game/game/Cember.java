package game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Cember {

	Cember c;
	int x, y;
	int gen;

	
	public Cember(int x, int y, int gen) {
		super();
		this.x = x;
		this.y = y;
		this.gen = gen;
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

	public int getGen() {
		return gen;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}

	public void ekranaCiz(Graphics g) {

		g.drawOval(x, y, gen, gen);
	}

}
