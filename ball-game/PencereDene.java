

import javax.swing.JFrame;

public class PencereDene {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*Pencerem pencere = new Pencerem();
		pencere.setSize(300,300);
		pencere.setVisible(true);
		*/
		
		JFrame pencere =new JFrame();
		pencere.add(new KarePencere());
		//pencere.add(new Dortgen());
		
		//KarePencere pencere = new KarePencere();
		pencere.setSize(400,400);
		pencere.setVisible(true);
		
	}

}
