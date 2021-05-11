package car_dealership;

public class Employer {

	private String empoyeeName;
	private String employeeDesignation;
	private String address;

	public Employer(String empoyeeName, String employeeDesignation, String address) {
		super();
		this.empoyeeName = empoyeeName;
		this.employeeDesignation = employeeDesignation;
		this.address = address;
	}

	public String getEmpoyeeName() {
		return empoyeeName;
	}

	public void setEmpoyeeName(String empoyeeName) {
		this.empoyeeName = empoyeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void handleCustomer(Customers cust, boolean finance, Vehicle vehicle) {
	
	if(finance == true) {
		
		double loanAmount = vehicle.getVehiclePrice() - cust.getCashObHand();
		
		runCreditHistory(cust, loanAmount);
	}
	else if(vehicle.getVehiclePrice() <= cust.getCashObHand()) {
		
		processTransaction(cust, vehicle);
		
	}
	
	}
		
	public void runCreditHistory(Customers cust, double loanAmount) {
		
		System.out.println("Customer has been approved to purchase the vehicle");
	}
	
	public void processTransaction(Customers cust, Vehicle veh) {
		
		System.out.println("Customer has purchased vehicle: "+veh+", at price : "+veh.getVehiclePrice());
			
	}
	


}
