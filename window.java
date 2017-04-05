package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ai.aiHandler;

public class window extends JPanel {
private static final long serialVersionUID = -3999883699170421283L;
	
worldNameGenerator name_gen = new worldNameGenerator();
	String worldName = name_gen.gen();

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.drawString("Land of " + worldName, 10, 20);
		g.setColor(Color.YELLOW);
		g.fillRect(770, 10, 15, 15);
		g.setColor(Color.BLACK);
		g.drawString("Humans - ", 710, 20);
		g.setColor(Color.BLUE);
		g.fillRect(770, 40, 15, 15);
		g.setColor(Color.BLACK);
		g.drawString("Elves - ", 729, 50);

		g.drawRect(90, 90, 600, 600);
		
		
	}

	static int x;
	static int y;

	static Color c;

	private static void give(int[] location, Color color) {

		x = location[0];
		y = location[1];

		c = color;

	}

	public void paint(Graphics g) {

		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(c);
		g2d.fillRect(x, y, 10, 10);

	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("World Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		window p = new window();
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
		frame.add(p, BorderLayout.CENTER);
		frame.pack();
		frame.setSize(801, 801);
		frame.setVisible(true);
			
		aiHandler ai = new aiHandler();
		ai.plant();
		
		while(true) {
		ai.simulate();
		
		
		frame.repaint();
		try {
		Thread.sleep(700);
		}
		catch(InterruptedException e) {
			
			System.out.println(e);
			
		}
		
		}
		
	}

}
