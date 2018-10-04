package GUI;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Converter {

	private int width = 460;
	private int height = 250;
	
	private JFrame frame;
	
	public Converter() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame("Unit Converter");
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);	
		loadTabs();
		frame.setVisible(true);
	}
	
	private void loadTabs() {
		JTabbedPane tabs = new JTabbedPane();
		
		tabs.add("Mass", new ConverterPanel("Mass"));
		tabs.add("Length", new ConverterPanel("Length"));
		tabs.add("Volume", new ConverterPanel("Volume"));
		frame.add(tabs);
	}
	
}
