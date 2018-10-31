package modules;

public class WebApplication extends Application implements Platform{

	public WebApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebApplication(String appName) {
		super(appName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPlatform() {
		
		System.out.println("Platform is browser");
	}
	
	
	
}
