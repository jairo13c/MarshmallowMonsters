package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members
	
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmout;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//initializes everything to 0, false or null.
	}
	public  MarshmallowMonster(String name, int eyeCount, int arms, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmout = tentacleCount;
		this.hasBloop = hasBloop;
	}
	
	public String getName()
	{
		return name;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public int getArmCount()
	{
		return armCount;
	}
	public boolean hasBloop()
	{
		return hasBloop;
	}
	public double getTentacleAmount()
	{
		return tentacleAmout;
	}
	public void setName(String name)
	{
		this.eyeCount = eyeCount;
	}
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmout = tentacleAmount;
	}
	
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "I am a cooky monster, my name is "+ name + ", I have " + eyeCount + " eyes and only ";
		description += tentacleAmout + " tentacles but i have " + armCount + " arms." + hasBloop + " tells you";
		description+= " if i have a bloop";
		return description;
		
	}
}





