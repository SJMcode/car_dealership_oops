package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		
		Customers cust = new Customers("Safir",10000,"Doha Street 986 zone 56");
		Customers cust1 = new Customers("Jameel",12000,"Alwaab");
		Customers cust2 = new Customers("Ahamed", 17000,"Garaffa Street 346 zone 56");
		Employer emp= new Employer("Mohamed","Sales & marketing","Aziziya");
		Employer emp1= new Employer("Saleh","marketing","AinKhalid");
		Employer emp2= new Employer("Mohamed","Sales & marketing","Aziziya");
		Vehicle veh = new Vehicle("BMW","SUV",12500,"Blue","X3");
		Vehicle veh1 = new Vehicle("BENZ","SUV",15000,"Blue","GL6");
		Vehicle veh2 = new Vehicle("AUDI","SUV",17500,"Black","Q7");

		
		cust.purchaseCar(veh, emp, false);
		cust1.purchaseCar(veh1, emp1, true);
		cust2.purchaseCar(veh2, emp2, false);
		cust2.purchaseCar(veh1, emp2, false);
		
		
		
	}

}
