package entities;

public class Company extends TaxPayer{
	
	private int numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {
		double tax = 0.0;
		if(numberOfEmployees > 10) {
			tax = getAnualIncome() * 14/100;
		}
		else {
			tax = getAnualIncome() * 16/100;
		}
		return tax;
	}
	public String toString() {
		return getName() + " $" + String.format("%.2f", tax());
	}

}
