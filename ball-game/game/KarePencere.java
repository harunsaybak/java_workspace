package game;


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

	Cember cember;
	Hareket hrkt = new Hareket();
	

	int artis = 2;
	
	Cember[] cmbrlr;
	public KarePencere() {
		super();
		
		cmbrlr = new Cember[5];
		cmbrlr[0]=new Cember(40, 80, 20);
		cmbrlr[1]=new Cember(60, 100, 20);
		cmbrlr[2]=new Cember(80, 120, 20);
		cmbrlr[3]=new Cember(100, 140, 20);
		cmbrlr[4]=new Cember(120, 160, 20);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		cember = new Cember(200,200,gen);
		System.out.println(cember.gen);
		System.out.println(cember.x);
		System.out.println(cember.y);

		Timer zaman = new Timer(40, this);
		zaman.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		cember.ekranaCiz(g);
		
		for(int i =0; i<5;i++) {
			cmbrlr[i].ekranaCiz(g);
		}
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {

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
		
		hrkt.hareket(e.getX(), e.getY(),cmbrlr,cember);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
