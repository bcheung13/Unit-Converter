package GUI;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConverterPanel extends JPanel{

	private String unit;
	private JTextField input;
	private JTextField output;
	private JComboBox<String> inputList;
	private JComboBox<String> outputList;
	
	public ConverterPanel(String unit) {
		this.unit = unit;	
		setLayout(null);
		input = new JTextField(20);
		output = new JTextField(20);
		inputList= new JComboBox<String>(measurements());
		outputList = new JComboBox<String>(measurements());

		this.add(input);
		this.add(output);
		this.add(inputList);
		this.add(outputList);
		
		//Set location
		input.setBounds(20, 70, 130, 20);
		inputList.setBounds(150,70,50,20);
		output.setBounds(245,70,130,20);
		outputList.setBounds(375,70,50,20);
			
		output.setEditable(false);
		input.setText("0.0");
		output.setText("0.0");
		
		input.addKeyListener((KeyListener) Listener());
		inputList.addActionListener(Listener());
		outputList.addActionListener(Listener());
	}
	
	
	private ActionListener Listener() {
		switch (this.unit){
		case "Mass":
			return new MassListener(input,inputList,output,outputList);
		case "Length":
			return new LengthListener(input,inputList,output,outputList);
		case "Volume":
			return new VolumeListener(input,inputList,output,outputList);
		default:
			return null;
		}
		
	}

	private String[] measurements() {
		switch (this.unit) {
		case "Mass":
			return new String[] {"kg","g", "mg", "t", "lb", "oz"};
		case "Length":
			return new String[] {"km", "m", "cm", "mm", "in", "ft", "yd", "mi"};
		case "Volume":
			return new String[] {"liter", "ml", "kl" ,"floz", "cup", "pt", "qt", "gal"};
		}
		return null;
	}

}
