package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Code.Length;

public class LengthListener extends Listener{

	public LengthListener(JTextField input, JComboBox<String> inputUnits, JTextField output, JComboBox<String> outputUnits) {
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
		Length l = new Length(getInputValue());
		
		switch (this.getInputMeasurement()){
			case "km":
				l = l.fromKilometer();
				break;
			case "mm":
				l = l.fromMilimeter();
				break;
			case "cm":
				l = l.fromCentimeter();
				break;
			case "in":
				l = l.fromInch();
				break;
			case "ft":
				l = l.fromFeet();
				break;
			case "yd":
				l = l.fromYard();
				break;
			case "mi":
				l = l.fromMiles();
				break;
		}

		switch (this.getOutputMeasurement()) {
			case "km":
				setOutput(l.toKilometer());
				break;
			case "mm":
				setOutput(l.toMilimeter());
				break;
			case "cm":
				setOutput(l.toCentimeter());
				break;
			case "in":
				setOutput(l.toInch());
				break;
			case "ft":
				setOutput(l.toFeet());
				break;
			case "yd":
				setOutput(l.toYard());
				break;
			case "mi":
				setOutput(l.toMiles());
				break;
			default:
				setOutput(l.getValue());
				break;
		}
	}


}
