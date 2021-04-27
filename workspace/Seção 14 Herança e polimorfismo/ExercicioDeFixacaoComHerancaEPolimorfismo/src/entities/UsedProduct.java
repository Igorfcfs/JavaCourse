package entities;

import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactreDate) {
		super(name, price);
		this.manufactureDate = manufactreDate;
	}

	public Date getManufactreDate() {
		return manufactureDate;
	}

	public void setManufactreDate(Date manufactreDate) {
		this.manufactureDate = manufactreDate;
	}
	
	@Override
	public String priceTag() {
		return name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + manufactureDate + ")";
	}
	
}
