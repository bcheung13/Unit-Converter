package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Code.Mass;

public class MassListener extends Listener{

	public MassListener(JTextField input, JComboBox<String> inputUnits, JTextField output, JComboBox<String> outputUnits) {
		// TODO Auto-generated constructor stub
		super(input, inputUnits, output, outputUnits);

	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		this.evaluate();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		this.evaluate();
	}
	
	private void evaluate() {
		if(this.isEmpty()) {
			setOutput(0.0);
			return;
		}
		if(this.getInputValue() == null) {
			error();
			return;
		}
		Mass m = new Mass(getInputValue());
		
		switch (this.getInputMeasurement()){
			case "g":
				m = m.fromGram();
				break;
			case "mg":
				m = m.fromMiligram();
				break;
			case "t":
				m =m.fromTon();
				break;
			case "lb":
				m = m.fromPound();
				break;
			case "oz":
				m = m.fromOunce();
				break;
		}

		switch (this.getOutputMeasurement()) {
			case "g":
				setOutput(m.toGram());
				break;
			case "mg":
				setOutput(m.toMilligram());
				break;
			case "t":
				setOutput(m.toTon());
				break;
			case "lb":
				setOutput(m.toPound());
				break;
			case "oz":
				setOutput(m.toOunce());
				break;
			default:
				setOutput(m.getValue());
				break;
		}
	}

}
