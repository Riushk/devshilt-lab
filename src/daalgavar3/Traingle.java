package daalgavar3;

public class Traingle extends Shape {

	private Double base;
	private Double heigth;
	
	public Traingle(Double base, Double heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}

	@Override
	Double getArea() {
		return (base * heigth) / 2;
	}

	@Override
	public String toString() {
		return "Traingle [base=" + base + ", heigth=" + heigth + "]";
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}
	
}
