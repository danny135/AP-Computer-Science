import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Draws circles with circles inside.
 * @author Daniel Ruano
 *
 */
public class Unit4Activity2 extends JPanel 
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int halfWidth = getWidth()/2,
			halfHeight = getHeight()/2;
		
		for (int i = 1; i <= 12; i++)
		{
			int radius = 12*i, offset = 6*i;
			g.drawOval(halfWidth - offset, halfHeight - offset, radius, radius);
		}
	}
	
	public static void main(String[] args) 
	{	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Unit4Activity2());
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}
