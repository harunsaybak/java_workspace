

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class KarePencere extends JPanel implements ActionListener, MouseListener,MouseMotionListener {

	 int x,y;

	 int gen=20;

	//Cember[] cemberler;
	Cember cember;
	
	
	//int cemberMevcut =0;
	//int cemberMax=10;

	int artis = 2;
	
	Dortgen[] kareler;
	public KarePencere() {
		super();
		
		kareler = new Dortgen[5];
		kareler[0]=new Dortgen(40, 80, 20, 20);
		kareler[1]=new Dortgen(60, 100, 20, 20);
		kareler[2]=new Dortgen(80, 120, 20, 20);
		kareler[3]=new Dortgen(100, 140, 20, 20);
		kareler[4]=new Dortgen(120, 160, 20, 20);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		cember = new Cember(200,200,gen);
		System.out.println(cember.gen);
		System.out.println(cember.x);
		System.out.println(cember.y);
		
		//x = 100;
	//	y = 100;
	//	yuk = 40;
//		gen = 30;

		Timer zaman = new Timer(40, this);
		zaman.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		cember.ekranaCiz(g);
		
		for(int i =0; i<5;i++) {
			kareler[i].ekranaCiz(g);
		}
		// g.drawOval(x, y, yuk, gen);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// yuk +=4;
		// gen +=4;
		
		//cember.genisle(artis);
		repaint();
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//cember.genisle(artis);
	
	//	Cember yeniCember = new Cember(e.getX(), e.getY(), 0);
		
		
	//	cemberler[cemberMevcut]=yeniCember;

	//	cemberMevcut++;
		
	
//
//		yuk = 0;
//		gen = 0;

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	//	System.out.println(e.getX());
	//	if(cember.intersects(kareler[0])) {
	//	cember.x = e.getX();
		//cember.y = e.getY();
	//	}
		
		cember.hareket(e.getX(), e.getY(),kareler,cember);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getX());
//		cember.x = e.getX();
//		cember.y = e.getY();
	}

}
