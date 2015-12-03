package hqt.designpatterns.patterns.decorator;

public abstract class Beverage {
	private String description = "Unknown Beverage";
	private Size size = Size.GRANDE; //default

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return size;
	}
	
	public abstract double cost();
	
}