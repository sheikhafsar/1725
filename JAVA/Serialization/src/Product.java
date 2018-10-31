import java.io.Serializable;

public class Product implements Serializable{
	
	int ID;
	String name;
	
	public Product(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	

}
