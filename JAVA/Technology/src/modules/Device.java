package modules;

public class Device extends Hardware{
	
	String deviceName;
	float cost;
	
	public Device() {
		super();
		this.deviceName="";
		this.cost=0;
		// TODO Auto-generated constructor stub
	}

	public Device(String deviceName,float cost ) {
		super();
		this.deviceName=deviceName;
		this.cost=cost;
		// TODO Auto-generated constructor stub
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	
}
