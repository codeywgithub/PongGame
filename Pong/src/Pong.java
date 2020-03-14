import javax.swing.JFrame;


public class Pong extends JFrame {
	
	public Pong() {
		setTitle("Pong");
		setSize(800, 600);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Opens up visual window in the above specs
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Pong();
		//seems to initialize the above specs window with main method.
		
		
	}

}
