package modules;

public class Hardware extends Technology implements License{

	int componentCount;
	String hwName;
	
	
	public Hardware(String componentName, int componentCount) {
		super();
		this.componentCount=componentCount;
		this.hwName=componentName;
		// TODO Auto-generated constructor stub
	}
	


	public Hardware() {
		super();
		componentCount=0;
		hwName="";
		//this.componentCount=componentCount;
		// TODO Auto-generated constructor stub
	}
	public int getComponentCount() {
		return componentCount;
	}

	public void setComponentCount(int componentCount) {
		this.componentCount = componentCount;
	}



	public String getHwName() {
		return hwName;
	}



	public void setHwName(String hwName) {
		this.hwName = hwName;
	}



	@Override
	public void getLicenseType() {
		// TODO Auto-generated method stub
		System.out.println("License : Proprietary");
	}

}
