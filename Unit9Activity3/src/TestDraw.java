import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TestDraw 
{

	public static void main(String[] args) 
	{
		JFrame application = new JFrame();
		DrawPanel panel = new DrawPanel();
		
		JLabel statusBar = new JLabel();
		statusBar.setText(panel.getStatus());
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.add(statusBar, BorderLayout.SOUTH);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}
