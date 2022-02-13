package exam2;

public class ElectronicProducts {
	
	protected String productId;
	protected String productname;
	protected String batchId;
	protected String dispatchDate;
	protected int warrantyYears;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(String dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public int getWarrantyYears() {
		return warrantyYears;
	}
	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	public ElectronicProducts(String productId, String productname, String batchId, String dispatchDate,
			int warrantyYears) {
		this.productId = productId;
		this.productname = productname;
		this.batchId = batchId;
		this.dispatchDate = dispatchDate;
		this.warrantyYears = warrantyYears;
	}
	
	

}
