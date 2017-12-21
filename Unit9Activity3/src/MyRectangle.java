import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle
{
	private int x1, y1, x2, y2;
	private Color color;
	private boolean filled;

	public MyRectangle()
	{
		setX1(0);
		setY1(0);
		setX2(0);
		setY2(0);
		setColor(Color.BLACK);
		setFilled(false);
	}
	
	public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean filled) 
	{
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
		setColor(color);
		setFilled(filled);
	}
	
	private int getUpperLeftX()
	{
		return (getX1() < getX2()) ? getX1() : getX2();
	}
	
	private int getUpperLeftY()
	{
		return (getY1() < getY2()) ? getY1() : getY2();
	}
	
	private int getWidth()
	{
		return Math.abs(getX1() - getX2());
	}
	
	private int getHeight()
	{
		return Math.abs(getY1() - getY2());
	}

	public void draw(Graphics g)
	{
		g.setColor(color);
		g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		
		if (filled)
		{
			g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		}
	}
	
	public int getX1() 
	{
		return x1;
	}

	public void setX1(int x1) 
	{
		if (x1 >= 0)
		{
			this.x1 = x1;
		}
		else
		{
			this.x1 = x1;
		}
	}

	public int getY1() 
	{
		return y1;
	}

	public void setY1(int y1) 
	{
		if (y1 >= 0)
		{
			this.y1 = y1;
		}
		else
		{
			y1 = 0;
		}
	}

	public int getX2() 
	{
		return x2;
	}

	public void setX2(int x2)
	{
		if (x2 >= 0)
		{
			this.x2 = x2;
		}
		else
		{
			x2 = 0;
		}
	}

	public int getY2() 
	{
		return y2;
	}

	public void setY2(int y2) 
	{
		if (y2 >= 0)
		{
			this.y2 = y2;
		}
		else
		{
			y2 = 0;
		}
	}

	public Color getColor() 
	{
		return color;
	}

	public void setColor(Color color) 
	{
		this.color = color;
	}

	public boolean isFilled() 
	{
		return filled;
	}

	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}
}
