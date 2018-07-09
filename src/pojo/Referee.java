package pojo;

public class Referee {

	private String name;
	private int age;
	
	public Referee(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	private void giveFouls() {
		System.out.print("Fouls");
	};
	
	private void grantSubstitute() {
		System.out.print("Fouls");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	};
}
