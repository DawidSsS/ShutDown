import java.awt.*;
import javax.swing.*;

public class GUI {
	public JFrame frame;
	public JButton button_start;
	public JLabel screen;
	public JNumberTextField input;
	
	public GUI() {
		
		Font font_screen = new Font("Dialog", Font.PLAIN, 30);
		Font font_button = new Font("Dialog", Font.PLAIN, 12);
		Font font_input = new Font("Dialog", Font.PLAIN, 16);
		
		frame = new JFrame("Shutdown");
		frame.setSize(new Dimension(300, 400));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		frame.add(panel);
		
		screen = new JLabel("0 min");
		screen.setFont(font_screen);
		screen.setSize(new Dimension());
		screen.setHorizontalAlignment(JLabel.CENTER);
		screen.setVerticalAlignment(JLabel.CENTER);
		panel.add(screen);
		
		JPanel panel_down = new JPanel();
		panel_down.setLayout(new GridLayout(2, 1));
		panel.add(panel_down);
		
		JPanel panel_input = new JPanel();
		panel_input.setLayout(new BorderLayout());
		panel_down.add(panel_input);
		
		input = new JNumberTextField();
		input.setFont(font_input);
		input.setHorizontalAlignment(JLabel.RIGHT);
		input.setPreferredSize(new Dimension(250, 30));
		panel_input.add(input, BorderLayout.PAGE_START);
		
		JLabel info = new JLabel("Czas w minutach");
		info.setFont(font_input);
		info.setVerticalAlignment(JLabel.TOP);
		info.setHorizontalAlignment(JLabel.CENTER);
		panel_input.add(info, BorderLayout.CENTER);
		
		button_start = new JButton("Go");
		button_start.setFont(font_button);
		button_start.addActionListener(new actionLis(this));
		panel_down.add(button_start);
		
		frame.setVisible(true);
		
	}
	
	
}
