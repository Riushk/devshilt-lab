package daalgavar1;

public class Rectangle {
	
	private Double width;
	private Double heigth;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Double width, Double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}
	
	public Double Area() {
		return width * heigth;
	}
	
	public Double Perimeter() {
		return (width + heigth) * 2; 
	}
	
	public Double getWidth() {
		return width;
	}
	
	public void setWidth(Double width) {
		this.width = width;
	}
	
	public Double getHeigth() {
		return heigth;
	}
	
	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}
}
