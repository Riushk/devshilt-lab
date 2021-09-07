package daalgavar3;

 abstract class Shape {
	public String color;
	
	public Shape() {
		color = "colorless";
	}
	
	abstract Double getArea();

	public abstract String toString();
	
	public void setColor(String c) {
		color = c; 
	}
	
	public String getColor() { 
		return color; 
	}
	
}
