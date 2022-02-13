package exam2;


public class LEDTV extends ElectronicProducts {

	private int size;
	private String quality;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
		
	// Include Constructor
	public LEDTV(String productId, String productname, String batchId, String dispatchDate, int warrantyYears, int size, String quality) {
		super(productId, productname, batchId, dispatchDate, warrantyYears);
		this.size=size;
		this.quality=quality;
	}	
	public double calculateProductPrice(){
		// Fill Code
		double price=0;
		if(this.getQuality().equals("Low"))
			price= (850*this.getSize());
		else if(this.getQuality().equals("Medium"))
			price= (1250*this.getSize());
		else if(this.getQuality().equals("High"))
			price=(1550*this.getSize());
		return price;
	}
}
