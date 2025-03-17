package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax =0.0;
		if (getAnualIncome() < 20000.00) {
			tax = getAnualIncome() *15/100;
			if(healthExpenditures != null) {
				tax = tax - (healthExpenditures *0.50);
			}
		}
		if (getAnualIncome() > 20000.00) {
			tax = getAnualIncome() * 25/100 ;
			if(healthExpenditures != null) {
				tax = tax - (healthExpenditures * 50/100);
			}
		}
		return tax;
	}
	
	public String toString() {
		return getName() + " $" + String.format("%.2f", tax());
	}
	
	
}
