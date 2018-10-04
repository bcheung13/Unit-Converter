package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Code.Volume;

public class VolumeListener extends Listener{

	public VolumeListener(JTextField input, JComboBox<String> inputUnits, JTextField output, JComboBox<String> outputUnits) {
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
		Volume v = new Volume(getInputValue());
		
		switch (this.getInputMeasurement()){
			case "ml":
				v = v.fromMililiter();
				break;
			case "kl":
				v = v.fromKiloliter();
				break;
			case "floz":
				v = v.fromFluidOunce();
				break;
			case "cup":
				v = v.fromCup();
				break;
			case "pt":
				v = v.fromPint();
				break;
			case "qt":
				v = v.fromQuart();
				break;
			case "gal":
				v = v.fromGallon();
				break;
		}

		switch (this.getOutputMeasurement()) {
			case "ml":
				setOutput(v.toMililiter());
				break;
			case "kl":
				setOutput(v.toKiloliter());
				break;
			case "floz":
				setOutput(v.toFluidOunce());
				break;
			case "cup":
				setOutput(v.toCup());
				break;
			case "pt":
				setOutput(v.toPint());
				break;
			case "qt":
				setOutput(v.toQuart());
				break;
			case "gal":
				setOutput(v.toGallon());
				break;
			default:
				setOutput(v.getValue());
				break;
		}
	}
}
