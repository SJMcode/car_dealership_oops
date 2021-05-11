package car_dealership;

public class Vehicle {

	private String vehileName;
	private String vehicleType;
	private double vehiclePrice;
	private String vehicleColor;
	private String vehicleModel;
	
	
	public Vehicle(String vehileName, String vehicleType, double vehiclePrice, String vehicleColor,
			String vehicleModel) {
		super();
		this.vehileName = vehileName;
		this.vehicleType = vehicleType;
		this.vehiclePrice = vehiclePrice;
		this.vehicleColor = vehicleColor;
		this.vehicleModel = vehicleModel;
	}
	public String getVehileName() {
		return vehileName;
	}
	public void setVehileName(String vehileName) {
		this.vehileName = vehileName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	@Override
	public String toString() {
		return "Vehicle [vehileName=" + vehileName + ", vehicleType=" + vehicleType + ", vehiclePrice=" + vehiclePrice
				+ ", vehicleColor=" + vehicleColor + ", vehicleModel=" + vehicleModel + "]";
	}
	
	
}
