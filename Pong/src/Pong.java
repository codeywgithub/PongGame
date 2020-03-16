import javax.swing.JFrame;

public class Pong extends JFrame {
	
	private final static String WINDOW_TITLE = "Pong";
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;
	
	
	
	public Pong() {
		add(new PongPanel());
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
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
