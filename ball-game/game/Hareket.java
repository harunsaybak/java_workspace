package game;

public class Hareket {
	
	
	Carpisma carp = new Carpisma();
	
	Hareket2 carpilan = new Hareket2();
	
	boolean[] state= {false,false,false,false,false};
	boolean carpis = false;
	
	public void hareket(int ex, int ey,Cember[] d,Cember cember) {
	
		// if(c.intersects(d[0])) {
		System.out.println("girdi");
		for(int i = 0; i<5; i++) {
			
			state[i] = carp.collides(ex,ey,d[i]);	
			//System.out.println(state);
		}
		
		for(int i = 0; i<5; i++) {
			
			if(state[i] == true)
			{
				carpis = true;
				carpilan.hareket(d[i]);
				break;
			}
			else
			{
				carpis =false;
			}
			
		}
		
		System.out.println("cikti");
		if(carpis == false) {
		cember.x = ex;
		cember.y = ey;
		//c.x = x;
		//c.y = y;
		//System.out.println("girdi");
		}
		// }

	}
	
	

}
