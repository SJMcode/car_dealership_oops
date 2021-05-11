package car_dealership;

public class Customers {

	private String customerName;
	private double cashOnHand;
	private String address;

	
	
	public Customers(String customerName, double cashOnHand, String address) {
		super();
		this.customerName = customerName;
		this.cashOnHand = cashOnHand;
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCashObHand() {
		return cashOnHand;
	}

	public void setCashObHand(double cashObHand) {
		this.cashOnHand = cashObHand;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += " Dealership City";
		this.address = address;
	}

	public void purchaseCar(Vehicle vehicle, Employer emp, boolean finance) {

		
		emp.handleCustomer(this, finance, vehicle);
		
	}
		
		
}
