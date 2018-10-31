import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Product p1= new Product(1,"Pen");
		
		String filename = "File1.txt";
		
		//serialization
		try {
			
			//saving object in file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//methods for serialization of objects
			out.writeObject(p1);
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");

			
		}
		catch(IOException e) {
			
			System.out.println("IOException is caught");
		}
		
		Product p2= null;
		
		//deserialization
		
		try {
			
			//Reading object in file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			//methods for deserialization of objects
			p2 = (Product)in.readObject();
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized");
			
			System.out.println("Product ID: "+p2.ID);
			System.out.println("Product name: "+p2.name);


			
		}
		catch(IOException e) {
			
			System.out.println("IOException is caught");
		}
		

	}

}
