package modules;

public class Software extends Technology implements License{

	String softwareName;
	String licenseType;
	
	public Software(String softwareName) {
		super();
		// TODO Auto-generated constructor stub
		this.softwareName=softwareName;
	}
	
	public Software() {
		super();
		// TODO Auto-generated constructor stub
		this.softwareName="";
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	@Override
	public void getLicenseType() {
		// TODO Auto-generated method stub
		
		///System.out.println("License : Utility");
		
		licenseType="Utility";
		
	}
	
	

}
