import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class actionLis implements ActionListener{
	
	GUI gui;
	Timer timer;
	Thread th;
	
	public actionLis(GUI gui) {
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Method met = this.getClass().getMethod(gui.button_start.getText());
			met.invoke(this);
			
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void Go() {
		gui.input.setEditable(false);
		gui.button_start.setText("Pause");
		timer = new Timer(gui);
		th = new Thread(timer);
		th.start();
	}
	
	public void Pause() {
		gui.button_start.setText("Start");
		timer.status = false;
	}
	
	public void Start() {
		gui.button_start.setText("Pause");
		timer.status = true;
	}
	
	

}
