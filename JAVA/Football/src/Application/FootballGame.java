package Application;

import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Lets Football" );
		
		Player captain = new Player();
		
		captain.setAge(25);
		
		captain.setFirstName("Messi");
		
		Player goalKeeper = new Player("afsar", 27);
		
		
		System.out.println("Captain name = " + captain.getFirstName() +" age = " + captain.getAge());

	}

}
