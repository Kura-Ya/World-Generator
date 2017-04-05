/*package depracated;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class worldDrawPanel extends JPanel {
	private static final long serialVersionUID = 6454257754826503749L;

	worldNameGenerator name_gen = new worldNameGenerator();
	String worldName = name_gen.gen();
    public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.drawString("Land of " + worldName, 10, 20);
		g.setColor(Color.YELLOW);
		g.fillRect(770, 10, 15, 15);
		g.setColor(Color.BLACK);
		g.drawString("Humans - ", 710, 20);
		g.setColor(Color.GREEN);
		g.fillRect(770, 40, 15, 15);
		g.setColor(Color.BLACK);
		g.drawString("Elves - ", 729, 50);
		
		g.drawRect(90, 90, 600, 600);
		
		
	} 
	
	public void paint(Graphics g) {
		
		super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON); 
       g2d.fillOval(x, y, 30, 30);	
	}
}
*/
