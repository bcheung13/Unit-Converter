package Code;

public class Length extends Unit{

	public Length(Double value) {
		super(value);
	}
	
	public Length fromMeter() {
		return this;
	}
	
	public Length fromKilometer() {
		return new Length(this.getValue() * 1000);
	}
	
	public Length fromCentimeter() {
		return new Length(this.getValue() * 0.01);
	}
	
	public Length fromMilimeter() {
		return new Length(this.getValue() * 0.001);
	}

	public Length fromInch() {
		return new Length(this.getValue() * 0.0254);
	}
	
	public Length fromFeet() {
		return new Length(this.getValue() * 0.3048);
	}
	
	public Length fromYard() {
		return new Length(this.getValue() * 0.9144);
	}
	
	public Length fromMiles() {
		return new Length(this.getValue() * 1852);
	}
	
	public Double toMeter() {
		return this.getValue();
	}
	
	public Double toKilometer() {
		return this.getValue() * 0.001;
	}
	
	public Double toCentimeter() {
		return this.getValue() * 100;
	}
	
	public Double toMilimeter() {
		return this.getValue() * 1000;
	}
	
	public Double toInch() {
		return this.getValue() * 39.3701;
	}
	
	public Double toFeet() {
		return this.getValue() * 3.28084 ;
	}
	
	public Double toYard() {
		return this.getValue() * 1.09361;
	}
	
	public Double toMiles() {
		return this.toYard() * 0.000568182;
	}
}
