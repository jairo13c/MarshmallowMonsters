package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController {

	private MonsterDisplay popup;

	public MonsterController()
	{
		popup = new MonsterDisplay();
	}

	public void start()
	{
		int count = 0;
		while(count< 10)
	    {
			popup.displayText("Am i not the coolest??");
			count+=2;	
	    }

		MarshmallowMonster basic = new MarshmallowMonster();
		//System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster fred = new MarshmallowMonster("silly Fred Monster",7,3,6.7, true);
		//System.out.println(fred);
		popup.displayText(fred.toString());
		//System.out.println("I am felling hungry, I am going to eat one of fred's arms");
		popup.displayText("I am felling hungray, i am going to eat one of fred's arms");
		fred.setArmCount(fred.getArmCount() - 1);
		//System.out.println(fred);
		popup.displayText(fred.toString());
		
		interactWithMonster(fred);
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		//System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, plase type in how many");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + "wants to know how many eyes you want to eat , place type how many");
		
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		//int consumed = myScanner.nextInt();
		currentMonster.setArmCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		System.out.println("how many arms are you interested in eating?, I have " + currentMonster.getArmCount());
		response = popup.getResponse("");
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
		
		System.out.println("how many tentacles do you want to eat? i have " + currentMonster.getTentacleAmount());
		
		double food = 0.0;
		String tentacleResponse = popup.getResponse("");
		if(isValidDouble(tentacleResponse))
		{
			food =Double.parseDouble(tentacleResponse);
		}
	
		if(food == currentMonster.getTentacleAmount())
		{ 
		System.out.println("more likely");
		}
		
		popup.displayText("Hi there ready to play???");
		String answer = popup.getResponse("what is the air speedof cout laden swllow?");
		System.out.println(answer);
	
		}
		myScanner.close();
	
	}
	//helper methods
	private boolean isValidInteger(String sample) {
		boolean valid=false;
		try
		{
			Integer.parseInt(sample);
			valid=true;
		}
		catch(NumberFormatException error)
		{
		popup.displayText("you need to inut an int, " + sample + " is not valid.");
		}
		return valid;
	}
	
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("you need to type in a double - " + sampleDouble + " is not valid answer.");
		}
			return valid;
}

	
	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid=true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Type in a boolean value" + sampleBoolean + " does not count.");;
		}
		
		return valid;
	}
}	