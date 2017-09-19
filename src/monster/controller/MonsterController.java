package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
public class MonsterController
{
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster fred = new MarshmallowMonster("silly Fred Monster",7,3,6.7, true);
		System.out.println(fred);
		System.out.println("I am felling hungry, I am going to eat one of fred's arms");
		fred.setArmCount(fred.getArmCount() - 1);
		System.out.println(fred);
		
		interactWithMonster(fred);
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, plase type in how many");
		int consumed = myScanner.nextInt();
		currentMonster.setArmCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
		
	System.out.println("how many arms are you interested in eating?, I have " + currentMonster.getArmCount());
	//consumed = myScanner.nextInt();
	int armEat = myScanner.nextInt();
		
	if (armEat == 0)
	{
		System.out.println("not hugray? oh so sad...");
	}
	else if(armEat < 0)
	{
		System.out.println("Reality is hard for you - it is impossinle to eat a negative amount");
	}
	else if(armEat - currentMonster.getArmCount() > 0)
	{
		System.out.println("You are not allowed to eat more than exist on me :/ :x");
	}
	else
	{
		currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
		System.out.println("ok,now i have this many arms " + currentMonster.getArmCount());
		
	}
	System.out.println("how many tentacles do you want to eat? i have " + currentMonster.getTentacleAmount());
	double food = myScanner.nextDouble();
	
	if(food == currentMonster.getTentacleAmount())
	{ 
		System.out.println("more likely");
	}
		myScanner.close();
	}
}

	