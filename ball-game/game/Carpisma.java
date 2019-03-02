package game;

public class Carpisma {
	
	

	public boolean collides(int x, int y, Cember r1) {
		
		System.out.println(x + "  " + y);
		if( Math.abs(x - r1.x)*Math.abs(x - r1.x) + Math.abs(y - r1.y)*Math.abs(y - r1.y) <= (int)(20/2 +r1.gen/2)*(int)(20/2 +r1.gen/2)) {
			
			System.out.println(" c1.x " + x + " r1.x " + r1.x + " c1.gen/2 " + 20/2 + " r1.gen/2 " + r1.gen/2);
			System.out.println(" c1.y " + y + " r1.y " + r1.y + " c1.gen/2 " + 20/2 + " r1.gen/2 " + r1.gen/2);
			return true;
		}
		else {
	    return false;
	    // buyukse carpısma yoktur
		}
		}
	

}
