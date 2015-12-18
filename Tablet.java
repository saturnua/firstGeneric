package myPack;

public class Tablet extends Computer{
	
	String accesories = "stilus";

	Tablet(int powerSuply, int ram, String mainboard, String videocard, String stilus) {
		this.powerSuply = powerSuply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;	
		this.accesories = stilus;
	}

	@Override
	public void powerSwitch() {// скрыл реализацию ибо state берется в другом классе которого нет в данном примере, но суть думаю понятна
				/*if(state == 1){
					System.out.println("Switch turn on");
				}
				else{
					System.out.println("Switch turn off");
				}*/
	}
	@Override
	public String toString() {
	        return "Tablet includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
					+ videocard + "; and only tablet have " + accesories + " to help working with it";
	}
}