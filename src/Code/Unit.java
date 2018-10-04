package Code;

public abstract class Unit {

	private double value;
	
	public Unit(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public void setValue(double val) {
		this.value = val;
	}
}
