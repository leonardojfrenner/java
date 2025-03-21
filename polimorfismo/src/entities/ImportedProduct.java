package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {	
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag(String name,Double price) {
		String priceTag = this.getName() + (double)totalPrice()+ (double)customsFee;
		return  priceTag;
	}

	@Override
	public String toString() {
		return this.getName()+" $"+ String.format("%.2f",totalPrice()) + " (Customs fee: $"+String.format("%.2f", customsFee) +")";
	}
	
	
	
	
	
	
}
