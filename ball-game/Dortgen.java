import java.awt.Graphics;

import javax.swing.JPanel;

public class Dortgen {
	int yuk;
	
	//Dortgen[] kareler;
	
	Dortgen d;
	public Dortgen(int x, int y, int gen,int yuk) {
		super();
//		kareler = new Dortgen[5];
//		
//		kareler[0]=new Dortgen(30, 80, 20, 20);
//		kareler[1]=new Dortgen(120, 180, 20, 20);
//		kareler[2]=new Dortgen(200, 20, 20, 20);
//		kareler[3]=new Dortgen(30, 150, 20, 20);
//		kareler[4]=new Dortgen(30, 250, 20, 20);
//		
		this.x = x;
		this.y = y;
		this.gen = gen;
		this.yuk=yuk;
	}
	
	

	int x, y;

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

	int gen;

	public void ekranaCiz(Graphics g) {

		g.drawRect(x, y, yuk, gen);
	}
	
	

}
