import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Draws a bullseye and alternates the colors every second.
 * @author Daniel Ruano
 *
 */
@SuppressWarnings("serial")
public class Unit5Activity3Part1 extends JPanel 
{	
	
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		if ((int)(System.currentTimeMillis() / 1000.0) % 2 == 0)
		{
			g.setColor(Color.WHITE);
			g.fillOval(10,  10, 200, 200);
			
			g.setColor(Color.RED);
			g.fillOval(30,  30, 160, 160);
			
			g.setColor(Color.WHITE);
			g.fillOval(50,  50, 120, 120);
			
			g.setColor(Color.RED);
			g.fillOval(70,  70, 80, 80);
			
			g.setColor(Color.WHITE);
			g.fillOval(90,  90, 40, 40);
		}
		else
		{
			g.setColor(Color.BLUE);
			g.fillOval(10,  10, 200, 200);
			
			g.setColor(Color.DARK_GRAY);
			g.fillOval(30,  30, 160, 160);
			
			g.setColor(Color.BLUE);
			g.fillOval(50,  50, 120, 120);
			
			g.setColor(Color.DARK_GRAY);
			g.fillOval(70,  70, 80, 80);
			
			g.setColor(Color.BLUE);
			g.fillOval(90,  90, 40, 40);
		}
		repaint();
	}
	
	public static void main(String[] args) 
	{
		JFrame application = new JFrame("Bullseye");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(new Unit5Activity3Part1());
		application.setSize(235, 255);
		application.setVisible(true);
	}
}
