package Code;

public class Mass extends Unit {

	public Mass(double value) {
		super(value);
	}
	
	public Mass fromKilogram(){
		return this;
	}
	
	public Mass fromGram() {
		return new Mass(this.getValue()/1000);
	}
	
	public Mass fromMiligram() {
		return new Mass(this.getValue()/1000000);
	}
	
	public Mass fromTon() {
		return new Mass(this.getValue() * 1000);
	}
	
	public Mass fromPound() {
		return new Mass(this.fromTon().getValue()/2000);
	}
	
	public Mass fromOunce() {
		return new Mass(this.fromTon().getValue()/32000);
	}
	
	public double toKilogram() {
		return this.getValue();
	}
	
	public double toGram() {
		return this.getValue() * 1000;
	}
	
	public double toMilligram() {
		return this.toGram() * 1000;
	}
	
	public double toTon() {
		return this.toKilogram() / 1000;
	}
	
	public double toOunce() {
		return this.toKilogram() / 0.02834952;
	}
	public double toPound() {
		return this.toOunce() / 16;
	}
}
