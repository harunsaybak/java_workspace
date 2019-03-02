
import java.awt.Graphics;
import java.awt.Rectangle;

public class Cember {

	Dortgen d;
	Cember c;

	public Cember(int x, int y, int gen) {
		super();
		this.x = x;
		this.y = y;
		this.gen = gen;
		
		// d= new Dortgen(x, y, gen, 20);
		// c = new Cember(x, y, gen);
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

		g.drawOval(x, y, gen, gen);
	}

	public void genisle(int i) {

		x = x - (i / 2);
		y = y - (i / 2);
		gen = gen + i;
	}
	boolean[] state= {false,false,false,false,false};
	boolean carpis = false;
	
	public void hareket(int ex, int ey,Dortgen[] d,Cember cember) {
	
		// if(c.intersects(d[0])) {
		System.out.println("girdi");
		for(int i = 0; i<5; i++) {
			
			state[i] = collides(ex,ey,d[i]);	
			//System.out.println(state);
		}
		
		for(int i = 0; i<5; i++) {
			
			if(state[i] == true)
			{
				carpis = true;
				break;
			}
			else
			{
				carpis =false;
			}
			
		}
		
		System.out.println("cikti");
		if(carpis == false) {
		this.x = ex;
		this.y = ey;
		//c.x = x;
		//c.y = y;
		//System.out.println("girdi");
		}
		// }

	}
	
	private boolean collides(int x, int y, Dortgen r1) {
		
		System.out.println(x + "  " + y);
		if( Math.abs(x - r1.x) <= (int)(20/2 +r1.gen/2) && Math.abs(y - r1.y) <= (int)(20/2 +r1.yuk/2)) {
			
			System.out.println(" c1.x " + x + " r1.x " + r1.x + " c1.gen/2 " + 20/2 + " r1.gen/2 " + r1.gen/2);
			System.out.println(" c1.y " + y + " r1.y " + r1.y + " c1.gen/2 " + 20/2 + " r1.gen/2 " + r1.gen/2);
			return true;
		}
		else {
	    return false;
	    // buyukse carpısma yoktur
		}
		}
	/*
	private boolean collides(Cember c1, Dortgen r1) {
		
		if( Math.abs(c1.x - r1.x) <= (int)(c1.gen/2 +r1.gen/2) && Math.abs(c1.y - r1.y) <= (int)(c1.gen/2 +r1.yuk/2)) {
			
			System.out.println(" c1.x " + c1.x + " r1.x " + r1.x + " c1.gen/2 " + c1.gen/2 + " r1.gen/2 " + r1.gen/2);
			System.out.println(" c1.y " + c1.y + " r1.y " + r1.y + " c1.gen/2 " + c1.gen/2 + " r1.gen/2 " + r1.gen/2);
			return true;
		}
		else {
	    return false;
	    // buyukse carpısma yoktur
		}
		}
	 */

}
