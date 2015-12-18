package myPack;

public class Laptop extends Computer{
	String accesories = "bag";

	Laptop(int powerSuply, int ram, String mainboard, String videocard, String bag) {
		this.powerSuply = powerSuply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;	
		this.accesories = bag;
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
	        return "Laptop includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
					+ videocard + "; and only laptop have " + accesories + " for its carry";
	}
}

