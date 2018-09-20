
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> team=new ArrayList<>();
		
		team.add("ram");
		team.add("rohan");
		team.add("sahil");
		
		for(String i :team)
		{
			System.out.println(""+i);
		}
		
		System.out.println("===========================");
		
		List<Student> students=new ArrayList<>();
		
		Student stu=new Student("Afsar",1725);
		students.add(stu);
		
		students.add(new Student("roy",1701));
		students.add(new Student("sameer",1702));
		students.add(new Student("gayatri",1703));
		
		System.out.println("Looping using For ");
		for(Student j:students)
		{
			System.out.println(""+j.getRollno()+" "+j.getName());
			
		}
		
		System.out.println("Looping using Iterator ");
		
		Iterator<Student> myIterator=students.iterator();
		while(myIterator.hasNext())
		{
			Student stud;
			stud=myIterator.next();
			System.out.println(""+stud.getRollno()+" "+stud.getName());
		}

	}

}
