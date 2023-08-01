import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Mypanel extends JPanel implements ActionListener {

	final int PANEL_WIDTH = 720;
	final int PANEL_HEIGHT = 600;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 1;
	int yVelocity = 2;
	int x = 0;
	int y = 0;

	Mypanel() {

		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("./src/back.jpg").getImage();
		backgroundImage = new ImageIcon("./src/space.jpg").getImage();
		timer = new Timer(10, this);
		timer.start();

	}

	public void paint(Graphics g) {

		super.paint(g);// this will paint the bg for us

		Graphics g2D = (Graphics2D) g;

		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (x > PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;

		if (y > PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		repaint();

	}

}
