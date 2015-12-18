package myPack;

public abstract class Computer {
	int powerSuply;   
	int ram; 
	
	String mainboard; 
	String videocard; 

	public abstract void powerSwitch();
    public abstract String toString();
	
}