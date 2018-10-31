import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("File Operations");
		
		Scanner sc = null;
		Writer wr = null;
		
		try {
			
			sc = new Scanner(new File("File1.txt"));
			wr = new FileWriter(new File("File2.txt"));
			
			while(sc.hasNext()) {
				String nextLine= sc.nextLine();
				wr.write(nextLine + "\n");
				System.out.println(nextLine);
			}
			sc.close();
			wr.flush();
			wr.close();
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}

	}
}