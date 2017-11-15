import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Anibal Pagan Ventura");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(800, 400);
		myFrame.setSize(210, 160);
		myFrame.setVisible(true);
		
	     MyPanelClass myPanel = new MyPanelClass();
         myFrame.getContentPane().add(myPanel);
	}
}