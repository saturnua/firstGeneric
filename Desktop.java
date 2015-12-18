package myPack;

public class Desktop extends Computer {

	String monitor = "Monitor";
	
	public Desktop(int powerSuply, int ram, String mainboard, String videocard, String monitor){
		this.powerSuply = powerSuply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;	
		this.monitor = monitor;
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
	        return "Desktop includes: " + powerSuply + "W powerSuply; " + ram + " RAM; " + "Mainboard " + mainboard + "; Videocard " 
	+ videocard + "; and only desktop have standing separately monitor " + monitor;
	}

}