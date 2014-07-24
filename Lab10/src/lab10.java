import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.*;

import javax.swing.JFrame;

public class lab10 extends JFrame implements MouseMotionListener {
	
	int x = 325;
	int y = 325;
	int ranX;
	int ranY;
	
	public lab10(){
		super("The Elusive Ball");
		addMouseMotionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650,650);
		setVisible(true);	
	}
	
	public void color(Graphics g){
		super.paint(g);
		g.drawOval(getX(), getY(), 96, 96);
		g.setColor(Color.RED);
		g.fillOval(getX(), getY(), 96, 96);
	}
	
	public static void main(String [] args){
		lab10 lab = new lab10();
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		setCircle(e);
	}

	public void setCircle(MouseEvent me){
		
		int getX = me.getX();
		int getY = me.getY();
		
		Random ran = new Random();
		
		ranX = ran.nextInt(600-41)+41;
		ranY = ran.nextInt(600-41)+41;
		boolean getXInBounds = (getX == (ranX + 70));
		boolean getYInBounds = (getY == (ranY + 70));
		boolean getXInBounds2 = (getX == (ranX + 70));
		boolean getYInBounds2 = (getY == (ranY + 70));
		setX(ranX);
		setY(ranY);
		
		if(getXInBounds || getYInBounds || getXInBounds2 || getYInBounds2){
			repaint();
		}
	}
	
	public void setX(int m){
		x = m;
	}
	
	public void setY(int n){
		y = n;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
