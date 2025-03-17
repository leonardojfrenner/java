package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag(String name,Double price) {
		String priceTag = this.getName() + (Double) this.getPrice() +(Date)manufactureDate ; 
		return  priceTag;
	}

	@Override
	public String toString() {
		return this.getName()+ " (used) $" +  String.format("%.2f", this.getPrice())  + " (Manufacture date: " + sdf.format(manufactureDate)+")" ;
	}
	
	
	
}
