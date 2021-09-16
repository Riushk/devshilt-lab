package daalgavar3;

public class Employee implements B {

	private Double salaryTaxIncluded;
	private Double tax;
	private Double salary;
	
	@Override
	public void computeSalary() {
		salary = salaryTaxIncluded - tax;
	}

	@Override
	public void display() {
		System.out.println("This is employee");
	}

	public Employee() {
		super();
	}

	public Employee(Double salaryTaxIncluded, Double tax, Double salary) {
		super();
		this.salaryTaxIncluded = salaryTaxIncluded;
		this.tax = tax;
		this.salary = salary;
	}

	public Double getSalaryTaxIncluded() {
		return salaryTaxIncluded;
	}

	public void setSalaryTaxIncluded(Double salaryTaxIncluded) {
		this.salaryTaxIncluded = salaryTaxIncluded;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
