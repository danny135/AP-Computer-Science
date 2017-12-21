import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Draws random rectangles and ovals with random size, location, and color.
 * @author Daniel Ruano
 *
 */
@SuppressWarnings("serial")
public class Unit5Activity3Part2 extends JPanel 
{	
	private int randomInt(int range)
	{
		return (int) Math.floor(Math.random() * (++range));
	}
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		int x, y, width, height;
		
		for (int i = 0; i < 10; i++)
		{	
			x = randomInt(getWidth());
			y = randomInt(getHeight());
			width = randomInt(getWidth()/2);
			height = randomInt(getHeight()/2);
			
			g.setColor(new Color( randomInt(255), randomInt(255), randomInt(255) ));
			
			if (randomInt(1) == 1)
			{
				g.fillOval(x, y, width, height);
			}
			else
			{
				g.fillRect(x, y, width, height);
			}
		}
	}

	public static void main(String[] args) 
	{
		JFrame application = new JFrame("Shapes");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(new Unit5Activity3Part2());
		application.setSize(500, 500);
		application.setVisible(true);
	}
}
