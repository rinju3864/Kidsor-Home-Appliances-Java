package exam2;

public class MicrowaveOven extends ElectronicProducts {
	

	private int quantity;
	private String quality;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
		
	// Include Constructor
	public MicrowaveOven(String productId, String productname, String batchId, String dispatchDate, int warrantyYears, int quantity, String quality) {
		super(productId, productname, batchId, dispatchDate, warrantyYears);
		this.quality=quality;
		this.quantity=quantity;
	}	
	public double calculateProductPrice(){
		// Fill Code
		double price=0;
		if(this.getQuality().equals("Low"))
			price= (1250*this.getQuantity());
		else if(this.getQuality().equals("Medium"))
			price= (1750*this.getQuantity());
		else if(this.getQuality().equals("High"))
			price=(2000*this.getQuantity());
		return price;
	}

}
