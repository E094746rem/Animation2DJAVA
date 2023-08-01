import javax.swing.JFrame;

public class Myframe extends JFrame {
	Mypanel panel;

	Myframe() {

		panel = new Mypanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
