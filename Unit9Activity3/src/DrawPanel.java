import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawPanel extends JPanel 
{
	private Random rand = new Random();
	private MyLine[] lines;
	private MyRectangle[] rects;
	private MyOval[] ovals;
	
	public DrawPanel() 
	{
		setBackground(Color.WHITE);
		
		lines = new MyLine[1 + rand.nextInt(5)];
		rects = new MyRectangle[1 + rand.nextInt(5)];
		ovals = new MyOval[1 + rand.nextInt(5)];
		
		for (int i = 0; i < lines.length; i++)
		{
			int x1 = rand.nextInt(300);
			int y1 = rand.nextInt(300);
			int x2 = rand.nextInt(300);
			int y2 = rand.nextInt(300);
			
			Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			
			lines[i] = new MyLine(x1, y1, x2, y2, color);
		}
		
		for (int i = 0; i < rects.length; i++)
		{
			int x1 = rand.nextInt(300);
			int y1 = rand.nextInt(300);
			int x2 = rand.nextInt(300);
			int y2 = rand.nextInt(300);
			
			Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			
			rects[i] = new MyRectangle(x1, y1, x2, y2, color, rand.nextBoolean());
		}
		
		for (int i = 0; i < ovals.length; i++)
		{
			int x1 = rand.nextInt(300);
			int y1 = rand.nextInt(300);
			int x2 = rand.nextInt(300);
			int y2 = rand.nextInt(300);
			
			Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			
			ovals[i] = new MyOval(x1, y1, x2, y2, color, rand.nextBoolean());
		}
	}
	
	public String getStatus() 
	{
		return " Lines: " + lines.length + ", Rectangles: " + rects.length + ", Ovals: " + ovals.length;
	}

	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		for (MyLine line:lines)
		{
			line.draw(g);
		}
		
		for (MyRectangle rect:rects)
		{
			rect.draw(g);
		}
		
		for (MyOval oval:ovals)
		{
			oval.draw(g);
		}
	}
}
