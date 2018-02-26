import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class JNumberTextField extends JTextField{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void processKeyEvent(KeyEvent e) {
		if (Character.isDigit(e.getKeyChar()) || e.getKeyCode()==8)
			super.processKeyEvent(e);
		e.consume();
	}

}
