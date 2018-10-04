package Code;

public class Volume extends Unit{

	public Volume(Double val) {
		super(val);
	}
	
	public Volume fromLiter() {
		return this;
	}
	
	public Volume fromMililiter() {
		return new Volume(this.getValue() * 0.001);
	}
	
	public Volume fromKiloliter() {
		return new Volume(this.getValue() * 1000);
	}
	public Volume fromFluidOunce() {
		return new Volume(this.getValue() * 0.0295735);
	}

	public Volume fromCup() {
		return new Volume(this.getValue() * 0.24);
	}
	
	public Volume fromPint() {
		return new Volume(this.getValue() * 0.473176);
	}
	
	public Volume fromQuart() {
		return new Volume(this.getValue() * 0.946353);
	}
	
	public Volume fromGallon() {
		return new Volume(this.getValue() * 3.78541);
	}
	
	public Double toMililiter() {
		return this.getValue() * 1000;
	}
	
	public Double toKiloliter() {
		return this.getValue() * 0.001;
	}
	public Double toFluidOunce() {
		return this.getValue() * 33.814;
	}
	
	public Double toCup() {
		return this.getValue() * 4.16667;
	}
	
	public Double toPint() {
		return this.getValue() * 2.11338;
	}
	
	public Double toQuart() {
		return this.getValue() * 1.05669;
	}
	
	public Double toGallon() {
		return this.getValue() * 0.264172;
	}
}
