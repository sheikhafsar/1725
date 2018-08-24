package pojo;

public class Player {

	private String firstName;
	private int age;
	
	
	/**
	 * @return the firstName
	 */
	public Player() {
		firstName = "";
		age = 0;
	}
	
	public Player(String firstName,int age) {
		
		this.firstName = firstName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	
	
	private void kick() {
		System.out.println("Kick");
	}
}
