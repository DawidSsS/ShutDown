import java.io.IOException;

public class Timer implements Runnable {
	
	GUI gui;
	int time;
	boolean status;
	String shutdownCommand;
	
	
	public Timer(GUI gui) {
		this.gui = gui;
		time = Integer.parseInt(gui.input.getText());
		status = true;
		String system = System.getProperty("os.name");
		
		if (system.equals("Linux") || system.equals("Mac OS X"))
			shutdownCommand = "shutdown -h now";
		else if (system.equals("Windows"))
			shutdownCommand = "shutdown.exe -s -t 0";
		else {
			gui.screen.setText("Unsupported OS");
			gui.button_start.setEnabled(false);
			status = false;
			
		}
	}

	@Override
	public void run() {
		while (time > 0) {
			
			
			if (status) {
				gui.screen.setText(time+" min");
				time--;
				System.out.println("Test");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		gui.screen.setText("0 min");
		
		try {
			Runtime.getRuntime().exec(shutdownCommand);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
		
		
	}

}
