package exam2;

public class AirConditioner extends ElectronicProducts{
	

	private String airConditionerType;
	private double capacity;
	public String getAirConditionerType() {
		return airConditionerType;
	}
	public void setAirConditionerType(String airConditionerType) {
		this.airConditionerType = airConditionerType;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public AirConditioner(String productId, String productname, String batchId, String dispatchDate,
			int warrantyYears,String airConditionerType, double capacity) {
		super(productId, productname, batchId, dispatchDate, warrantyYears);
		this.airConditionerType=airConditionerType;
		this.capacity=capacity;
	}
	// Include Constructor
	
	public double calculateProductPrice(){
		// Fill Code
		double price=0;
		if(this.getAirConditionerType().equals("Residential"))
		{
			if(this.getCapacity()==2.5)
				price=32000;
			else if(this.getCapacity()==4)
				price=40000;
			else if(this.getCapacity()==5.5)
				price=47000;
		}
		else if(this.getAirConditionerType().equals("Commercial"))
		{
			if(this.getCapacity()==2.5)
				price=40000;
			else if(this.getCapacity()==4)
				price=55000;
			else if(this.getCapacity()==5.5)
				price=67000;			
		}
		else if(this.getAirConditionerType().equals("Industrial"))
		{
			if(this.getCapacity()==2.5)
				price=47000;
			else if(this.getCapacity()==4)
				price=60000;
			else if(this.getCapacity()==5.5)
				price=70000;
		}

		return price;
	}

}
