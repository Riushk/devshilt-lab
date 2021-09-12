package daalgavar3;

public class Rectangle extends Shape {

	private Double length;
	private Double width;
	
	
	
	public Rectangle(Double length, Double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	Double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle [color=" + super.color + ", length=" + length + ", width=" + width + "]";
	}	
	
	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	
}
