package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Listener implements ActionListener,KeyListener{

		private JTextField input;
		private JComboBox<String> inputUnit;
		private JTextField output;
		private JComboBox<String> outputUnit;
		public Listener(JTextField input, JComboBox<String> inputUnit, JTextField output, JComboBox<String> outputUnit) {
			this.input = input;
			this.inputUnit = inputUnit;
			this.output = output;
			this.outputUnit = outputUnit;
		}
		
		public boolean isEmpty() {
			return input.getText().isEmpty();
		}
		public Double getInputValue() {
			try {
				return Double.parseDouble(this.input.getText());
			}catch (NumberFormatException e){
				return null;
			}
		}
		
		public String getInputMeasurement() {
			return (String) this.inputUnit.getSelectedItem();
		}
		
		public String getOutputMeasurement() {
			return (String) this.outputUnit.getSelectedItem();
		}
		
		public void error() {
			// Display error message in output TextField
		    output.setText("Not a valid number");
		}
		
		public void setOutput(Double val) {

			output.setText(Double.toString(val));
		}


		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}



	
}
